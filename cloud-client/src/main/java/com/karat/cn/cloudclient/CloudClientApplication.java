package com.karat.cn.cloudclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 注解@EnableEurekaClient 表明自己是一个eurekaclient(服务提供者)
 * @author L
 * @date 2019/10/11.
 */
@SpringBootApplication
@EnableEurekaClient
public class CloudClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudClientApplication.class, args);
    }

}
