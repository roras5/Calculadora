import java.util.*;
public class Main{
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
        //variable que regresa a el menu principal
        boolean regresar=false;
       
        do{
        //calculadora ===============menu principal===================
        menuPrincipal.setTitulo("Bienbenido a la calculadora de conversiones");
        menuPrincipal.muestraMenu();
        op = menuPrincipal.getOpcion();
        switch (op) {

            case 1://Metros a...

<<<<<<< HEAD
                //===============menu de metros====================
                menuMetros.setTitulo("A que unidad decia convertir los metros");
                menuMetros.muestraMenu();
                op = menuMetros.getOpcion();

                switch (op) {

                    case 1://metros a cm
                        break;
                    case 2://metros a km
                        break;
                    case 3://metros a mm
                        break;
                    case 4://regresar
                        regresar=true;
                        
                    default:
                        System.out.println("Opcion invalida");
=======
        Scanner scan = new Scanner(System.in);

        Conversiones objeto = new Conversiones();

        String menu_principal [] = {"Metros","Centimetros","Kilometros", "Milimetros","Salir"};
        String metrosA [] = {"Metros a cm ", "Metros a km", "Metros a mm"};
        String centimetrosA [] = {"Centimetros a m", "Centimetros a Km","Centimetros a mm"};
        String kilometrosA [] ={"Kilometros a m", "Kilometros a cm", "Kilometros a mm"};
        String milimetrosA [] = {"Milimetros a m", "Milimetros a cm", "Milimetros a Kilometros"};

        Menus menu_p = new Menus(); // Menu principal
        Menus menu_m = new Menus(); // Menu metros A
        Menus menu_c = new Menus(); // Menus centimetros A
        

        menu_p.setTitulo("Bienvenidos");
        menu_p.setOpciones(menu_principal);
        menu_p.muestraMenu();

       //menu_dinamico.getOpcion();


        switch(menu_p.getOpcion()){

            case 1: 
            //Conversion de metros a otras unidades
                menu_m.setTitulo("Metros A ");
                menu_m.setOpciones(metrosA);
                menu_m.muestraMenu();

                
                switch (menu_m.getOpcion()) { 
                    case 1:  // Metros a centimetros
                    System.out.println("Ingrese los metros");
                    double aux = scan.nextDouble();
                    objeto.setMetros(aux);

                    System.out.println(objeto.metrosAcentimetros()+"cm");
                    
                    
                    break;

                    case 2: // Metros a kilometros
                    
                    break;

                    case 3: // Metros a milimetros
                    
                    break;

                    default: 
                    System.out.println("Esa no te la vengo manejando krnal");
                    
                    break;
                    
                }
            
            break;

            case 2:  break;

            case 3: break;

            case 4: break;

            case 5: 
                System.exit(0);
            break;

            default:
                System.out.println("Esa no la tengo carnal");
                break;

        } //Final del programa "SWITCH"


       




>>>>>>> d59725913b1fd86d8a9df70496b23d85aff52326

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
