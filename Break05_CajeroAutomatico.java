import java.util.Scanner;

public class Break05_CajeroAutomatico {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int operaciones = 0;

        while (true) {
            System.out.println("\n--- CAJERO AUTOMATICO ---");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Depositar");
            System.out.println("3. Retirar");
            System.out.println("4. Salir");
            System.out.print("Elija una opcion: ");
            int op = sc.nextInt();

            if (op == 4) {
                break;
            }
            operaciones++;
            switch (op) {
                case 1 -> System.out.println("Saldo disponible: S/ 1,500.00");
                case 2 -> System.out.println("Deposito realizado.");
                case 3 -> System.out.println("Retiro realizado.");
                default -> System.out.println("Opcion invalida.");
            }
        }

        System.out.println("Operaciones realizadas: " + operaciones);
        System.out.println("Cierre de sesion exitoso.");
        sc.close();
    }
}
