package springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by drake on 19/02/18.
 *
 * @author P.Pridorozhny
 */
@Controller
public class HelloWorldController {

    //show HTML form
    @RequestMapping("/showform")
    public String showForm() {
        return "hello_world-form";
    }

    //process HTML form
    @RequestMapping("/processForm")
    public String processForm() {
        return "hello_world";
    }

}
