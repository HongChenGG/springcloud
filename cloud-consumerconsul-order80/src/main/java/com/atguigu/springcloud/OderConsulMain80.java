package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author HongChen
 * @date 2020/11/21 16:39
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OderConsulMain80 {
    public static void main(String[] args) {
        SpringApplication.run(OderConsulMain80.class,args);
    }
}
