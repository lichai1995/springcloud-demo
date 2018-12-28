package com.lic.controller;

import com.lic.dao.UserRepository;
import com.lic.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lichai
 * @description
 * @date 17:17 2018/12/26
 */
@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("{id}")
    public User findById(@PathVariable Long id){
        return userRepository.findOne(id);
    }
}
