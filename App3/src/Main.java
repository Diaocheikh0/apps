import entity.Chemise;
import entity.ChemiseImpl;
import entity.Montre;


public class Main {
    public static void main(String[] args) {
        Chemise c1 = new Chemise(1, " de marque HAST", "de chez HAST Couture");
        Montre m1 = new Montre(1, " de marque rolex", "de nature platine");

        System.out.println("Chemise : "+ c1.getId()+" "+ c1.getLib()+" "+ c1.getCouture());
        System.out.println("Montre : "+ m1.getId()+ " "+ m1.getLib()+" "+ m1.getNature());

        ChemiseImpl chemiseC = new ChemiseImpl();

        System.out.println("\nSaisir une nouveau chemise : ");
        Chemise c2 = chemiseC.saisie();

        System.out.println("\nLa chemise saisi est : ");
        chemiseC.affichage(c2);
    }
}