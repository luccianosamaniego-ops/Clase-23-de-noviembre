import java.util.Scanner;

public class Break11_MonitoreoServidor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int procesados = 0;
        int tiempoCritico = 0;

        while (true) {
            System.out.print("Tiempo de respuesta (ms): ");
            int ms = sc.nextInt();
            procesados++;
            if (ms > 5000) {
                tiempoCritico = ms;
                break;
            }
        }

        System.out.println("Tiempo critico: " + tiempoCritico + " ms");
        System.out.println("Registros procesados: " + procesados);
        sc.close();
    }
}
