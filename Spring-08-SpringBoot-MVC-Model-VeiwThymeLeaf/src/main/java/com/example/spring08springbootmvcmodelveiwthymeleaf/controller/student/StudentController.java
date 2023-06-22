package com.example.spring08springbootmvcmodelveiwthymeleaf.controller.student;

import com.example.spring08springbootmvcmodelveiwthymeleaf.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Controller
@RequestMapping("/student")
public class StudentController {

    @GetMapping("/welcome")
    public String homePage(Model model) {
        //2 parameters - attribute and values - can come from anywhere
        model.addAttribute("name", "Gary");
        model.addAttribute("course", "SpringBoot");
        model.addAttribute("instructor", "Ozzy");

        String subject = "MVC";
        model.addAttribute("subject", subject);

        int id = new Random().nextInt(1000);
        model.addAttribute("id", id);

        List<Integer> numbers = new ArrayList<>();
        numbers.add(4);
        numbers.add(5);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        model.addAttribute("numbers", numbers);

        //print DoB
        LocalDate birthday = LocalDate.now().minusYears(53);
        model.addAttribute("dob", birthday);

        Student student = new Student(1, "Tom", "Smith");
       //model object - we want to transfer to UI
        model.addAttribute("student", student);

        return "student/welcome";

    }
    @GetMapping("/register")
    public String homePage2(){
        return  "student/register";
    }

}
