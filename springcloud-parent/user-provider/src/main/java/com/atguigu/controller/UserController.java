package com.atguigu.controller;

import com.atguigu.domain.User;
import com.atguigu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/find/{id}")
    public User findByUserId(@PathVariable("id") Integer id){
        if (id==3){
            throw new RuntimeException("aaa");
        }

        try {
            System.out.println("我睡了----------pro");
            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        User user = userService.findByUserId(id);
        user.setNote("provider");
        return user;
    }




}
