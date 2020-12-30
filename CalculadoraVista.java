

import java.util.*;

public class CalculadoraVista {

    Scanner entrada = new Scanner(System.in);

    public double solicitaCantidad() {
        int val = 0;
        boolean otraVez = false;
        do {
            try {
                System.out.println("Ingrese una cantidad");
                entrada = new Scanner(System.in);
                val = entrada.nextInt();
                otraVez = false;
            } catch (InputMismatchException e) {
                System.out.println("Debes proporcionar un double");
                otraVez = true;
            }
        } while (otraVez);
        return val;
    }

    public String solicitaUnidad() {
        String unidad = null;
        boolean otraVez = false;

        do {
            try {
                System.out.println("\"metros\"");
                System.out.println("\"milimetros\"");
                System.out.println("\"kilometros\"");
                System.out.println("\"millas\"");
                System.out.println("\"pies\"");
                System.out.println("\"pulgadas\"");

                System.out.println("Escriba la unidad");
                entrada = new Scanner(System.in);
                unidad = entrada.nextLine();
                if (unidad.compareTo("metros") == 0 || unidad.compareTo("milimetros") == 0 || unidad.compareTo("kilometros") == 0 || unidad.compareTo("millas") == 0 || unidad.compareTo("pies") == 0 || unidad.compareTo("pulgadas") == 0) {
                    otraVez = false;
                } else {
                    otraVez = true;
                }

            } catch (InputMismatchException e) {
                System.out.println("Debes proporcionar una unidad valida");
                otraVez = true;
            }
        } while (otraVez);
        return unidad;
    }

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

}
