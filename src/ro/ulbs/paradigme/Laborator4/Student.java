package ro.ulbs.paradigme.Laborator4;
import java.util.*;

public class Student {
    String nume;
    String prenume;
    String grupa;
    int[] note = new int[5];

    public Student(String nume, String prenume, String grupa) {
        this.nume = nume;
        this.prenume = prenume;
        this.grupa = grupa;
        Random rand = new Random();
        for (int i = 0; i < 5; i++) {
            this.note[i] = rand.nextInt(7) + 4;
        }
    }

    public double getMedie() {
        return Arrays.stream(note).average().orElse(0);
    }

    public long getRestante() {
        return Arrays.stream(note).filter(n -> n < 5).count();
    }

    public boolean esteIntegralist() {
        return getRestante() == 0;
    }

    @Override
    public String toString() {
        return String.format("%s %s, Grupa: %s, Note: %s, Medie: %.2f, Restanțe: %d",
                nume, prenume, grupa, Arrays.toString(note), getMedie(), getRestante());
    }
}
