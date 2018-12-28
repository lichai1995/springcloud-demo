package com.lic.fegin;

import com.lic.config.FeignLogConfiguration;
import com.lic.pojo.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * @author lichai
 * @description
 * @date 18:32 2018/12/26
 */
@FeignClient(name = "microservice-provider-user",configuration = FeignLogConfiguration.class)
public interface UserFeignClient {

    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    User findById(@PathVariable("id") Long id);

}
