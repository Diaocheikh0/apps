package entity;

import java.util.Scanner;
public class MontreImpl implements Imontre{

    @Override
    public Montre saisie() {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Veuillez rentré l'ID de la montre :");
        int id = scanner.nextInt();

        System.out.println("Veuillez saisir le libelle de la montre: ");
        String libelle = scanner.next();

        System.out.println("Veuillez indiqué la nature de la montre :");
        String nature = scanner.next();

        return new Montre(id, libelle, nature);
    }

    @Override
    public void affichage(Montre m) {

        System.out.printf("L'id de la montre :"+ m.getId());
        System.out.println("Le libelle de la montre :"+ m.getLib());
        System.out.println("La nature de la montre :"+ m.getNature());
    }
}
