package pro.sky.homeworkcalculator.service;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static pro.sky.homeworkcalculator.ConstantsForTests.*;


public class CalculatorServiceImpParamTest {
    private final CalculatorServiceImp calculatorServiceImp = new CalculatorServiceImp();

    @MethodSource("provideParams")
    @ParameterizedTest
    void plus(double num1, double num2) {
        assertEquals(num1 + num2, calculatorServiceImp.plus(num1, num2));
    }

    @MethodSource("provideParams")
    @ParameterizedTest
    void minus(double num1, double num2) {
        assertEquals(num1 - num2, calculatorServiceImp.minus(num1, num2));
    }

    @MethodSource("provideParams")
    @ParameterizedTest
    void multiply(double num1, double num2) {
        assertEquals(num1 * num2, calculatorServiceImp.multiply(num1, num2));
    }

    @MethodSource("provideParams")
    @ParameterizedTest
    void divide(double num1, double num2) {
        assertEquals(num1 / num2, calculatorServiceImp.divide(num1, num2));
    }

    private static Stream<Arguments> provideParams() {
        return Stream.of(
                Arguments.of(ZERO,ONE),
                Arguments.of(ONE,TWO),
                Arguments.of(TWO,THREE),
                Arguments.of(THREE,FOUR),
                Arguments.of(THREE,THREE));
    }


}
