package com.brendasoares.cloudnative.tema1.operations;

import com.brendasoares.cloudnative.tema1.OperationCalc;

public class Division implements OperationCalc {
    @Override
    public double doCalc(double num1, double num2) {
        return num1 / num2;
    }
}
