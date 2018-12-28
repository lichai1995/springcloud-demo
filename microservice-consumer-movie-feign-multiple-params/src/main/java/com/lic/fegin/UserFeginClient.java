package com.lic.fegin;

import com.lic.pojo.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * @author lichai
 * @description
 * @date 18:32 2018/12/26
 */
@FeignClient(name = "microservice-provider-user")
public interface UserFeginClient {

    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    User findById(@PathVariable("id") Long id);

    /**
     * 第一种方法：feign的get请求传递多参数@RequestParam
     * @param id 用户id
     * @param username 用户姓名
     * @return User
     */
    @RequestMapping(value = "/get1",method = RequestMethod.GET)
    User get1(@RequestParam("id") Long id, @RequestParam("username") String username);

    /**
     * 第二种方法：feign的get请求传递多参数@RequestParam
     * @param map 集合
     * @return User
     */
    @RequestMapping(value = "/get2",method = RequestMethod.GET)
    User get2(@RequestParam Map<String,Object> map);

    /**
     * feign的post请求传递多参数 @RequestBody接收
     * @param user 用户
     * @return User
     */
    @RequestMapping(value = "/post",method = RequestMethod.POST)
    User post(@RequestBody User user);
}
