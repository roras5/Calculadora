public class Main {

    public static void main(String[] args) {
        String[] opcionesUnidades = {"metros", "centimetros", "milimetros", "kilometros", "millas", "pies", "pulgadas"};
        int unidadOriginal, unidadDestino;
        String unidad;
        double longitud, longitud_dless, resultado;
        boolean continuar = false;
        
        // Creaci&oacute;n de objetos
        Menu menuUnidades = new Menu(opcionesUnidades);
        Vista vista = new Vista();
        Conversor convertLongitud = new Conversor();        
        
        // Asignaci&oacute;n de t&iacute;tulo al men&uacute; de Unidades
        menuUnidades.setTitulo("Conversor de longitudes");

        do{
            // --- Solicitud de longitud a convertir: ------------------------------------------
            menuUnidades.muestraMenu();
            System.out.println("Seleccione la unidad inicial:");
            unidadOriginal = menuUnidades.getOpcion();

            System.out.println("Elige la unidad de destino:");
            unidadDestino = menuUnidades.getOpcion();
            
            unidad = opcionesUnidades[unidadDestino - 1];

            longitud = vista.solicitaCantidad();
            
            // --- Coversi&oacute;n de longitud: ------------------------------------------------
            longitud_dless = convertLongitud.dimensionless(longitud, unidadOriginal);
            resultado = convertLongitud.conversion(longitud_dless, unidadDestino);

            // --- Imprimir resultado en pantalla: ----------------------------------------------
            vista.printResultado(resultado, unidad);
            //
            continuar = vista.Continuar();
        }while(continuar);
    }

}
