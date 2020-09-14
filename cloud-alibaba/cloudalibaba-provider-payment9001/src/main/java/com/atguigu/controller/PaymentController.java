package com.atguigu.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment")
public class PaymentController {

    @Value("${server.port}")
    private String serverPort;

    @RequestMapping("/nacos/{id}")
    public String getPayment(@PathVariable("id") Integer id){
        return "serverPort:"+serverPort+"-------------id:"+id;
    }

}
