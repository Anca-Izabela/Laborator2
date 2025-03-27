package ro.ulbs.paradigme.lab3_1.util;
import java.util.Random;

public class PasswordMaker
{
    private static final int MAGIC_NUMBER = new Random().nextInt(6) + 5;
    private final String magicString;
    private final String name;
    private static final PasswordMaker instance;
    private static int instanceCounter = 0;// contorul trebuie sa fie static


    static
    {
        instance = new PasswordMaker("Default User");
    }

    public PasswordMaker(String name)
    {
        this.name = name;
        this.magicString = StringRandomizer.generateRandomString(20);
    }

    public static PasswordMaker getInstance()
    {
        instanceCounter++;
        return instance;
    }

    public static int getInstanceCounter()
    {
        return instanceCounter;
    }

    public String getPassword()
    {
        Random random = new Random();

        String randomPart = StringRandomizer.generateRandomString(MAGIC_NUMBER);
        StringBuilder magicPart = new StringBuilder();

        for(int i = 0; i < 10; i++)
        {
            int index = random.nextInt(magicString.length());

        }

        String nameLength = String.valueOf(name.length());
        int randomInt = random.nextInt(51);

        return randomPart + magicPart + nameLength + randomInt;

    }
}
