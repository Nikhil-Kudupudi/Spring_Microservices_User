package com.nikhil.department.service;

import com.nikhil.department.model.Department;
import com.nikhil.department.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Slf4j
public class DepartmentService {

    @Autowired
    private DepartmentRepository repository;


    public Department saveDepartment(Department department) {
        log.info("Inside the saveDepartment of Department Service");
       return repository.save(department);
    }

    public Department findDepartmentById(Long departmentid) {
        log.info("Inside the find DepartmentById of Department Service.");
        return repository.findByDepartmentId(departmentid);
    }
}
