package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;
import java.util.ArrayList;

@RestController
@RequestMapping("shows/artistShow")
public class ShowController {

    @Autowired
    private ShowDao showDao;

    public void saveShowList(){

        ArrayList<Show> buildDBShows = new ArrayList<Show>();

        buildDBShows.clear();

        buildDBShows.add(new Show("The Greg Show", "Greg Show Description", "Show Image", "DJ Greg", "Embedded URL", "Podcast Title", "Podcast Desc"));
        buildDBShows.add(new Show("The Corporal Show", "Corporal Show Description", "Show Image", "DJ Ryan", "Embedded URL", "Podcast Title", "Podcast Desc"));
        buildDBShows.add(new Show("The Tom Cruise Show", "Tom Cruise Show Description", "Show Image", "DJ Tom", "Embedded URL", "Podcast Title", "Podcast Desc"));
        buildDBShows.add(new Show("The TwinTurbo Show", "TwinTurbo Show Description", "Show Image", "DJ Nate", "Embedded URL", "Podcast Title", "Podcast Desc"));
        buildDBShows.add(new Show("The DJ Khalid Show", "DJ Khalid Show Description", "Show Image", "DJ Khalid", "Embedded URL", "Podcast Title", "Podcast Desc"));
        buildDBShows.add(new Show("The KSweg Show", "KSweg Show Description", "Show Image", "DJ Kenny Fresh", "Embedded URL", "Podcast Title", "Podcast Desc"));

        showDao.save(buildDBShows);
    }

    @RequestMapping(method = RequestMethod.GET)
    public ArrayList<Show> getShow() throws SQLException {

        if (showDao.findOne((long) 1) == null) {
            saveShowList();
        }

        Iterable<Show> showFromDB = new ArrayList<Show>();

        ArrayList<Show> shows = new ArrayList<Show>();

        for (Show item : showFromDB){
            shows.add(item);
        }
        return shows;
    }

    @RequestMapping(method = RequestMethod.POST)
    public long addShow(@RequestBody Show input) throws SQLException {

        Show added = showDao.save(input);

        return added.getShowID();
    }
}
