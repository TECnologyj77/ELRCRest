package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class ShowController {

    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/shows/artistShow")
    public Show show(@RequestParam(value = "show_name", defaultValue = "none") String name,
                     @RequestParam(value = "showDesc", defaultValue = "N/A")String showDesc,
                     @RequestParam(value = "show_image", defaultValue = "image.jpg")String  show_image,
                     @RequestParam(value = "dj_name", defaultValue = "none") String dj_name,
                     @RequestParam(value = "embedded_url", defaultValue = "none")String url,
                     @RequestParam(value = "podcast_title", defaultValue = "none")String podcast_title,
                     @RequestParam(value = "podcast_desc", defaultValue = "N/A") String podcast_desc){


        return new Show(counter.getAndIncrement(), String.format(name), String.format(showDesc), String.format(show_image), String.format(url),
                String.format(dj_name), String.format(podcast_title), String.format(podcast_desc));
    }
}
