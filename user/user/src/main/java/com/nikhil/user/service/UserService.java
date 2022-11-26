package com.nikhil.user.service;

import com.nikhil.user.VO.ResponseTemplateVO;
import com.nikhil.user.model.Department;
import com.nikhil.user.model.Users;
import com.nikhil.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RestTemplate restTemplate;
    public Users saveUser(Users user){
        return userRepository.save(user);
    }

    public ResponseTemplateVO getUserWithDepartment(Long userId) {
        ResponseTemplateVO vo=new ResponseTemplateVO();
        Users user=userRepository.findByUserId(userId);
        Department department=restTemplate.getForObject("http://DEPARTMENT-SERVICE/department/"+ user.getDepartmentId(),Department.class);

        vo.setUser(user);
        vo.setDepartment(department);

        return vo;
    }
}
