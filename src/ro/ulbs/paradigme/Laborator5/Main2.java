package ro.ulbs.paradigme.Laborator5;

import java.io.*;
import java.nio.file.Paths;
import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        File outputFile = Paths.get("src", "outrand.txt").toFile();
        int numberOfWordsPerLine = 10;
        int numberOfLines = 5;

        Random random = new Random();
        List<String> words = new ArrayList<>();


        for (int i = 0; i < numberOfWordsPerLine * numberOfLines; i++) {
            String word = generateRandomWord(4, random);
            words.add(word);
        }

        Collections.sort(words);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
            for (int i = 0; i < numberOfLines; i++) {
                for (int j = 0; j < numberOfWordsPerLine; j++) {
                    writer.write(words.get(i * numberOfWordsPerLine + j));
                    if (j < numberOfWordsPerLine - 1) {
                        writer.write(" ");
                    }
                }
                writer.newLine();
            }
            System.out.println(" Fișierul 'outrand.txt' a fost generat cu succes!");
        } catch (IOException e) {
            System.err.println("Eroare la scrierea fișierului: " + e.getMessage());
        }
    }

    public static String generateRandomWord(int length, Random random) {
        StringBuilder word = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            char randomChar = (char) ('a' + random.nextInt(26));  // a..z
            word.append(randomChar);
        }
        return word.toString();
    }
}
