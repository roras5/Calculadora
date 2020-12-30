import java.util.*;
public class Main{


    public static void main(String[] args) {

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


       





       

        
    }


    /*
    Teniendo en cuenta que queda poco tiempo para realizarlo, el proyecto será una simple calculadora de conversiones entre unidades métricas. El usuario debe poder introducir una cantidad, la unidad original y la unidad destino y el sistema debe calcular la conversión y reportar el resultado. Las unidades a manejar son: m, cm, mm, Km, millas, pulgadas, pies. El proyecto se entrega a través de Tegel y tienen como máximo para la entrega la fecha del ordinario.  
    */



}