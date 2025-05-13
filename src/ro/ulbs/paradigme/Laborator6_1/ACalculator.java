package ro.ulbs.paradigme.Laborator6_1;

public abstract class ACalculator {
    protected Object state;

    public Object getState() {
        return state;
    }

    public void clear() {
        state = null;
    }

    public abstract void init(Object value);
}
