package com.lic.fegin;

import com.lic.pojo.User;
import org.springframework.stereotype.Component;

/**
 * @author lichai
 * @description
 * @date 16:21 2018/12/27
 */
@Component
public class FeignClientFallback implements UserFeignClient{
    @Override
    public User findById(Long id) {
        User user = new User();
        user.setId(-1L);
        user.setName("默认用户");
        return user;
    }
}
