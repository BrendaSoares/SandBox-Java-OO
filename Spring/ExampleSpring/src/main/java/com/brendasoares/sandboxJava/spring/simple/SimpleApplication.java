package com.brendasoares.sandboxJava.spring.simple;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SimpleApplication {

    public static void main(String[] args){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        HelloService helloService = (HelloService) applicationContext.getBean("helloService");
        helloService.printHello();
        ((AnnotationConfigApplicationContext)applicationContext).close();
    }
}
