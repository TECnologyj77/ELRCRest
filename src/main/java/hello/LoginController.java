package hello;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletResponse;

/**
 * Created by Jen on 2/25/2017.
 */

public class LoginController {
    @RequestMapping("admin/login")
    public NewArtist newArtist() {
        return null;
    }

    @RequestMapping(value = "/admin/login", method = RequestMethod.POST)
    public HttpStatus addNewArtist(@RequestBody final Login login, HttpServletResponse response) {
        System.out.println(login.getPermission());
        response.setStatus(HttpServletResponse.SC_OK);
        return HttpStatus.OK;
    }
}
