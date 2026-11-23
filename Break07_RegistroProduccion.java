import java.util.Scanner;

public class Break07_RegistroProduccion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int horas = 0;
        double total = 0;

        while (true) {
            System.out.print("Produccion por hora (0 para detener): ");
            double prod = sc.nextDouble();
            if (prod == 0) {
                break;
            }
            total += prod;
            horas++;
        }

        System.out.println("Total producido: " + total);
        System.out.println("Cantidad de horas registradas: " + horas);
        sc.close();
    }
}
