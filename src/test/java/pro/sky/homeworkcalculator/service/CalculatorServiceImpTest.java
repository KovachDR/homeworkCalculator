package pro.sky.homeworkcalculator.service;

import org.junit.jupiter.api.Test;
import pro.sky.homeworkcalculator.exceptions.ZeroDivideException;

import static org.junit.jupiter.api.Assertions.*;
import static pro.sky.homeworkcalculator.ConstantsForTests.*;


class CalculatorServiceImpTest {
    private final CalculatorServiceImp calculatorServiceImp = new CalculatorServiceImp();



    @Test
    void plus1() {
    assertEquals(ONE + TWO,calculatorServiceImp.plus(1,2));
    }
    @Test
    void plus2() {
        assertEquals(THREE + FOUR,calculatorServiceImp.plus(3,4));
    }

    @Test
    void minus1() {
        assertEquals(ONE - TWO,calculatorServiceImp.minus(1,2));
    }
    @Test
    void minus2() {
        assertEquals(THREE - FOUR,calculatorServiceImp.minus(3,4));
    }

    @Test
    void multiply1() {
        assertEquals(ONE * TWO,calculatorServiceImp.multiply(1,2));
    }
    @Test
    void multiply2() {
        assertEquals(THREE * FOUR,calculatorServiceImp.multiply(3,4));
    }

    @Test
    void divide1() {
        assertEquals(ONE / TWO,calculatorServiceImp.divide(1,2));
    }
    @Test
    void divide2() {
        assertEquals(THREE / FOUR,calculatorServiceImp.divide(3,4));
    }

    @Test
    void zeroDivide() {
        assertThrows(ZeroDivideException.class,() -> calculatorServiceImp.divide(THREE,ZERO));
    }
}