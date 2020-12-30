
public class Main {

    public static void main(String[] args) {
        //menu de opciones
        //faltan unidades metricas ojo
        String menu_principal[] = {"Metros", "Centimetros", "Kilometros", "Milimetros", "salir"};
        Menu menuPrincipal = new Menu(menu_principal);
        String metrosA[] = {"Metros a cm ", "Metros a km", "Metros a mm","regresar"};
        Menu menuMetros = new Menu(metrosA);
        String centimetrosA[] = {"Centimetros a m", "Centimetros a Km", "Centimetros a mm","regresar"};
        Menu menuCentrimetos = new Menu(centimetrosA);
        String kilometrosA[] = {"Kilometros a m", "Kilometros a cm", "Kilometros a mm","regresar"};
        Menu menuKilometros = new Menu(kilometrosA);
        String milimetrosA[] = {"Milimetros a m", "Milimetros a cm", "Milimetros a Kilometros","regresar"};
        Menu menuMilimetro = new Menu(milimetrosA);

        //variable de opciones
        int op;
        double cantidad;
        double resultado;
        
        //variable que regresa a el menu principal
        boolean regresar=false;
        //Clase conversiones
        Conversiones conversion =new Conversiones();
        //Clase calculadora vista
        CalculadoraVista vista=new CalculadoraVista();
        
        do{
        //calculadora ===============menu principal===================
        menuPrincipal.setTitulo("Bienbenido a la calculadora de conversiones");
        menuPrincipal.muestraMenu();
        op = menuPrincipal.getOpcion();
        switch (op) {

            case 1://Metros a...

                //===============menu de metros====================
                menuMetros.setTitulo("A que unidad decia convertir los metros");
                menuMetros.muestraMenu();
                op = menuMetros.getOpcion();

                switch (op) {

                    case 1://metros a cm
                        cantidad=vista.solicitaCantidad();
                        resultado = conversion.metrosAcentimetros(cantidad);
                        System.out.println("resultado = " + resultado);
                        break;
                    case 2://metros a km
                        break;
                    case 3://metros a mm
                        break;
                    case 4://regresar
                        regresar=true;
                        
                    default:
                        System.out.println("Opcion invalida");

                }

                break;
            case 2://Centimetros a...

                //===============menu de centimetros====================
                menuCentrimetos.setTitulo("A que unidad decia convertir los centimetros");
                menuCentrimetos.muestraMenu();
                op = menuCentrimetos.getOpcion();

                switch (op) {
                    case 1://centimetros a metros

                        break;
                    case 2://centimetros a km

                        break;
                    case 3://centimetros a mm
                        
                        break;
                    case 4://regresar
                        regresar=true;
                        
                    default:
                        System.out.println("opcion invalida");
                }
                break;
            case 3://Kilometros a...

                //===============menu de kilometros====================
                menuKilometros.setTitulo("A que unidad decia convertir los kilometros");
                menuKilometros.muestraMenu();
                op = menuKilometros.getOpcion();

                switch (op) {
                    case 1://Kilometros a m

                        break;
                    case 2://Kilometros a cm

                        break;
                    case 3://Kilometros a mm

                        break;
                    case 4://regresar
                        regresar=true;
                        
                    default:
                        System.out.println("opcion invalida");

                }
                break;
            case 4://Milimetross a ...

                //===============menu de milimetros====================
                menuMilimetro.setTitulo("A que unidad decia convertir los milimetros");
                menuMilimetro.muestraMenu();
                op = menuMilimetro.getOpcion();
                
                switch (op) {
                    case 1://Milimetros a m

                        break;
                    case 2://Milimetros a cm

                        break;
                    case 3://Milimetros a Kilometros

                        break;
                    case 4:
                        regresar=true;
                    default:
                        System.out.println("opcion invalida");

                }
                break;
            case 5://salir
                return;
            default:
                System.out.println("Opcion invalida intente de nuevo");

        }
        
        }while(regresar);

    }

}
