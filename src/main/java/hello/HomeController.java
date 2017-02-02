package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by Thomas on 1/24/2017.
 */

@RestController
public class HomeController {

    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/home/featuredPodcasts")
    public Home home(@RequestParam(value = "name", defaultValue = "none") String name, @RequestParam(value = "desc", defaultValue = "N/A")String desc, @RequestParam(value = "embedded", defaultValue = "none")String url){
        return new Home(counter.getAndIncrement(), String.format(name), String.format(desc), String.format(url));
    }
}
