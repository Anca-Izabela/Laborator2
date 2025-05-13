package ro.ulbs.paradigme.lab6_1;
import org.junit.jupiter.api.Test;
import ro.ulbs.paradigme.Laborator6_1.DoubleCalculator;

import static org.junit.jupiter.api.Assertions.*;

public class DoubleCalculatorTest {

    @Test
    public void testInitWithDouble() {

        DoubleCalculator calc = new DoubleCalculator();


        calc.init(10.5);


        assertEquals(10.5, (Double) calc.getState(), 0.00001);
    }

    @Test
    public void testInitWithInvalidType() {

        DoubleCalculator calc = new DoubleCalculator();


        assertThrows(IllegalArgumentException.class, () -> calc.init(123));
    }

    @Test
    public void testAdd() {

        DoubleCalculator calc = new DoubleCalculator();
        calc.init(5.0);


        calc.add(3.2);


        assertEquals(8.2, (Double) calc.getState(), 0.00001);
    }

    @Test
    public void testSubtract() {

        DoubleCalculator calc = new DoubleCalculator();
        calc.init(10.0);


        calc.subtract(4.5);


        assertEquals(5.5, (Double) calc.getState(), 0.00001);
    }

    @Test
    public void testMultiply() {

        DoubleCalculator calc = new DoubleCalculator();
        calc.init(7.0);


        calc.multiply(2.5);


        assertEquals(17.5, (Double) calc.getState(), 0.00001);
    }
}
