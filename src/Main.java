public class Main {

    private static final int[] BILLETES = {2000, 5000, 10000, 20000, 50000, 100000};
    private static final int[] MONEDAS = {50, 100, 200, 500, 1000};

    public static void main(String[] args) {
        int saldo = 50000;
        int producto = 5650;

        System.out.println("Saldo: " + saldo);
        System.out.println("Precio producto: " + producto + "\n");

        if (saldo < producto) {
            System.out.println("Saldo insuficiente");
        } else if (saldo == producto) {
            System.out.println("No hay vueltas");
        } else {
            int vueltas = saldo - producto;
            System.out.println("Vueltas: " + vueltas + "\n");
            calcularVueltas(vueltas);
        }

    }

    public static void calcularVueltas(int cantidad) {
        System.out.println("Billetes:");
        for (int i = BILLETES.length - 1; i >= 0; i--) {
            int billete = BILLETES[i];
            if (cantidad / billete > 0) {
                System.out.println("Billetes de " + billete + ": " + (cantidad / billete));
                cantidad = cantidad % billete;
            }
        }

        System.out.println("\nMonedas:");
        for (int i = MONEDAS.length - 1; i >= 0; i--) {
            int moneda = MONEDAS[i];
            if (cantidad / moneda > 0) {
                System.out.println("Monedas de " + moneda + ": " + (cantidad / moneda));
                cantidad = cantidad % moneda;
            }
        }
    }
}