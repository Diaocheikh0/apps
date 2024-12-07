package entity;

import java.util.Scanner;
public class ProduitImpl implements IProduit {
    @Override
    public Produit saisie() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrez la référence du produit : ");
        String ref = scanner.nextLine();

        System.out.println("Entrez le libellé du produit : ");
        String libelle = scanner.nextLine();

        System.out.println("Entrez la quantité : ");
        double quantite = scanner.nextDouble();

        System.out.println("Entrez le prix unitaire : ");
        int prix = scanner.nextInt();

        return new Produit(ref, libelle, quantite, prix);
    }

    @Override
    public void affichage(Produit produit) {
        System.out.println(produit.toString());
    }
}
