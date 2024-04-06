import java.util.Scanner;

public class AfficherSaisir {
    public static void main(String[] args) {
        // Afficher "Bonjour dans la console"
        System.out.println("Bonjour");

     // Afficher le nombre pi avec 3 chiffres après la virgule
        System.out.printf("%5.3f \n", Math.PI);

        // Saisir un nombre n et afficher un nombre aléatoire entre 0 et n
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisir un nombre n : ");
        int n = scanner.nextInt();
        double randomNum = Math.random() * n;
        System.out.println("Nombre aléatoire entre 0 et n : " + randomNum);

        // Fermer le scanner
        scanner.close();
    }
}
