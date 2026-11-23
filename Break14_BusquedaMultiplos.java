public class Break14_BusquedaMultiplos {
    public static void main(String[] args) {
        int encontrado = -1;
        for (int i = 1; ; i++) {
            if (i % 17 == 0 && i % 23 == 0) {
                encontrado = i;
                break;
            }
        }
        System.out.println("Numero encontrado: " + encontrado);
    }
}
