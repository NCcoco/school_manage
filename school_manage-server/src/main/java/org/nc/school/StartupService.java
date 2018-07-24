package org.nc.school;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@MapperScan("org.nc.school.dao")
public class StartupService {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(StartupService.class, args);
//        String[] list = context.getBeanDefinitionNames();
//        for (int i = 0; i < list.length; i++) {
//            System.out.println(list[i]);
//        }
    }
}
