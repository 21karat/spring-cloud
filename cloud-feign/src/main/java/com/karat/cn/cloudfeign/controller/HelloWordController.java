package com.karat.cn.cloudfeign.controller;

import com.karat.cn.cloudfeign.service.HelloWordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author L
 * @date 2019/10/11.
 */
@RestController
public class HelloWordController {

    @Autowired
    HelloWordService helloWordService;

    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    public String sayHi(@RequestParam String name){
        return helloWordService.sayHiFromClientOne(name);
    }

}
