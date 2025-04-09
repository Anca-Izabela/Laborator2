package ro.ulbs.paradigme.Laborator6_1;

public class Main {
    public static void main(String[] args) {

        NewIntCalculator intCalc = new NewIntCalculator();
        intCalc.init(10);
        int intResult = (Integer) intCalc.add(5).subtract(3).multiply(2).result();
        System.out.println("Integer result: " + intResult);

        intCalc.clear();


        DoubleCalculator doubleCalc = new DoubleCalculator();
        doubleCalc.init(10.0);
        double doubleResult = (Double) doubleCalc.add(5).subtract(3.3).multiply(2.2).result();
        System.out.println("Double result: " + doubleResult);

        doubleCalc.clear();
    }
}
