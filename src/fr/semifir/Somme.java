package fr.semifir;

public class Somme {

    double n1, n2;

    public Somme() {}

    public Somme(double n1, double n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public void sum() {
        System.out.println("La somme de n1 et n2 est " + (this.n1+this.n2));
    }
}
