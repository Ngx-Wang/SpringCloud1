package com.atguigu.service;

/*****
 * @Author: 马伟奇
 * @Description: com.atguigu.service
 ****/
public interface BusinessService {

    /**
     * 下单
     * @param username
     * @param id
     * @param count
     */
    void add(String username, int id, int count);
}