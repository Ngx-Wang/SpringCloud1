package com.atguigu.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

@SpringBootTest
@RunWith(SpringRunner.class)
public class usertest {

    @Autowired
    private RestTemplate restTemplate;

    @Test
    public void m1(){

        String url="http://localhost:18081/user/list";
        String res = restTemplate.getForObject(url, String.class,"utf-8");
        System.out.println(res);
    }



}
