package fr.semifir;

public class Rectangle {

    // ATTRIBUTS
    double longueur;
    double largeur;

    // CONSTRUCTEURS
    public Rectangle() {}

    public Rectangle(double longueur, double largeur) {
        this.longueur = longueur;
        this.largeur = largeur;
    }

    // METHODES
    public double surface() {
        double result = longueur * largeur;
        return result;
    }


}
