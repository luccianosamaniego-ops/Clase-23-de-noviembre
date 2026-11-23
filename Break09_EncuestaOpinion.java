import java.util.Scanner;

public class Break09_EncuestaOpinion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalRespuestas = 0;
        double suma = 0;

        while (true) {
            System.out.print("Respuesta (1 al 5, o 0 para finalizar): ");
            int resp = sc.nextInt();
            if (resp == 0) {
                break;
            }
            if (resp >= 1 && resp <= 5) {
                totalRespuestas++;
                suma += resp;
            } else {
                System.out.println("Valor fuera de 1-5.");
            }
        }

        System.out.println("Total de respuestas: " + totalRespuestas);
        if (totalRespuestas > 0) {
            System.out.printf("Promedio de satisfaccion: %.2f%n", suma / totalRespuestas);
        }
        sc.close();
    }
}
