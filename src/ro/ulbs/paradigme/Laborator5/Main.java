package ro.ulbs.paradigme.Laborator5;
import java.io.*;


public class Main {
    public static void main(String[] args) {
        String inputPath = "src/in.txt";
        String outputPath = "src/out.txt";

        StringBuilder resultA = new StringBuilder();
        StringBuilder resultB = new StringBuilder();

        try (BufferedReader br = new BufferedReader(new FileReader(inputPath))) {
            String line;
            while ((line = br.readLine()) != null) {
                // a) adăugăm un \n la finalul fiecărei linii
                resultA.append(line).append("\n");

                // b) adăugăm \n după fiecare punct
                for (char ch : line.toCharArray()) {
                    resultB.append(ch);
                    if (ch == '.') {
                        resultB.append("\n");
                    }
                }
                resultB.append("\n");
            }

            // Afișare rezultate
            System.out.println("=== a) Text cu \\n la finalul fiecărei linii ===\n");
            System.out.println(resultA);

            System.out.println("=== b) Text cu \\n după fiecare punct '.' ===\n");
            System.out.println(resultB);

            // c) Salvare în out.txt
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputPath))) {
                writer.write("=== a) Text cu \\n la finalul fiecărei linii ===\n\n");
                writer.write(resultA.toString());
                writer.write("\n=== b) Text cu \\n după fiecare punct '.' ===\n\n");
                writer.write(resultB.toString());
                System.out.println("\n Modificările au fost salvate în out.txt!");
            }

        } catch (IOException e) {
            System.err.println("Eroare la citirea sau scrierea fișierelor: " + e.getMessage());
        }
    }
}
