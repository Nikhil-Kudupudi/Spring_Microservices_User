package com.nikhil.user.repository;

import com.nikhil.user.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Users,Long> {

    Users findByUserId(Long userId);
}
