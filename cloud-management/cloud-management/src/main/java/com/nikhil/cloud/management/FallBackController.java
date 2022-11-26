package com.nikhil.cloud.management;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackController {
    @HystrixCommand
    @GetMapping("/userServiceFallBack")
    public String userServiceFallBackMethod(){
        return "User Service is taking longer than expected please try again later.";
    }

    @HystrixCommand
    @GetMapping("/departmentServiceFallBack")
    public String departmentServiceFallBackMethod(){
        return "department Service is taking longer than expected please try again later.";
    }
}
