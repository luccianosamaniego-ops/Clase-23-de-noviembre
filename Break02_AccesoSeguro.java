import java.util.Scanner;

public class Break02_AccesoSeguro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final String CLAVE_CORRECTA = "java2026";
        int intentoAccedido = -1;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Intento " + i + "/5 - Ingrese contrasena: ");
            String clave = sc.nextLine();
            if (clave.equals(CLAVE_CORRECTA)) {
                intentoAccedido = i;
                break;
            }
        }

        if (intentoAccedido != -1) {
            System.out.println("Acceso concedido en el intento #" + intentoAccedido);
        } else {
            System.out.println("Acceso denegado. Se agotaron los 5 intentos.");
        }
        sc.close();
    }
}
