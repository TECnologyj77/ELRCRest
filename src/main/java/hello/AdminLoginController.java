package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by Thomas on 2/4/2017.
 */
@RestController
public class AdminLoginController {

     @RequestMapping("admin/login")
            public AdminLogin adminLogin(@RequestParam(value = "title", defaultValue = "N/A") String title){
                return new AdminLogin(String.format(title));
            }
        }

