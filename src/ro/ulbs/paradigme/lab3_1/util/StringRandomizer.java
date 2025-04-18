package ro.ulbs.paradigme.lab3_1.util;
import java.util.Random;

public class StringRandomizer
{
    private static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

    public static String generateRandomString(int length)
    {
        Random random = new Random();
        StringBuilder sb = new StringBuilder(length);

        for(int i = 0; i < length; i++)
        {
            int index = random.nextInt(CHARACTERS.length());
            sb.append(CHARACTERS.charAt(index));
        }

        return sb.toString();
    }

}

