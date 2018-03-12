package springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by drake on 12/03/18.
 *
 * @author P.Pridorozhny
 */
@Controller
@RequestMapping("/student")
public class StudentController {

    @RequestMapping("/showForm")
    public String showForm(Model model) {


        Student student = new Student();

        model.addAttribute("student", student);

        return "student-form";

    }

}
