package com.atguigu.feignInterface;

import com.atguigu.domain.User;
import org.springframework.stereotype.Component;

@Component
public class UserFallBack implements UserFeign {
    @Override
    public User findByUserId(Integer id) {
        User user = new User();
        user.setUsername("服务熔断");
        return user;
    }
}
