package com.atguigu.controller;

import com.atguigu.domain.User;
import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping(value = "user3")
@DefaultProperties(defaultFallback = "defaultFailBack")
public class UserController2 {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private DiscoveryClient discoveryClient;

    public User defaultFailBack(){
        User user = new User();
        user.setName("宕机中，出问题了(全局)..");
        return user;

    }


    @RequestMapping("/{id}")
    @HystrixCommand
    public User findById(@PathVariable(value = "id")Integer id){
       // String url="http://localhost:18081/user/find/"+id;

//        List<ServiceInstance> list = discoveryClient.getInstances("user-provider");
//        ServiceInstance serviceInstance = list.get(0);
//        String url="http://"+serviceInstance.getHost()+":"+serviceInstance.getPort()+"/user/find/"+id;
        String url="http://user-provider/user/find/"+id;
        User user = restTemplate.getForObject(url, User.class);
        return user;
    }



}






