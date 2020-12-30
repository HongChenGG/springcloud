package com.atguigu.springcloud.config;


import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author HongChen
 * @date 2020/12/30 15:19
 */
@Configuration
public class FeignConfig {
    @Bean
    Logger.Level feignloggerLevel(){
        return Logger.Level.FULL;
    }
}
