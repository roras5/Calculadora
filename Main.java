
public class Main {

    public static void main(String[] args) {
        CalculadoraVista vista = new CalculadoraVista();
        Conversiones conversion = new Conversiones();
        boolean sigue = false;

        do {
            //pedimos datos
            System.out.println("=====Bienvenido a el conversor de unidades UAEMEX============");
            System.out.println("Escriba una unidad de origen: ");
            String unidadOrigen = vista.solicitaUnidad();
            System.out.println("Escriba una unidad de destino: ");
            String unidadDestino = vista.solicitaUnidad();
            double cantidado = vista.solicitaCantidad();
            //Ejecutamos conversion
            double resultado = conversion.conversion(cantidado, unidadOrigen, unidadDestino);
            System.out.println("resultado de la conversion = " + resultado +" "+unidadDestino);
            sigue = vista.Continuar();
        } while (sigue);

    }

}
