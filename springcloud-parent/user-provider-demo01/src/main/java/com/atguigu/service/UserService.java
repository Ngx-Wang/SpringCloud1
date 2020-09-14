package com.atguigu.service;

import com.atguigu.domain.User;

public interface UserService {
    User findByUserId(Integer id);
}
