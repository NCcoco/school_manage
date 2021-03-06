package org.nc.school;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Startup {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Startup.class, args);
        String[] list = context.getBeanDefinitionNames();
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
    }
}
