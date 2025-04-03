package ro.ulbs.paradigme.Laborator4;
import java.util.Arrays;
import java.util.Objects;


public class Student {
    String nume;
    String prenume;
    String grupa;
    int[] note;

    public Student(String nume, String prenume, String grupa, int[] note) {
        this.nume = nume;
        this.prenume = prenume;
        this.grupa = grupa;
        this.note = note;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(nume, student.nume) &&
                Objects.equals(prenume, student.prenume) &&
                Objects.equals(grupa, student.grupa) &&
                Arrays.equals(note, student.note);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(nume, prenume, grupa);
        result = 31 * result + Arrays.hashCode(note);
        return result;
    }

    @Override
    public String toString() {
        return String.format("%s %s, Grupa: %s, Note: %s",
                nume, prenume, grupa, Arrays.toString(note));
    }
}
