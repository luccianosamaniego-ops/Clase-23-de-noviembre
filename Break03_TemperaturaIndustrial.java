import java.util.Scanner;

public class Break03_TemperaturaIndustrial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lecturas = 0;
        double tempCritica = 0;

        while (true) {
            System.out.print("Ingrese temperatura (°C): ");
            double temp = sc.nextDouble();
            lecturas++;
            if (temp > 95.0) {
                tempCritica = temp;
                break;
            }
        }

        System.out.println("Temperatura critica encontrada: " + tempCritica + " °C");
        System.out.println("Numero de lecturas realizadas: " + lecturas);
        sc.close();
    }
}
