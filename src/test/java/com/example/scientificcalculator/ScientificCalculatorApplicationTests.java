package com.example.scientificcalculator;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

@SpringBootTest
class ScientificCalculatorApplicationTests {

    @Autowired
    ScientificCalculatorApplication scientificCalculatorApplication;

    @Test
    void contextLoads() {
    }

    @Test
    public void testSquareRootPositive() {
        assertEquals(3.0, Math.sqrt(9), 0.001);
        assertEquals(5.0, Math.sqrt(25), 0.001);
        assertEquals(2.236, Math.sqrt(5), 0.001);
        assertEquals(0.0, Math.sqrt(0), 0.001);
    }

    @Test
    public void testFactorialPositive() {
        assertEquals(120, Calculator.factorial(5));
        assertEquals(1, Calculator.factorial(0));
        assertEquals(1, Calculator.factorial(1));
        assertEquals(720, Calculator.factorial(6));
    }

    @Test
    public void testNaturalLogarithmPositive() {
        assertEquals(1.609, Math.log(5), 0.001);
        assertEquals(0.0, Math.log(1), 0.001);

    }

    @Test
    public void testPowerFunctionPositive() {
        assertEquals(32.0, Math.pow(2, 5), 0.001);
        assertEquals(1.0, Math.pow(10, 0), 0.001);
        assertEquals(1.0, Math.pow(1, 10), 0.001);
    }

    @Test
    public void testAdditionPositive() {
        assertEquals(10.0, 5 + 5, 0.001);
        assertEquals(0.0, 5 + (-5), 0.001);
    }

    @Test
    public void testSubtractionPositive() {
        assertEquals(5.0, 10 - 5, 0.001);
        assertEquals(-5.0, 5 - 10, 0.001);
    }

    @Test
    public void testMultiplicationPositive() {
        assertEquals(25.0, 5 * 5, 0.001);
        assertEquals(0.0, 5 * 0, 0.001);
    }

    @Test
    public void testDivisionPositive() {
        assertEquals(2.0, 10 / 5, 0.001);
        assertEquals(Double.POSITIVE_INFINITY, 10 / 0.0, 0.001);
    }

    @Test
    public void testFactorialNegative() {
        assertNotEquals(100, Calculator.factorial(5));
        assertNotEquals(5, Calculator.factorial(2));
    }

    @Test
    public void testNaturalLogarithmNegative() {
        assertNotEquals(2.0, Math.log(5), 0.001);
        assertNotEquals(2.0, Math.log(-5), 0.001);
    }

    @Test
    public void testPowerFunctionNegative() {
        assertNotEquals(30.0, Math.pow(2, 5), 0.001);
        assertNotEquals(0.0, Math.pow(1, 5), 0.001);
    }

    @Test
    public void testAdditionNegative() {
        assertNotEquals(15.0, 5 + 5, 0.001);
        assertNotEquals(10.0, 5 + (-5), 0.001);
    }

    @Test
    public void testSubtractionNegative() {
        assertNotEquals(4.0, 10 - 5, 0.001);
        assertNotEquals(0.0, 5 - 10, 0.001);
    }

    @Test
    public void testMultiplicationNegative() {
        assertNotEquals(24.0, 5 * 5, 0.001);
        assertNotEquals(5.0, 5 * 0, 0.001);
    }

    @Test
    public void testDivisionNegative() {
        assertNotEquals(3.0, 10 / 5, 0.001);
        assertNotEquals(6, 0 / 0.0, 0.001);
    }

}
