import calculator.Calculator
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    //object
    Calculator c = new Calculator();

    @Test
    void factorial() {

        int actual = c.factorial(5);
        assertEquals(120, actual);

        int actual2 = c.factorial(0);
        assertEquals(1, actual2);

        int actual3 = c.factorial(1);
        assertEquals(1,actual3);

        int actual4 = c.factorial(-1);
        assertEquals(1,actual4);
    }

    @Test
    void power() {
        double actual = c.power(2,3);
        assertEquals(8, actual);

        double actual2 = c.power(-1,-1);
        assertEquals(-1, actual2);

        double actual3 = c.power(2.3,4.5);
        assertEquals(42.43998894277659, actual3);
    }

    @Test
    void sq_root() {
        double actual = c.sq_root(2.4);
        assertEquals(1.5491933384829668, actual);

        double actual1 = c.sq_root(4);
        assertEquals(2, actual1);

        double actual2 = c.sq_root(0);
        assertEquals(0, actual2);

        double actual3 = c.sq_root(-1);
        assertEquals(Double.NaN, actual3);

    }

    @Test
    void log() {
        double actual = c.log(1);
        assertEquals(0, actual);

        double actual2 = c.log(0);
        assertEquals(Double.NEGATIVE_INFINITY, actual2);

        double actual3 = c.log(-1);
        assertNotEquals(Double.NEGATIVE_INFINITY, actual3);
    }






}
