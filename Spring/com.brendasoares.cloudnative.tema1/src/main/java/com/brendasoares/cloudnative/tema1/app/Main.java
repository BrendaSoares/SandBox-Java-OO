package com.brendasoares.cloudnative.tema1.app;

import com.brendasoares.cloudnative.tema1.AppConfig;
import com.brendasoares.cloudnative.tema1.Calculator;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        Calculator calculator = (Calculator) applicationContext.getBean("calculator");



        calculator.calculate(1, '+', 6);
        calculator.calculate(9, '-', 1);
        calculator.calculate(8, '/', 2);
        calculator.calculate(5, '*', 4);
        calculator.calculate(2, '^', 2);
        calculator.calculate(2, '/', 0);
        calculator.calculate(10, ' ', 8);


        System.out.println(calculator.getOperationHistory());


        ((AnnotationConfigApplicationContext) applicationContext).close();


    }
}
