package com.lic.fegin;

import com.lic.config.FeignConfiguration;
import com.lic.pojo.User;
import feign.Param;
import feign.RequestLine;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author lichai
 * @description 使用@FeignClient的configuration属性，指定feign的配置类
 * @date 18:32 2018/12/26
 */
@FeignClient(name = "microservice-provider-user",configuration = FeignConfiguration.class)
public interface UserFeginClient {

    @RequestLine("GET /{id}")
    User findById(@Param("id") Long id);
}
