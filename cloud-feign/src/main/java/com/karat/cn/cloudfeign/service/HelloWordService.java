package com.karat.cn.cloudfeign.service;

import com.karat.cn.cloudfeign.service.impl.HelloWordServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 通过@ FeignClient（“服务名”），来指定调用哪个服务
 * @author L
 * @date 2019/10/11.
 */
@FeignClient(value = "service-hi",fallback = HelloWordServiceImpl.class)
public interface HelloWordService {

    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);

}
