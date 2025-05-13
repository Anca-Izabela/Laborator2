package ro.ulbs.paradigme.Laborator6_1;

public class Main {
    public static void main(String[] args) {

        NewIntCalculator intCalc = new NewIntCalculator();
        intCalc.init(10);
        intCalc.add(5).subtract(3).multiply(2);
        System.out.println("Rezultatul pentru NewIntCalculator: " + intCalc.getState());


        DoubleCalculator doubleCalc = new DoubleCalculator();
        doubleCalc.init(5.5);
        doubleCalc.add(2.2).subtract(1.1).multiply(3);
        System.out.println("Rezultatul pentru DoubleCalculator: " + doubleCalc.getState());


        try {
            NewIntCalculator invalidCalc = new NewIntCalculator();
            invalidCalc.init("test");
        } catch (IllegalArgumentException e) {
            System.out.println("Eroare prinsa: " + e.getMessage());
        }
    }
}
