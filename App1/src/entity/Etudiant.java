package entity;

import java.util.Scanner;

public class Etudiant extends Personne implements IPersonne {

    public static int nbEtudiants = 0;
    private String matricule;
    private double moyenne;

    public Etudiant() {
    }

    public Etudiant(String nom, String prenom, double moyenne) {
        super(nom, prenom);
        this.moyenne = moyenne;
        this.moyenne = moyenne;
        nbEtudiants++;
        this.matricule = generateMatricule();
    }

    public String getMatricule() {
        return matricule;
    }

    public double getMoyenne() {
        return moyenne;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public void setMoyenne(double moyenne) {
        this.moyenne = moyenne;
    }

    private String generateMatricule (){
        String mat = "Mat-" + getNom().charAt(0) + getPrenom().charAt(0) + nbEtudiants;
        return  mat.toUpperCase();
    }

    @Override
    public void saisie() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrez le matricule de l'étudiant : ");
        this.matricule = scanner.nextLine();

        System.out.println("Entrez la moyenne de l'étudiant : ");
        this.moyenne = scanner.nextDouble();
    }

    @Override
    public void affiche() {

        System.out.println("Matricule : " + this.matricule);
        System.out.println("Moyenne : " + this.moyenne);
    }
}
