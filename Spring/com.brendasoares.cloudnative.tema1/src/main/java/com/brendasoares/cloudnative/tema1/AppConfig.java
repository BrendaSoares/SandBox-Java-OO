package com.brendasoares.cloudnative.tema1;

import com.brendasoares.cloudnative.tema1.operations.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Configuration
@ComponentScan(basePackages = "com.brendasoares.cloudnative.tema1")
public class AppConfig {

    @Bean
    public Calculator calculator() {
        return new Calculator(operationCalcMap());
    }

    @Bean
    public OperationCalc sum(){
        return new Sum();
    }

    @Bean
    public OperationCalc sub(){
        return new Sub();
    }

    @Bean
    public OperationCalc division(){
        return new Division();
    }

    @Bean
    public OperationCalc multiply (){
        return new Multiply();
    }

    @Bean
    public OperationCalc pow(){
        return new Pow();
    }



    private Map<Character, OperationCalc> operationCalcMap (){
        Map<Character, OperationCalc> calcMap = new HashMap<>();

        calcMap.put('+', sum());
        calcMap.put('-', sub());
        calcMap.put('/', division());
        calcMap.put('*', multiply());
        calcMap.put('^', pow());

        return calcMap;
    }
}
