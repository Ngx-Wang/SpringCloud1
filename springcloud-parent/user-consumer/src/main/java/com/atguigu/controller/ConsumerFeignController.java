package com.atguigu.controller;

import com.atguigu.domain.User;
import com.atguigu.feignInterface.UserFeign;
import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/feign")
//@DefaultProperties(defaultFallback = "defaultFailBack")
public class ConsumerFeignController {

    @Autowired
    private UserFeign userFeign;

    public User defaultFailBack(){
        User user = new User();
        user.setName("宕机中，出问题了(全局)..");
        return user;

    }

    @RequestMapping(value = "/{id}")
    //@HystrixCommand
    public User queryById(@PathVariable(value = "id")Integer id){
        return userFeign.findByUserId(id);
    }




}
