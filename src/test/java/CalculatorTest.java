import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calculator;

    //Tests for addition
    @Test
    void addPositive() {
        calculator = new Calculator();
        calculator.add(3);

        assertEquals(3, calculator.value);
    }

    @Test
    void addNegative() {
        calculator = new Calculator();
        calculator.add(-1);

        assertEquals( -1, calculator.value);
    }

    @Test
    void addDecimal() {
        calculator = new Calculator();
        calculator.add(3.4);

        assertEquals(3.4, calculator.value);
    }


    //Test for subtraction

    //Tests for division (Check if divisor is equal to 0 -> if yes throw exception)

    //Tests for absolute difference between two numbers

    //Tests to check if a number has only one digit (positive or negative - return true or false)

}