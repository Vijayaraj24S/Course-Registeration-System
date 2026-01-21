package com.example.Course.Registeration.System.Controller;

import com.example.Course.Registeration.System.Model.Course;
import com.example.Course.Registeration.System.Model.CourseRegistry;
import com.example.Course.Registeration.System.Service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = {"http://localhost:5500","http://127.0.0.1:5500"})
@RequestMapping("/user")
public class CourseController {
    @Autowired
    CourseService courseService;

    @GetMapping("/courses")
    public List<Course> availableCourses(){
        return courseService.availableCourses();
    }

//    @PostMapping("/courses")
//    public String addCourse(@RequestBody Course course){
//        courseService.addCourse(course);
//        return "Added...";
//    }


    @PostMapping("/courses/register")
    public String enrollCourse(@RequestParam("name") String name,
                                               @RequestParam("emailId") String emailId,
                                               @RequestParam("courseName") String courseName){
        courseService.enrollCourse(name,emailId,courseName);
        return "Congratulations "+name+"! Your Enrollment Successful for "+courseName;
    }

    @GetMapping("/")
    public String home(){
        return " This is Home Page";
    }
}
