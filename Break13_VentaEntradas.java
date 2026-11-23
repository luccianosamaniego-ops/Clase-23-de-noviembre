import java.util.Scanner;

public class Break13_VentaEntradas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int META = 500;
        int totalVendido = 0;
        int ventasRealizadas = 0;

        while (true) {
            System.out.print("Entradas vendidas en esta operacion: ");
            int cant = sc.nextInt();
            if (cant > 0) {
                totalVendido += cant;
                ventasRealizadas++;
            }
            if (totalVendido >= META) {
                break;
            }
        }

        System.out.println("Total vendido: " + totalVendido);
        System.out.println("Numero de ventas realizadas: " + ventasRealizadas);
        sc.close();
    }
}
