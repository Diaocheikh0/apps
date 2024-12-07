package entity;

import java.util.Scanner;
public class ChemiseImpl implements Ichemise{

    @Override
    public Chemise saisie() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Veuillez saisir l'id de la chemise :");
        int id = scanner.nextInt();

        System.out.printf("Veuillez saisir le libellé de la chemise :");
        String libelle = scanner.next();

        System.out.println("Veuillez saisir la couture de la chemise :");
        String couture = scanner.next();

        return new Chemise(id, libelle, couture);
    }

    @Override
    public void affichage(Chemise c) {
        System.out.println("ID de la chemise : " + c.getId());
        System.out.println("Le libelleé de la chemise : "+ c.getLib());
        System.out.println("La couture de la chemise : "+ c.getCouture());
    }
}
