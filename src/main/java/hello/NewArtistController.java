package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by Thomas on 1/24/2017.
 */

@RestController
public class NewArtistController {

    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("admin/newArtist")
    public NewArtist newArtist() {
        return null;
    }
}
