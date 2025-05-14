import java.util.Random;
import java.util.Scanner;

public class Devinette {
        public static void main(String[] args) {
            Random random = new Random();
            Scanner scanner = new Scanner(System.in);

            int nombreSecret = random.nextInt(100) + 1; // entre 1 et 100
            int essaisMax = 10;
            int essais = 0;
            boolean trouvé = false;

            System.out.println(" Bienvenue dans le jeu de devinettes !");
            System.out.println("Devinez un nombre entre 1 et 100. Vous avez 10 essais.");

            while (essais < essaisMax) {
                System.out.print("Essai " + (essais + 1) + " : ");

                if (!scanner.hasNextInt()) {
                    System.out.println("Veuillez entrer un nombre valide !");
                    scanner.next(); // ignore l'entrée invalide
                    continue;
                }

                int proposition = scanner.nextInt();
                essais++;

                if (proposition < nombreSecret) {
                    System.out.println("Trop petit !");
                } else if (proposition > nombreSecret) {
                    System.out.println(" Trop grand !");
                } else {
                    System.out.println(" Bravo ! Vous avez trouvé le nombre " + nombreSecret + " en " + essais + " essais.");
                    trouvé = true;
                    break;
                }
            }

            if (!trouvé) {
                System.out.println(" Vous avez utilisé vos 10 essais. Le nombre était : " + nombreSecret);
            }

            scanner.close();
        }
    }

