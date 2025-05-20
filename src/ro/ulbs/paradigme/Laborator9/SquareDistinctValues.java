package ro.ulbs.paradigme.Laborator9;
import java.util.*;
import java.util.stream.*;

public class SquareDistinctValues {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(9, 10, 3, 4, 7, 3, 4);

        List<Integer> squaredDistinct = numbers.stream()
                .distinct()
                .map(n -> n * n)
                .collect(Collectors.toList());

        System.out.println("Lista initiala: " + numbers);
        System.out.println("Patratele valorilor distincte: " + squaredDistinct);
    }
}
