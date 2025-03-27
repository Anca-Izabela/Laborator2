package ro.ulbs.paradigme.lab3.util;

import java.util.Random;

public class PasswordMaker
{
    private static final int MAGIC_NUMBER = new Random().nextInt(6) + 5;
    private final String magicString;
    private final String name;
    private static PasswordMaker instance;

    private PasswordMaker(String name)
    {
        this.name = name;
        this.magicString = StringRandomizer.generateRandomString(20);
    }

    public static PasswordMaker getInstance(String name)
    {
        if(instance == null)
        {
            instance = new PasswordMaker(name);
        }
        return instance;
    }

    public String getPassword()
    {
        Random random = new Random();

        String randomPart = StringRandomizer.generateRandomString(MAGIC_NUMBER);
        StringBuilder magicPart = new StringBuilder();

        for(int i = 0; i < 10; i++)
        {
            int index = random.nextInt(magicString.length());
            magicPart.append(magicString.charAt(index));
        }

        String nameLength = String.valueOf(name.length());
        int randomInt = random.nextInt(51);

        return randomPart + magicPart + nameLength + randomInt;
    }
}
