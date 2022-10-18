package htw.berlin.prog2.ha1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Retro calculator")
class CalculatorTest {

    @Test
    @DisplayName("should display result after adding two positive multi-digit numbers")
    void testPositiveAddition() {
        Calculator calc = new Calculator();

        calc.pressDigitKey(2);
        calc.pressDigitKey(0);
        calc.pressBinaryOperationKey("+");
        calc.pressDigitKey(2);
        calc.pressDigitKey(0);
        calc.pressEqualsKey();

        String expected = "40";
        String actual = calc.readScreen();

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("should display result after getting the square root of two ")
    void testSquareRoot() {
        Calculator calc = new Calculator();

        calc.pressDigitKey(2);
        calc.pressUnaryOperationKey("√");

        String expected = "1.41421356";
        String actual = calc.readScreen();

        assertEquals(expected, actual);
    }

    //TODO hier weitere Tests erstellen
    @Test
    @DisplayName("should display result after subtraction two positive multi-digit numbers")
    void testPositiveSubtraction() {
        Calculator calc = new Calculator();
        calc.pressDigitKey(9);
        calc.pressDigitKey(0);
        calc.pressBinaryOperationKey("-");
        calc.pressDigitKey(2);
        calc.pressDigitKey(0);
        calc.pressEqualsKey();

        String expected ="70";
        String actual = calc.readScreen();

        assertEquals(expected, actual);

    }
    @Test
    @DisplayName("should display result after getting root of zero")
    void testRootOfNegativeNumbers() {
        Calculator calc = new Calculator();


        calc.pressNegativeKey();
        calc.pressDigitKey(4);
        calc.pressBinaryOperationKey("√");
        calc.pressEqualsKey();
        String expected = "error";
        String actual = calc.readScreen();
        assertEquals(expected, actual);
    }
    @Test
    @DisplayName("should display after division by 0")
    void testDivisionByZero () {
        Calculator calc = new Calculator();
        calc.pressDigitKey(2);
        calc.pressUnaryOperationKey("/");
        calc.pressDigitKey(0);
        String expected = "Error";
        String actual = calc.readScreen();

        assertEquals(expected, actual);

    }





}

