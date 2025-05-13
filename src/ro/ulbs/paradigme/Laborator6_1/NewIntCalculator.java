package ro.ulbs.paradigme.Laborator6_1;

public class NewIntCalculator extends ACalculator {

    @Override
    public void init(Object value) {
        if (value instanceof Integer) {
            state = value;
        } else {
            throw new IllegalArgumentException("NewIntCalculator needs an Integer");
        }
    }

    public NewIntCalculator add(int value) {
        state = (Integer) state + value;
        return this;
    }

    public NewIntCalculator subtract(int value) {
        state = (Integer) state - value;
        return this;
    }

    public NewIntCalculator multiply(int value) {
        state = (Integer) state * value;
        return this;
    }
    public NewIntCalculator divide(int value) {
        if (value == 0) {
            throw new ArithmeticException("Division by zero is not allowed");
        }
        state = (Integer) state / value;
        return this;
    }
}
