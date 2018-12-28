package com.lic.fegin;

import com.lic.pojo.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author lichai
 * @description
 * @date 18:32 2018/12/26
 */
@FeignClient(name = "microservice-provider-user")
public interface UserFeginClient {

    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    User findById(@PathVariable("id") Long id);
}
