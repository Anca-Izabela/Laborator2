package ro.ulbs.paradigme.Laborator4;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Student> studenti = Arrays.asList(
                new Student("Popescu", "Ion", "A1"),
                new Student("Ionescu", "Maria", "A2"),
                new Student("Georgescu", "Ana", "A1"),
                new Student("Dumitrescu", "Vlad", "A3"),
                new Student("Radu", "Elena", "A2")
        );

        // b1) Sortare alfabetică pe grupe
        studenti.sort(Comparator.comparing((Student s) -> s.grupa).thenComparing(s -> s.nume));
        System.out.println("\nSortare alfabetică pe grupe:");
        studenti.forEach(System.out::println);

        // b2) Sortare descrescătoare a mediilor pentru integraliști
        List<Student> integralisti = studenti.stream().filter(Student::esteIntegralist)
                .sorted(Comparator.comparingDouble(Student::getMedie).reversed())
                .toList();
        System.out.println("\nIntegraliști sortați descrescător după medie:");
        integralisti.forEach(System.out::println);

        // b3) Sortare crescătoare a numărului de restanțe pentru restanțieri
        List<Student> restantieri = studenti.stream().filter(s -> !s.esteIntegralist())
                .sorted(Comparator.comparingLong(Student::getRestante))
                .toList();
        System.out.println("\nRestanțieri sortați crescător după numărul de restanțe:");
        restantieri.forEach(System.out::println);
    }
}
