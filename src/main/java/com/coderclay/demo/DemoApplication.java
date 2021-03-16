package com.coderclay.demo;

import com.coderclay.demo.resolver.DemoMultipartResolver;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Bean
    public DemoMultipartResolver multipartResolver() {
        DemoMultipartResolver resolver = new DemoMultipartResolver();
        resolver.setResolveLazily(false);
        return resolver;
    }
}
