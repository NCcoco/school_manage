package org.nc.school.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import org.nc.school.service.HelloWorldService;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import static java.lang.Thread.sleep;

@Service
public class HelloWorldServiceImpl implements HelloWorldService{

    public static final Map<String, Integer> map = new ConcurrentHashMap<>();

    @Override
    public String say() {
        try {
            sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
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
//        System.out.println("hello world");
        return "hello world";
    }
}
