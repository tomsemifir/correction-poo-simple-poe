package fr.semifir;

public class Telephone {

    String marque;
    String modele;
    String couleur;
    double prix;

    public Telephone() {

    }

    public Telephone(String marque, String modele, String couleur, double prix) {
        this.marque = marque;
        this.modele = modele;
        this.couleur = couleur;
        this.prix = prix;
    }

    public String envoyerMessage(String message){
        return message;
    }

    public void appeler(String destinataire) {
        System.out.println("Je suis en train d'appler..." + destinataire);
    }

    @Override
    public String toString() {
        return "Telephone{" +
                "marque='" + marque + '\'' +
                ", modele='" + modele + '\'' +
                ", couleur='" + couleur + '\'' +
                ", prix=" + prix +
                '}';
    }
}
