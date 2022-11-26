package com.nikhil.user.VO;

import com.nikhil.user.model.Department;
import com.nikhil.user.model.Users;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTemplateVO {

    private Users user;
    private Department department;

}
