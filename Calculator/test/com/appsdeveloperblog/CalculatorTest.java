package com.appsdeveloperblog;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Test Math operations in Calculator class")
class CalculatorTest {


    // test<System Under Test>_< Condition or State Change>_<Expected Result>
    @DisplayName("Test 4/2 = 2")
    @Test
    void testIntegerDivision_WhenFourIsDividedByTwo_ShouldReturnTwo() {
        // This making fail test cases
//        fail("No implementation provided.");
        Calculator calculator = new Calculator();
        int result = calculator.integerDivision(4, 2);
        System.out.println("The result of division = " + result);
        assertEquals(2, result, "The integerDivision() didn't produce as expect.");
    }

    @DisplayName("Test division by zero")
    @Test
    void testIntegerDivision_WhenDividendByZero_ShouldThrowArithmeticException(){
//        Calculator calculator = new Calculator();
//        int result = calculator.integerDivision(4, 0);
//        throw new ArithmeticException(result + "Shouldn't divided by zero");
        fail("Not implemented yet");
    }


    @DisplayName("Test 33-1=32")
    @Test
    void integerSubtraction() {
        int minuend = 33;
        int subtrahend = 1;
        int expectedValue = 32;
        Calculator calculator = new Calculator();
        int actualValue = calculator.integerSubtraction(33, 1);

//        The third parameter in assertEquals() for message in case of this test fail,
//        it like an explanation. if the test is true this parameter be useless

//        assertEquals(50, actualValue,
//                "It was not correct value, expected not as actual." +
//                " it must be equal " + calculator.integerSubtraction(50, 13));

//        using lambda expression here to optimize code and make it more fast,
//        because message in assert will be computed every time running application
        assertEquals(expectedValue, actualValue, ()->
                minuend + "-" + subtrahend + " didn't produce "
                        +actualValue);
    }
}