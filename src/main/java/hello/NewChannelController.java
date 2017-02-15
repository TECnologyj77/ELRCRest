package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by Thomas on 2/4/2017.
 */

@RestController
public class NewChannelController {

    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("admin/newChannel")
    public NewChannel newChannel() {
        return null;
    }
}
