package ro.ulbs.paradigme.Laborator6_1;

public class DoubleCalculator extends ACalculator {

    @Override
    public void init(Object value) {
        if (value instanceof Double) {
            state = value;
        } else {
            throw new IllegalArgumentException("DoubleCalculator needs a Double");
        }
    }

    public DoubleCalculator add(double value) {
        state = (Double) state + value;
        return this;
    }

    public DoubleCalculator subtract(double value) {
        state = (Double) state - value;
        return this;
    }

    public DoubleCalculator multiply(double value) {
        state = (Double) state * value;
        return this;
    }
}
