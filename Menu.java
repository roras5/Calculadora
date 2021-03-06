/* 
    Equipo 1 
        Sanchez Mendieta Jesus Alberto #0912365
        Flores Garcia Samuel  #2020967
        Colin Aguilar Jose Manuel  #2020960
        Vega Meza Ramiro  #2021022
        Romero Rios Jose Angel #2021011

*/
import java.util.Scanner;

public class Menu {
        String[] opciones;
    String titulo;
    
    public Menu(String[] ops){
        opciones = ops;
    }
    
    public Menu(String[] ops, String t){
        opciones = ops;
        titulo = t;
    }
    
    public Menu(){
    }
    
    public int getOpcion(){
        Scanner entrada;
        boolean bandera=false;
        int val=0;
        do{
            try{
                entrada = new Scanner(System.in);
               
                val = entrada.nextInt();
                if(val < 1 || val > opciones.length){
                    System.out.println("Opcion incorrecta, las opciones van de 1 a "+opciones.length);
                    bandera = true;
                } else {
                    bandera = false;
                }
            }catch(Exception e){
                System.out.println("Debes proporcionar un numero entero");
                bandera=true;
            }
        }while(bandera);
        return val;
    }
    
    public void setOpciones(String[] ops){
        opciones = ops;
    }
    
    public void setTitulo(String t){
        titulo = t;
    }
    
    public void muestraMenu(){
        if(titulo != null){
            System.out.println("=============================================");
            System.out.println(titulo);
            System.out.println("=============================================");
        }
        if(opciones !=null){
            for(int i=0;i<opciones.length;i++){
                System.out.println((i+1)+") "+opciones[i]);
            }
        }
    }
}
