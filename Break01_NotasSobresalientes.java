import java.util.Scanner;

public class Break01_NotasSobresalientes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cantidad = 0;
        double suma = 0, max = Double.NEGATIVE_INFINITY, min = Double.POSITIVE_INFINITY;

        while (true) {
            System.out.print("Ingrese nota (20 para terminar): ");
            double nota = sc.nextDouble();
            if (nota == 20) {
                break;
            }
            cantidad++;
            suma += nota;
            if (nota > max) max = nota;
            if (nota < min) min = nota;
        }

        System.out.println("Cantidad de notas registradas: " + cantidad);
        if (cantidad > 0) {
            System.out.printf("Promedio de notas: %.2f%n", suma / cantidad);
            System.out.println("Nota maxima: " + max);
            System.out.println("Nota minima: " + min);
        } else {
            System.out.println("No se registraron notas antes del 20.");
        }
        sc.close();
    }
}
