package com.atguigu.controller;

import com.atguigu.domain.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {


    @RequestMapping("/list")
    public List<User> list(){
        List<User> list = new ArrayList<>();
        list.add(new User("张三","深圳",20));
        list.add(new User("李四","上海",20));
        list.add(new User("王五","北京",20));
        return list;

    }

}
