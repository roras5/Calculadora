import java.util.*;
public class CalculadoraVista
{
    Scanner entrada = new Scanner(System.in);
    
     public double solicitaCantidad(){
        int val = 0;
        boolean otraVez = false;
        do{
            try{
                System.out.println("Ingrese la cantidad deceada a convertir: ");
                entrada = new Scanner(System.in);
                val = entrada.nextInt();
                otraVez = false;
            } catch(InputMismatchException e){
                System.out.println("Debes proporcionar un double");
                otraVez = true;
            }
        }while(otraVez);
        return val;
    }    
}
