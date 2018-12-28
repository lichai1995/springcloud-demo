package com.lic.controller;

import com.lic.fegin.UserFeignClient;
import com.lic.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lichai
 * @description
 * @date 18:35 2018/12/26
 */
@RestController
public class MovieController {

    @Autowired
    private UserFeignClient userFeignClient;

    @GetMapping("/user/{id}")
    public User findById(@PathVariable("id") Long id){
        return userFeignClient.findById(id);
    }
}
