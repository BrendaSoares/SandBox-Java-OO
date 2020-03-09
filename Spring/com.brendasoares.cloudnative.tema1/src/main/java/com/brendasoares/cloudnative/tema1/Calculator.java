package com.brendasoares.cloudnative.tema1;

import com.brendasoares.cloudnative.tema1.operations.OperationCalc;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Calculator {

    private Map<Character, OperationCalc> operation;
    private static List<String> operationHistory;

    public Calculator(Map<Character, OperationCalc> operation) {
        this.operation = operation;
        this.operationHistory = new ArrayList<>();
    }

    public List<String> getOperationHistory() {
        return operationHistory;
    }

    public boolean validationCalculate(char operationSymbol, double num2) {
        if (operationSymbol == ' ') {
            operationHistory.add("\nThe calculator does not accept null operations!");
            return false;
        }

        if (num2 == 0 && operationSymbol == '/') {
            operationHistory.add("\nYou cannot divide by 0!");
            return false;
        }

        return true;
    }

    public double calculate(double num1, char operationCalc, double num2) {
        double resultOperation = 0;

        if (validationCalculate(operationCalc, num2) && operation.containsKey(operationCalc)) {
            resultOperation = operation.get(operationCalc).doCalc(num1, num2);
            operationHistory.add("\nOperation Executed Success! \nCalculator: " + num1 + " " + operationCalc + " " + num2 + "\nResult = " + resultOperation + "\n");

        } else {
            operationHistory.add("\nOperation Not Executed!\n");
        }

        return resultOperation;
    }

}
