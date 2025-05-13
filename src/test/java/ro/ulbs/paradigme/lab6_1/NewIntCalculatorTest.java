package ro.ulbs.paradigme.lab6_1;
import org.junit.jupiter.api.Test;
import ro.ulbs.paradigme.Laborator6_1.NewIntCalculator;

import static org.junit.jupiter.api.Assertions.*;

public class NewIntCalculatorTest {

    @Test
    public void testInitWithInteger() {

        NewIntCalculator calc = new NewIntCalculator();

        calc.init(10);

        assertEquals(10, calc.getState());
    }

    @Test
    public void testInitWithInvalidType() {

        NewIntCalculator calc = new NewIntCalculator();

        assertThrows(IllegalArgumentException.class, () -> calc.init("not an integer"));
    }

    @Test
    public void testAdd() {

        NewIntCalculator calc = new NewIntCalculator();
        calc.init(5);

        calc.add(3);


        assertEquals(8, calc.getState());
    }

    @Test
    public void testSubtract() {

        NewIntCalculator calc = new NewIntCalculator();
        calc.init(10);

        calc.subtract(4);

        assertEquals(6, calc.getState());
    }

    @Test
    public void testMultiply() {

        NewIntCalculator calc = new NewIntCalculator();
        calc.init(7);

        calc.multiply(2);

        assertEquals(14, calc.getState());
    }
    @Test
    public void testMultiplyWithZero() {
        NewIntCalculator calc = new NewIntCalculator();
        calc.init(15);
        calc.multiply(0);
        assertEquals(0, calc.getState());
    }
    @Test
    public void testDivideByZeroThrowsException_NewIntCalculator() {

        NewIntCalculator calc = new NewIntCalculator();
        calc.init(10);

        assertThrows(ArithmeticException.class, () -> calc.divide(0));
    }
}
