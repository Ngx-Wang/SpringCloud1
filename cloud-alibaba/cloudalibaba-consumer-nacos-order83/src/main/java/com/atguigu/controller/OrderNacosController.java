package com.atguigu.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/order")
public class OrderNacosController {

    @Autowired
    private RestTemplate restTemplate;
    @Value("${service-url.nacos-user-service}")
    private String serviceUrl;



    @RequestMapping("/nacos/{id}")
    public String getOrder(@PathVariable("id") Integer id){

        String url = serviceUrl+"/payment/nacos/"+id;

        String s = restTemplate.getForObject(url, String.class);

        return s;

    }



}
