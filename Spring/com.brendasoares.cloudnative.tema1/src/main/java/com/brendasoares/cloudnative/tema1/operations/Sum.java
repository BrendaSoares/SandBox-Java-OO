package com.brendasoares.cloudnative.tema1.operations;

public class Sum implements OperationCalc {

    @Override
    public double doCalc(double num1, double num2) {
        return num1 + num2;
    }
}
