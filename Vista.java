import java.util.*;

/* 
    Equipo 1 
        Sanchez Mendieta Jesus Alberto #0912365
        Flores Garcia Samuel  #2020967
        Colin Aguilar Jose Manuel  #2020960
        Vega Meza Ramiro  #2021022
        Romero Rios Jose Angel #2021011

*/

public class Vista {

    Scanner entrada = new Scanner(System.in);

    public boolean Continuar() {
        boolean continuar = true;
        boolean otraVez = false;
        do {
            try {
                entrada = new Scanner(System.in);
                System.out.println("Desea continuar 1.- Si o 2.- No");
                int respuesta = entrada.nextInt();

                if(respuesta < 1 || respuesta > 2){
                    System.out.println("Opcion incorrecta, las opciones van de 1 a 2.");
                    otraVez = true;
                }else{
                    otraVez = false;
                    if(respuesta == 1) {
                        continuar = true;
                    }else{
                        continuar = false;
                    }
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes proporcionar un numero");
                otraVez = true;
            }
        } while (otraVez);
        return continuar;
    }

    public double solicitaCantidad() {
        double val = 0;
        boolean otraVez = false;
        do {
            try {
                System.out.println("Ingrese la cantidad: ");
                entrada = new Scanner(System.in);
                val = entrada.nextDouble();
                otraVez = false;
            } catch (InputMismatchException e) {
                System.out.println("Debes proporcionar un numero.");
                otraVez = true;
            }
        } while(otraVez);
        return val;
    }

    public void printResultado(double resultado, String unidad){
        System.out.println("Resultado: "+String.format("%.6f", resultado)+" "+unidad);
    }
}