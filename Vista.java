import java.util.*;

public class Vista {

    Scanner entrada = new Scanner(System.in);

    public boolean Continuar() {
        boolean continuar = true;
        boolean otraVez = false;
        do {
            try {
                System.out.println("Decea continuar 1.-Si o 2.-No");
                entrada = new Scanner(System.in);
                int respuesta = entrada.nextInt();
                if (respuesta == 1) {
                    continuar = true;
                } else {
                    continuar = false;
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes proporcionar un numero");
                otraVez = true;
            }
        } while (otraVez);

        return continuar;
    }

    public double solicitaCantidad() {
        int val = 0;
        boolean otraVez = false;
        do {
            try {
                System.out.println("Ingrese una cantidad: ");
                entrada = new Scanner(System.in);
                val = entrada.nextInt();
                otraVez = false;
            } catch (InputMismatchException e) {
                System.out.println("Debes proporcionar un numero");
                otraVez = true;
            }
        } while (otraVez);
        return val;
    }
}
