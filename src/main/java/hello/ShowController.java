package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.awt.Image;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by Thomas on 1/24/2017.
 */

@RestController
public class ShowController {

    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/shows/artistShow")
    public Show show(@RequestParam(value = "show_name", defaultValue = "none") String name, @RequestParam(value = "desc", defaultValue = "N/A")String desc, @RequestParam(value = "embedded_url", defaultValue = "none")String url, @RequestParam(value = "dj_name", defaultValue = "none") String dj_name, @RequestParam(value = "dj_desc", defaultValue = "N/A") String dj_desc, @RequestParam(value = "dj_image", defaultValue = "image.jpg")String  dj_image){
        return new Show(counter.getAndIncrement(), String.format(name), String.format(desc), String.format(url) , String.format(dj_name), String.format(dj_desc), String.format(dj_image));
    }
}
