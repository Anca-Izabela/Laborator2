package ro.ulbs.paradigme.Laborator6;

public class IntCalculator {
    private int state;


    public IntCalculator(int initialState) {
        this.state = initialState;
    }


    public IntCalculator add(int value) {
        this.state += value;
        return this;
    }


    public IntCalculator subtract(int value) {
        this.state -= value;
        return this;
    }


    public IntCalculator multiply(int value) {
        this.state *= value;
        return this;
    }


    public int result() {
        return this.state;
    }


    public void clear() {
        this.state = 0;
    }
}