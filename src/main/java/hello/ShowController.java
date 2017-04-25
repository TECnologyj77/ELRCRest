package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;
import java.util.ArrayList;

@RestController
@RequestMapping({"shows/artistShow", "home/featuredPodcasts"})
public class ShowController {

    @Autowired
    private ShowDao showDao;

    public void saveShowList(){

        ArrayList<Show> buildDBShows = new ArrayList<Show>();

        buildDBShows.clear();

        buildDBShows.add(new Show("The Greg Show", "Greg's Show is all about driving trucks, programming like a beast and rocking out with his sun glasses! Check out more below!", "http://4.bp.blogspot.com/-_Cp_LYXcz5A/UkybJXQaBOI/AAAAAAAACQ4/rBOSLvLgRk8/s250-c/chuck+norris.jpg", "DJ Greg", "https://www.youtube.com/embed/Lb9q1ScC4cg", "Greg's Best Hits", "The very best from Greg Lang! Check it out!"));
        buildDBShows.add(new Show("The Corporal Show", " The Corporal's Show is all about sarcasm, terrible programming and listening to mediocre music!!!", "https://cdn1.bigcommerce.com/server3400/v4eyu8t/products/2016/images/2332/Sarcasm_Superpower__15223.1427319758.250.250.jpg?c=2", "DJ Ryan", "https://www.youtube.com/embed/Wns1cpPYV30", "The Sarcasm Podcast", "This podcast is all about sarcasm or is it!?!?!?"));
        buildDBShows.add(new Show("The Tom Cruise Show", "Tom Cruise's Show is all about speed, speed and his buddy Goose. Poor Goose.", "https://images-na.ssl-images-amazon.com/images/I/41qPd9GrnHL._AC_UL320_SR250,320_.jpg", "DJ Tom", "https://www.youtube.com/embed/t8Lcn5kOCMQ", "Remembering Goose", "Goose, say it ain't so..........!!"));
        buildDBShows.add(new Show("The TwinTurbo Show", "TwinTurbo's Show has no chill, attempts to be edgy and lacks serious programming skills.", "https://cdn.meme.am/cache/instances/folder414/250x250/68384414.jpg", "DJ Nate", "https://www.youtube.com/embed/hNjs3gRqGL8", "Stay Classy San Diego", "The very best from my favorite guy, Ron Burgandy. You stay classy."));
        buildDBShows.add(new Show("The DJ Khalid Show", "DJ Khalid's Show isn't for the faint of heart!!", "http://mp3waxx.com/wp-content/uploads/2013/04/dj_khaled-news-article41813-250x250.png", "DJ Khalid", "https://www.youtube.com/embed/LdE3WlQ__GY", "All We Do is Win - Remix", "DJ Khaled, do I need to say anymore?"));
        buildDBShows.add(new Show("The KSweg Fresh Show", "KSweg's Show is straight by the book, check out more below!", "http://static.episode39.it/character/10825.jpg?t=1389533600", "DJ Kenny Fresh", "https://www.youtube.com/embed/1nCqRmx3Dnw", "Now this is a story..", "It doesn't get anymore fresh than KSweg and his boi the Fresh Prince of BelAir!"));

        showDao.save(buildDBShows);
    }

    @RequestMapping(method = RequestMethod.GET)
    public ArrayList<Show> getShow() throws SQLException {

        if (showDao.findOne((long) 1) == null) {
            saveShowList();
        }

        Iterable<Show> showFromDB = showDao.findAll();

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
