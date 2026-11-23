import java.util.Scanner;

public class Break15_VerificacionInventario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int validos = 0;
        String productoError = "";

        while (true) {
            System.out.print("Nombre del producto: ");
            String prod = sc.nextLine();
            System.out.print("Stock: ");
            int stock = sc.nextInt();
            sc.nextLine();

            if (stock < 0) {
                productoError = prod + " (stock: " + stock + ")";
                break;
            }
            validos++;
        }

        System.out.println("Producto con error: " + productoError);
        System.out.println("Cantidad de registros validos: " + validos);
        sc.close();
    }
}
