public class Break08_BuscarCodigo {
    public static void main(String[] args) {
        String[] codigos = {"P001", "X999", "ABC123", "M450", "Z789"};
        int revisados = 0;
        int posicion = -1;

        for (int i = 0; i < codigos.length; i++) {
            revisados++;
            if (codigos[i].equals("ABC123")) {
                posicion = i;
                break;
            }
        }

        System.out.println("Cantidad de codigos revisados: " + revisados);
        if (posicion != -1) {
            System.out.println("Posicion del codigo encontrado (indice): " + posicion);
        } else {
            System.out.println("Codigo no encontrado.");
        }
    }
}
