package com.brendasoares.sandboxJava.spring.simple;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.brendasoares.sandboxJava.spring.simple")
public class AppConfig {

    @Bean
    public HelloService helloService() {
        HelloService hs = new HelloService();
        hs.setMessage("Hello from Annotations");
        return hs;
    }

}
