package com.example.Course.Registeration.System.Controller;

import com.example.Course.Registeration.System.Model.Users;
import com.example.Course.Registeration.System.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = {"http://localhost:5500","http://127.0.0.1:5500"})
public class UserController {

    @Autowired
    UserService userService;


}
