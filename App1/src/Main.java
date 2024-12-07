import entity.Employe;
import entity.Etudiant;
import entity.Personne;

public class Main {
    public static void main(String[] args) {
        Employe e1 = new Employe("Niang","Talla","Comptable", 500000);
        Employe e2 = new Employe("Sow","Mohamed","Developper", 700000);

        Etudiant et1 = new Etudiant("Kane","Papa Alpha" ,12.5);
        Etudiant et2 = new Etudiant("Ngom","Cheikh" ,14.56);

        System.out.println("Employe: " + e1.getNom()+" " +e1.getPrenom()+ " " + e1.getFonction() + " avec un salaire de " + e1.getSalaire() + " "+"FCFA");
        System.out.println("Employe: " + e2.getNom()+" " +e2.getPrenom()+ " " + e2.getFonction() + " avec un salaire de " + e2.getSalaire() + " "+"FCFA");

        System.out.println("Etudiant: " + et1.getNom()+" " +et1.getPrenom()+ " "+ "de matriclue : " + et1.getMatricule() + " à une de moyenne de " + et1.getMoyenne());
        System.out.println("Etudiant: " + et2.getNom()+" " +et2.getPrenom()+ " "+ "de matriclue : " + et2.getMatricule() + " à une de moyenne de " + et2.getMoyenne());
    }
}