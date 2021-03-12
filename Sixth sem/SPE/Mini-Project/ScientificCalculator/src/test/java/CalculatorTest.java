import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    //object
    Calculator c = new Calculator();

    @Test
    void factorial() {

        int actual = c.factorial(5);
        assertEquals(120, actual);
    }

    @Test
    void power() {
        double actual = c.power(2,3);
        assertEquals(8, actual);
    }

    @Test
    void sq_root() {
        double actual = c.sq_root(2.4);
        assertEquals(1.5491933384829668, actual);

        double actual1 = c.sq_root(4);
        assertEquals(2, actual1);

        double actual2 = c.sq_root(0);
        assertEquals(0, actual2);

        //double actual3 = c.sq_root(-1);
        //assertEquals("NaN", actual3);

    }

    @Test
    void log() {
        double actual = c.log(1);

        assertEquals(0, actual);
    }






}