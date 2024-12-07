package entity;

import java.util.Scanner;

public class Employe extends Personne implements IPersonne {

    private String fonction;
    private int salaire;

    public Employe() {
    }

    public Employe(String nom, String prenom, String fonction, int salaire) {
        super(nom, prenom);
        this.fonction = fonction;
        this.salaire = salaire;
    }

    public String getFonction() {
        return fonction;
    }

    public int getSalaire() {
        return salaire;
    }

    public void setFonction(String fonction) {
        this.fonction = fonction;
    }

    public void setSalaire(int salaire) {
        this.salaire = salaire;
    }

    @Override
    public void saisie() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Veuillez saisir la fonction de l'employé : ");
        this.fonction = scanner.nextLine();

        System.out.println("Veuillez saisir le salaire de l'employé : ");
        this.salaire = scanner.nextInt();
    }

    @Override
    public void affiche() {
        System.out.println("Fonction : " + this.fonction);
        System.out.println("Salaire : " + this.salaire);
    }
}
