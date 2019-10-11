package com.karat.cn.cloudfeign.service.impl;

import com.karat.cn.cloudfeign.service.HelloWordService;
import org.springframework.stereotype.Component;

/**
 * 实现接口并注入到容器
 * @author L
 * @date 2019/10/11.
 */
@Component
public class HelloWordServiceImpl implements HelloWordService {

    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}
