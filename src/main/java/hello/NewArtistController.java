package hello;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

import javax.servlet.http.HttpServletResponse;


@RestController
public class NewArtistController {

    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("admin/newArtist")
    public NewArtist newArtist() {
        return null;
    }

    @RequestMapping(value = "/admin/newArtist", method = RequestMethod.POST)
    public HttpStatus addNewArtist(@RequestBody final NewArtist user, HttpServletResponse response) {
        System.out.println(user.getFirstName() + " " + user.getLastName() + " " + user.getDJName()
                + " " + user.getArtistDesc() + " " + user.getArtistImage());
        response.setStatus(HttpServletResponse.SC_OK);
        return HttpStatus.OK;
    }
}
