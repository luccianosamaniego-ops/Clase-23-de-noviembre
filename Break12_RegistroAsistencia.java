import java.util.Scanner;

public class Break12_RegistroAsistencia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int asistentes = 0;

        while (true) {
            System.out.print("Nombre del estudiante (FIN para terminar): ");
            String nombre = sc.nextLine().trim();
            if (nombre.equalsIgnoreCase("FIN")) {
                break;
            }
            if (!nombre.isEmpty()) {
                asistentes++;
            }
        }

        System.out.println("Total de asistentes registrados: " + asistentes);
        sc.close();
    }
}
