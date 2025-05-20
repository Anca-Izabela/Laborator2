package ro.ulbs.paradigme.Laborator9;
import java.util.*;
import java.util.stream.*;

public class StreamExample {
    public static void main(String[] args) {
        // Lista de 10 numere
        Random rand = new Random();
        List<Integer> numbers = rand.ints(10, 5, 26)
                .boxed()
                .collect(Collectors.toList());
        System.out.println("Lista initiala: " + numbers);

        // a)
        int sum = numbers.stream()
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("Suma elementelor: " + sum);

        // b)
        int max = numbers.stream().max(Integer::compareTo).orElseThrow();
        int min = numbers.stream().min(Integer::compareTo).orElseThrow();
        System.out.println("Maximul: " + max);
        System.out.println("Minimul: " + min);

        // c)
        List<Integer> filtered = numbers.stream()
                .filter(n -> n >= 10 && n <= 20)
                .collect(Collectors.toList());
        System.out.println("Elemente in intervalul [10..20]: " + filtered);

        // d)
        List<Double> doubleList = numbers.stream()
                .map(Integer::doubleValue)
                .collect(Collectors.toList());
        System.out.println("Lista de Double: " + doubleList);

        // e)
        boolean contains12 = numbers.contains(12);
        System.out.println("Lista contine 12? " + contains12);
    }
}
