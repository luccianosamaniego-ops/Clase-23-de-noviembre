import java.util.Scanner;

public class Break04_NumeroPrimo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un numero entero: ");
        int n = sc.nextInt();
        boolean esPrimo = n > 1;
        int primerDivisor = -1;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                esPrimo = false;
                primerDivisor = i;
                break;
            }
        }

        System.out.println("Es primo?: " + (esPrimo ? "Si" : "No"));
        if (!esPrimo && primerDivisor != -1) {
            System.out.println("Primer divisor encontrado: " + primerDivisor);
        } else if (esPrimo) {
            System.out.println("Primer divisor encontrado: Ninguno (solo 1 y " + n + ")");
        }
        sc.close();
    }
}
