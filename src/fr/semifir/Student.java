package fr.semifir;

import java.util.ArrayList;
import java.util.List;

public class Student {

    String nom;
    int[] notes;

    public Student() {

    }
    //new Student("toto", 12, 15, 16, 10, 05)

    public Student(String nom, int... notes) {
        this.nom = nom;
        this.notes = notes;
    }

    public double calculerMoyenne() {
        double result = 0;
        for(double note : this.notes) {
            result += note;
        }
        result /= this.notes.length;
        return result;
    }

    @Override
    public String toString() {
        return "Student{" +
                "nom='" + nom + '\'' +
                "moyenne='" + this.calculerMoyenne() + '\'' +
                '}';
    }
}
