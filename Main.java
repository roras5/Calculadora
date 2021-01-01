public class Main {

    public static void main(String[] args) {
        //menu
        String[] opcionesMenu = {"metros", "centimetros", "milimetros", "kilometros", "millas", "pies", "pulgadas"};
        //clases
        Menu m = new Menu(opcionesMenu);
        Vista vista=new Vista();
        Conversor convertir =new Conversor();
        //bandera
        boolean continua=false;

        //Revisar
        
        do{
        m.setTitulo("Convertidor de unidades metricas");
        m.muestraMenu();
        System.out.println("Elige la unidad de origen: ");
        int unidadOrigen = m.getOpcion();
        
        System.out.println("Elige la unidad de destino: ");
        int unidadDestino = m.getOpcion();
        
        String prefijo =opcionesMenu[unidadDestino-1];
       
        double cantidad=vista.solicitaCantidad();
        
        // hacemos la conversion
        convertir.conversion(cantidad, unidadOrigen, unidadDestino, prefijo);
        
        continua=vista.Continuar();
        
        }while(continua);
    }

}
