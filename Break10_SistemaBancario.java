import java.util.Scanner;

public class Break10_SistemaBancario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int procesados = 0;
        double transferenciaDetectada = 0;

        while (true) {
            System.out.print("Monto de transferencia (S/): ");
            double monto = sc.nextDouble();
            procesados++;
            if (monto > 100000) {
                transferenciaDetectada = monto;
                break;
            }
        }

        System.out.println("Transferencia detectada: S/ " + transferenciaDetectada);
        System.out.println("Cantidad de registros procesados: " + procesados);
        sc.close();
    }
}
