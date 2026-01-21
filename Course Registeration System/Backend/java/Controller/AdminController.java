package com.example.Course.Registeration.System.Controller;

import com.example.Course.Registeration.System.Model.CourseRegistry;
import com.example.Course.Registeration.System.Model.Users;
import com.example.Course.Registeration.System.Service.CourseService;
import com.example.Course.Registeration.System.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin")
@CrossOrigin(origins = {"http://localhost:5500","http://127.0.0.1:5500"})

public class AdminController {
    @Autowired
    CourseService courseService;

    @Autowired
    UserService userService;

    @GetMapping("/courses/enrolled")
    public List<CourseRegistry> enrolledStudents(){
        return courseService.enrolledStudents();
    }
    @PostMapping("/add-user")
    public void addUser(@RequestBody Users user){
        userService.addUser(user);
    }
}
