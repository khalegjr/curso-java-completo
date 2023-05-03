package entities;

public class Student {
    public String name;
    public double grade1, grade2, grade3;

    public double finalGrade() {
        return grade1 + grade2 + grade3;
    }

    public String result() {
        if (finalGrade() >= 60) return "PASS";
        else return  String.format("FAILED %nMISSING %.2f POINTS", (60 - finalGrade()));
    }

    @Override
    public String toString() {
        return String.format("FINAL GRADE = %.2f%n%s", finalGrade(), result());
    }
}
