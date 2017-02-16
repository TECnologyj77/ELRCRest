package hello;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
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

    @RequestMapping(value = "/admin/newArtist", method = RequestMethod.POST)
    public HttpStatus addNewArtist(@RequestBody final User user, HttpServletResponse response) {
        System.out.println(user.getFirstName() + " " + user.getLastName());
        response.setStatus(HttpServletResponse.SC_OK);
        return HttpStatus.OK;
    }
}
