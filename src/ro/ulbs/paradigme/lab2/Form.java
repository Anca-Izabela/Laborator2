package ro.ulbs.paradigme.lab2;

public class Form {

    private String color;

    //constructor fara parametrii

    public Form() {
        this.color = "white";
        //lab 3
        //incrementam contorul la fiecare instanta creata de tip Form
        counter++;
    }

    public String getColor(){
        return this.color;
    }

    //constructor cu parametrii
    public Form (String color) {
        this.color = color;

    }



    //metoda tip getArea ()
    public float getArea(){
        return 0;
    }

    //metoda toString()
    @Override
    public String toString (){
        return "This form has the color"+color;

    }

    //laboratorul 3
    //contor
//membru static
    private static int counter =0;

    //functie getter
    //returnam valuarea contorului
    public static int getCounter(){
        return counter;
    }
}