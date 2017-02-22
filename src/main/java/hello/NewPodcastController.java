package hello;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class NewPodcastController {


        private final AtomicLong counter = new AtomicLong();

        @RequestMapping("admin/newPodcast")
        public NewPodcast newPodcast() {
            return null;
        }

    @RequestMapping(value = "/admin/newPodcast", method = RequestMethod.POST)
    public HttpStatus addNewPodcast(@RequestBody final Podcast podcast, HttpServletResponse response) {
        System.out.println(podcast.getTitleOfPodcast() + " " + podcast.getPodcastURL() + " " + podcast.getPodcastDescription() + " " + podcast.getShowID());
        response.setStatus(HttpServletResponse.SC_OK);
        return HttpStatus.OK;
    }
}
