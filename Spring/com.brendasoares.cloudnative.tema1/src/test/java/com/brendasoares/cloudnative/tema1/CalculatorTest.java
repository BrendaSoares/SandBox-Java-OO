package com.brendasoares.cloudnative.tema1;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.util.*;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {AppConfig.class})
public class CalculatorTest {

    @Autowired
    private Calculator calculator;

    @Test
    public void getOperationHistoryTest() {

        calculator.calculate(5, '+', 5);
        calculator.calculate(3, '-', 1);
        calculator.calculate(20, '*', 50);
        calculator.calculate(2, '^', 2);

        Assert.assertEquals(4, calculator.getOperationHistory().size());
    }

    @Test
    public void calculateValidSumTest() {
        Assert.assertEquals(10, calculator.calculate(5,'+', 5), 0.001);
    }

    @Test
    public void calculateValidSubTest() {
        Assert.assertEquals(15, calculator.calculate(20,'-', 5), 0.001);
    }

    @Test
    public void calculateValidDivisionTest() {
        Assert.assertEquals(5, calculator.calculate(15,'/', 3), 0.001);
    }

    @Test
    public void calculateValidMultiplyTest() {
        Assert.assertEquals(30, calculator.calculate(15,'*', 2), 0.001);
    }

    @Test
    public void calculateValidPowTest() {
        Assert.assertEquals(4, calculator.calculate(2,'^', 2), 0.001);
    }


    @Test
    public void validationCalculateDivisionByZeroTest() {
        Assert.assertFalse(calculator.validationCalculate('/', 0));

    }

    @Test
    public void validationCalculateOperationNullTest() {
        Assert.assertFalse(calculator.validationCalculate(' ', 5));
    }


}