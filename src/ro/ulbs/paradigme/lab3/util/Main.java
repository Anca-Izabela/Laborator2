package ro.ulbs.paradigme.lab3.util;

public class Main
{
    public static void main(String[] args)
    {
        PasswordMaker pm = PasswordMaker.getInstance("Izabela");
        System.out.println("Parola generată: " + pm.getPassword());
    }
}
