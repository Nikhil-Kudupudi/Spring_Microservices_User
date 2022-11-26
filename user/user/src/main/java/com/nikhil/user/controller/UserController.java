package com.nikhil.user.controller;

import com.nikhil.user.VO.ResponseTemplateVO;
import com.nikhil.user.model.Users;
import com.nikhil.user.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@Slf4j
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/")
    public Users saveUser(@RequestBody  Users user){
        log.info("Inside the saveUser method of UserController");
        return  userService.saveUser(user);
    }
    @GetMapping("/{id}")
    public ResponseTemplateVO getUserWithDepartment(@PathVariable("id")  Long userId){
        return userService.getUserWithDepartment(userId);

    }
}
