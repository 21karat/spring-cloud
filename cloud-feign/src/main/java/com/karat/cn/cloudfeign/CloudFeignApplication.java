package com.karat.cn.cloudfeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClientsConfiguration;

/**
 *@EnableFeignClients注解开启Feign的功能
 * @EnableFeignClients(defaultConfiguration = FeignClientsConfiguration.class)
 * 不加上括号中的配置会导致开启失效
 * @author L
 * @date 2019/10/11.
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@EnableFeignClients(defaultConfiguration = FeignClientsConfiguration.class)
public class CloudFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudFeignApplication.class, args);
    }

}
