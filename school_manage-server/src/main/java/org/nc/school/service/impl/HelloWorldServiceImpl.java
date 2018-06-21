package org.nc.school.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import org.nc.school.service.HelloWorldService;

@Service
public class HelloWorldServiceImpl implements HelloWorldService{
    @Override
    public String say() {
        System.out.println("hello world");
        return "hello world";
    }
}
