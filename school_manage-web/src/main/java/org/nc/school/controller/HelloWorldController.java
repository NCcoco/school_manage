package org.nc.school.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import org.nc.school.service.HelloWorldService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@RestController
@RequestMapping("/api/test")
public class HelloWorldController {

    @Reference
    private HelloWorldService helloWorldService;

    public static final Map<String, Integer> map = new ConcurrentHashMap<>();

    @GetMapping("say")
    public String say(){
        String threadName = Thread.currentThread().getName();
        if(map.get(threadName) != null){
            map.put(threadName, map.get(threadName) + 1);
        } else {
            map.put(threadName, 1);
        }
        int count = 0;
        for (Integer a : map.values()) {
            count += a;
        }
        System.out.println("线程：" + threadName + " 使用了：" + map.get(threadName) + "次, 总计：" + count);
        return helloWorldService.say();
    }
}
