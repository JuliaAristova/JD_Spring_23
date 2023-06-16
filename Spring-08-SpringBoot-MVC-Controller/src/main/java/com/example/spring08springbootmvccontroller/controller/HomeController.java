package com.example.spring08springbootmvccontroller.controller;

import jakarta.websocket.server.PathParam;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/*
- number of Controllers is not limited
- Controller - Business logic
- FrontController checks for a required controller
- RequestMapping (class/method level)
- http request (http://ozzy.com/user-create
- return - what template you want to display
- method name is not important, FrontController looks for RequestMapping parameter
- usually name is refers to CRUD operations
 */
@Controller
public class HomeController {

    @RequestMapping("/")
    public String getRequestMapping() {
        return "Home";          //resources-templates-Home.html
    }
    //all 3 requests will show home page
    @RequestMapping("/demo")
    public String getRequestMapping2() {
        return "home";          //resources-templates-Home.html
    }

    //for UI design only Get and Post request methods are used
    @RequestMapping(method= RequestMethod.GET, value = "/demo2")
    public String getRequestMapping3() {
        return "Home";          //resources-templates-Home.html
    }
    @RequestMapping(method= RequestMethod.POST, value = "/demo2")
    public String getRequestMapping4() {
        return "Home";          //resources-templates-Home.html
    }

    //Instead of @RequestMapping with method parameter
    //we can yse GetMapping or PostMapping
    @GetMapping("/demo3")
    public String getRequestMapping5() {
        return "home";
    }

    @PostMapping("/demo3")
    public String postRequestMapping6() {
        return "home";
    }

    //PATH PARAMETER  - PATH VARIABLE {name}
    @GetMapping("/home/{name}")
    public String  getPathParam(@PathVariable("name") String name) {
        System.out.println("name is " + name);
        return "home";
    }
    @GetMapping("/home/{name}/{email}")
    public String  getPathParam2(@PathVariable("name") String name, @PathVariable("email") String email) {
        System.out.println("name is " + name);
        System.out.println("email is " + email);
        return "home";
    }

    //QUERY PARAMETER
    //in browser enter http://localhost:8080/home/course?course=api
    @GetMapping("/home/course")
    public String  requestParam(@RequestParam("course") String course) {
        System.out.println("name is " + course);
        return "home";
    }

    //http://localhost:8080/home/course
    //http://localhost:8080/home/course2?course2=selenium
    @GetMapping(value="home/course2")
    public String  requestParam2(@RequestParam(value = "course2", required = false, defaultValue = "java") String name) {
        System.out.println("name is " + name);
        return "home";
    }
}
