package entity;

import java.util.Scanner;
public class ArticleImpl implements IArticle {

    @Override
    public Article saisie() {
        Scanner scanner  = new Scanner(System.in);

        System.out.println("Entrez l'id de l'article : ");
        int id = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Entrez le libbelé de l'article : ");
        String libelle = scanner.nextLine();

        return new Article(id, libelle);
    }

    @Override
    public void affichage(Article a) {
        System.out.println("ID de l'article : " + a.getId());
        System.out.println("Le libelleé de l'article : "+ a.getLib());
    }
}
