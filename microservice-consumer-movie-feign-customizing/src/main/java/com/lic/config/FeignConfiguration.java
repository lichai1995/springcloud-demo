package com.lic.config;

import feign.Contract;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author lichai
 * @description 该类为Feign的配置类
 * @date 19:33 2018/12/26
 */
@Configuration
public class FeignConfiguration {

    /**
     * 将契约改为feign原生的默认契约。这样就可以使用feign自带的注解
     * @return 默认的feign契约
     */
    @Bean
    public Contract feignContract(){
        return new feign.Contract.Default();
    }

}
