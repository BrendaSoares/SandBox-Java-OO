package com.brendasoares.cloudnative.tema1;

public class Calculator {

    OperationCalc operationCalc;

    public Calculator(OperationCalc operationCalc){
        this.operationCalc = operationCalc;
    }

    public double sum(OperationCalc operationCalc, double num1, double num2) {
        return 0;
    }

    public Class<? extends OperationCalc> getOperationType(OperationCalc operationCalc){
        return operationCalc.getClass();
    }

}
