package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class ShowController {

    @Autowired
    private ShowDao showDao;

    @RequestMapping("/shows/artistShow")
    public Show show(@RequestParam(value = "show_name", defaultValue = "none") String name,
                     @RequestParam(value = "showDesc", defaultValue = "none") String showDesc,
                     @RequestParam(value = "show_image", defaultValue = "none") String show_image,
                     @RequestParam(value = "dj_name", defaultValue = "none") String dj_name,
                     @RequestParam(value = "embedded_url", defaultValue = "none") String url,
                     @RequestParam(value = "podcast_title", defaultValue = "none") String podcast_title,
                     @RequestParam(value = "podcast_desc", defaultValue = "none") String podcast_desc) {

        ArrayList<Show> buildDBShows = new ArrayList<Show>();

        buildDBShows.add(new Show("The Greg Show", "Greg Show Description", "Show Image", "DJ Greg", "Embedded URL", "Podcast Title", "Podcast Desc"));
        buildDBShows.add(new Show("The Corporal Show", "Corporal Show Description", "Show Image", "DJ Ryan", "Embedded URL", "Podcast Title", "Podcast Desc"));
        buildDBShows.add(new Show("The Tom Cruise Show", "Tom Cruise Show Description", "Show Image", "DJ Tom", "Embedded URL", "Podcast Title", "Podcast Desc"));
        buildDBShows.add(new Show("The TwinTurbo Show", "TwinTurbo Show Description", "Show Image", "DJ Nate", "Embedded URL", "Podcast Title", "Podcast Desc"));
        buildDBShows.add(new Show("The DJ Khalid Show", "DJ Khalid Show Description", "Show Image", "DJ Khalid", "Embedded URL", "Podcast Title", "Podcast Desc"));
        buildDBShows.add(new Show("The KSweg Show", "KSweg Show Description", "Show Image", "DJ Kenny Fresh", "Embedded URL", "Podcast Title", "Podcast Desc"));

        for (int i = 0; i < buildDBShows.size(); i++) {
            showDao.save(buildDBShows.get(i));
        }

        Show getShow = showDao.findOne((long) 3);
        return showDao.save(getShow);

    }
}
