package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumCalculatorTest {

    SumCalculator sumCalculator;

    @BeforeEach
    void setUp() {
        sumCalculator = new SumCalculator();
    }

    @Test
    void testSumMethodSendingOneReturningOneOk() {
        int currentNumber = 1;
        int expectedNumber = 1;
        int actualNumber = sumCalculator.sum(currentNumber);
        assertEquals(expectedNumber, actualNumber);

    }

    @Test
    void testSumMethodSendingThreeReturningSixOk() {
        int currentNumber = 3;
        int expectedNumber = 6;
        int actualNumber = sumCalculator.sum(currentNumber);
        assertEquals(expectedNumber, actualNumber);

    }

    @Test
    void testSumMethodSendingZeroReturningThrowExceptionFail() {
        int currentNumber = 0;

        assertThrows(IllegalArgumentException.class,
                () -> sumCalculator.sum(currentNumber));


    }
}