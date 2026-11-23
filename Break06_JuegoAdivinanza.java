import java.util.Random;
import java.util.Scanner;

public class Break06_JuegoAdivinanza {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int secreto = new Random().nextInt(100) + 1;
        int intentos = 0;

        while (true) {
            System.out.print("Adivina el numero (1 - 100): ");
            int guess = sc.nextInt();
            intentos++;

            if (guess == secreto) {
                break;
            } else if (guess < secreto) {
                System.out.println("Muy bajo.");
            } else {
                System.out.println("Muy alto.");
            }
        }

        System.out.println("Felicitaciones! Adivinaste el numero " + secreto + ".");
        System.out.println("Numero de intentos usados: " + intentos);
        sc.close();
    }
}
