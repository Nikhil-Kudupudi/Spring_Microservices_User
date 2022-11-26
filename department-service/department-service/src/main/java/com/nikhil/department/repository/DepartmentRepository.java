package com.nikhil.department.repository;

import com.nikhil.department.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DepartmentRepository extends JpaRepository<Department,Long> {

    Department findByDepartmentId(Long departmentid);
}
