package com.example.spring08springbootmvcmodelveiwthymeleaf.controller.mentor;

import com.example.spring08springbootmvcmodelveiwthymeleaf.enums.Gender;
import com.example.spring08springbootmvcmodelveiwthymeleaf.model.Mentor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/mentor")
public class MentorController {

    //Spring checks template folder --> we need to indicate subfolders
    @GetMapping("/welcome")
    public String homePage() {
        return "/student/register";
    }


    @GetMapping("/list")
    public String showTable(Model model) {
        List<Mentor> mentorList = new ArrayList<>();
        mentorList.add(new Mentor("Mike", "Smith", 45, Gender.MALE));
        mentorList.add(new Mentor("Tom", "Harrison", 54, Gender.MALE));
        mentorList.add(new Mentor("Amy", "Belcher", 62, Gender.FEMALE));
        mentorList.add(new Mentor("Sophia", "Longster", 35, Gender.FEMALE));
        mentorList.add(new Mentor("Gary", "Bestman", 59, Gender.MALE));

        model.addAttribute("mentors", mentorList);

        return "mentor/mentorList";
    }
}
