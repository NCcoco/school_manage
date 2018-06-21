package org.nc.school.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import org.nc.school.service.HelloWorldService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/test")
public class HelloWorldController {

    @Reference
    private HelloWorldService helloWorldService;

    @GetMapping("say")
    public String say(){
        return helloWorldService.say();
    }
}
