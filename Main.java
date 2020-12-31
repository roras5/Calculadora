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
        
        do{
        m.setTitulo("Convertidor de unidades metricas");
        m.muestraMenu();
        System.out.println("Elige la unidad de origen: ");
        int unidadOrigen = m.getOpcion();
        
        System.out.println("Elige la unidad de destino: ");
        int unidadDestino = m.getOpcion();
        
        double cantidad=vista.solicitaCantidad();
        
        // hacemos la conversion
        convertir.conversion(cantidad, unidadOrigen, unidadDestino);
        
        continua=vista.Continuar();
        
        }while(continua);
    }

}
