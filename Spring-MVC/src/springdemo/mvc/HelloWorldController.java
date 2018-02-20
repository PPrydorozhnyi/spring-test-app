package springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by drake on 19/02/18.
 *
 * @author P.Pridorozhny
 */
@Controller
@RequestMapping("/hello")
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

    //work with model
    @RequestMapping("/processFormV2")
    public String modelConversion(HttpServletRequest request, Model model) {

        String userName = request.getParameter("yName");

        String result = userName.toUpperCase() + "!";

        model.addAttribute("message", result);

        return "hello_world";
    }

    @RequestMapping("/processFormV3")
    public String readParam(@RequestParam("yName")  String studentName, Model model) {

        studentName = studentName.toUpperCase() + ", dude";

        model.addAttribute("message", studentName);

        return "hello_world";
    }

}
