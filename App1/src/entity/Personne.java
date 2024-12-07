package entity;

import java.util.Scanner;
public class Personne {

    private String nom;
    private String prenom;

    public Personne() {

    }

    public Personne(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void saisie(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Veuillez saisir votre nom: ");
        this.nom = scanner.nextLine();

        System.out.println("Veuillez saisir votre prénom: ");
        this.prenom = scanner.nextLine();

        System.out.println("Vous avez saisie : "+ nom + " " + prenom);

        scanner.close();
    }
}
