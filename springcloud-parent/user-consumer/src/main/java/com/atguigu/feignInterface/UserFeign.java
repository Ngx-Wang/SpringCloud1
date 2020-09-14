package com.atguigu.feignInterface;

import com.atguigu.domain.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "user-provider",fallback = UserFallBack.class)
public interface UserFeign {
    @RequestMapping("/user/find/{id}")
    public User findByUserId(@PathVariable("id") Integer id);



}
