package ro.ulbs.paradigme.lab3_1.util;
import java.util.Random;

public class PasswordMaker {
    private static final PasswordMaker instance; // Instanță statică unică

    private final String magicString;
    private final String name;
    private static final int MAGIC_NUMBER = new Random().nextInt(6) + 5;

    static { // Bloc static pentru inițializare
        instance = new PasswordMaker("DefaultUser");
    }

    private PasswordMaker(String name) { // Constructor privat
        this.name = name;
        this.magicString = StringRandomizer.generateRandomString(20);
    }

    public static PasswordMaker getInstance() { // Metodă care returnează instanța unică
        return instance;
    }

    public static String getInstanceCounter() {
        return null;
    }

    public String getPassword() { /* Generare parolă */
        return "";
    }
}