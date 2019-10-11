package com.karat.cn.cloudclientservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author L
 * @date 2019/10/11.
 */
@SpringBootApplication
@EnableEurekaClient
public class CloudClientServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudClientServiceApplication.class, args);
    }

}
