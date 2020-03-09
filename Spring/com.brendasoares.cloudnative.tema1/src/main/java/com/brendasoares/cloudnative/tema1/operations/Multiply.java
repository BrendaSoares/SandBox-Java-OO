package com.brendasoares.cloudnative.tema1.operations;

public class Multiply implements OperationCalc {
    @Override
    public double doCalc(double num1, double num2) {
        return num1 * num2;
    }
}
