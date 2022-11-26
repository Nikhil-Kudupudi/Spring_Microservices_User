package com.nikhil.department.controller;

import com.nikhil.department.model.Department;
import com.nikhil.department.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequestMapping("/department")
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/")
    public Department saveDepartment(@RequestBody Department department){
        log.info("Inside the saveDepartment of Department Controller");
        return departmentService.saveDepartment(department);
    }
    @GetMapping("/{id}")
    public Department findDepartmentById(@PathVariable("id") Long departmentid){
        log.info("Inside the findDepartmentById of Department Controller");
        return departmentService.findDepartmentById(departmentid);
    }
}
