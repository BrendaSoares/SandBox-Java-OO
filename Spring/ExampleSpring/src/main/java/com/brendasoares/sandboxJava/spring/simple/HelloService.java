package com.brendasoares.sandboxJava.spring.simple;

public class HelloService {

    private String message;

    public HelloService(){}

    public String getMessage(){
        return message;
    }

    public void setMessage(String message){
        this.message = message;
    }

    public void printHello(){
        System.out.println(message);
    }
}
