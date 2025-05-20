package ro.ulbs.paradigme.Laborator9;
import java.util.*;
import java.util.stream.*;

public class WordStreamTasks {
    public static void main(String[] args) {
        String sentence = "Acesta este un program scris cu java 8 si expresii lambda";

        List<String> words = Arrays.asList(sentence.split(" "));

        // a)
        List<String> longWords = words.stream()
                .filter(w -> w.length() >= 5)
                .collect(Collectors.toList());
        System.out.println("Cuvinte cu >=5 caractere: " + longWords);

        // b)
        List<String> sortedLongWords = longWords.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println("Cuvinte sortate: " + sortedLongWords);

        // c)
        Optional<String> startsWithP = words.stream()
                .filter(w -> w.startsWith("p"))
                .findFirst();

        if (startsWithP.isPresent()) {
            System.out.println("Primul cuvant care incepe cu 'p': " + startsWithP.get());
        } else {
            System.out.println("Nu exista cuvinte care incep cu 'p'.");
        }
    }
}
