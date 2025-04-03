package ro.ulbs.paradigme.Laborator4;
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        String fileName = "src/input.txt";

        List<Student> studenti = new ArrayList<>();
        Map<Student, Integer> studentCount = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(" ");
                String nume = parts[0];
                String prenume = parts[1];
                String grupa = parts[2];

                int[] note = Arrays.stream(Arrays.copyOfRange(parts, 3, parts.length))
                        .mapToInt(Integer::parseInt)
                        .toArray();

                Student student = new Student(nume, prenume, grupa, note);
                studenti.add(student);
                studentCount.put(student, studentCount.getOrDefault(student, 0) + 1);
            }
        } catch (IOException e) {
            System.err.println("Eroare la citirea fișierului: " + e.getMessage());
        }


        System.out.println("\nLista studenților și numărul de apariții:");
        studentCount.forEach((s, count) -> System.out.println(s + ", Apare de " + count + " ori"));


        System.out.println("\nLista completă a studenților:");
        for (Student student : studenti) {
            System.out.println(student);
        }
    }
}



