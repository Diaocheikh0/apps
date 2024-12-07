import entity.Produit;
import entity.ProduitImpl;

public class Main {
    public static void main(String[] args) {
        Produit p1 = new Produit("1", "Ordinateur", 100, 500000);
        Produit p2 = new Produit("2", "Imprimante", 60, 250000);

        System.out.println("Produit: " + p1.getRef() + " " + p1.getLibelle() + " " + p1.getQuantite() + " unités, prix unitaire de " + p1.getPrix() + " FCFA");
        System.out.println("Produit: " + p2.getRef() + " " + p2.getLibelle() + " " + p2.getQuantite() + " unités, prix unitaire de " + p2.getPrix() + " FCFA");

        ProduitImpl produitService = new ProduitImpl();

        System.out.println("\nSaisir un nouveau produit : ");
        Produit p3 = produitService.saisie();

        System.out.println("\nLe produit saisi est : ");
        produitService.affichage(p3);

    }
}