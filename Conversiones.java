<<<<<<< HEAD
=======
import jdk.javadoc.internal.doclets.toolkit.resources.doclets;

public class Conversiones {
    
    private double metros;
    private double centimetros;
    private double kilometros;
    private double milimetros;
    
    //Metodos para conversión de metros a otras unidades 
    //las excepciones se simplifican gracias a la clase vista
   //========Metros===============
   public double metrosAcentimetros(double Cantidadmetros){

        this.centimetros = Cantidadmetros*100;
       
        return this.centimetros;
   }
>>>>>>> 7e3c1f4e2b992828b50819e51db0e0b1241ce839

public class Conversiones {

<<<<<<< HEAD
    public Conversiones() {
    }
    private String metros="metros";
    private String centimetros="centimetro";
    private String milimetros="milimetros";
    private String kilometros="kilometro";
    private String millas="millas";
    private String pies="pies";
    private String pulgadas="pulgadas";
    
    public double conversion(double cantidad,String unidadOriginal,String unidadDestino){
       double resultado=1;
       if(unidadOriginal.compareTo(unidadDestino)==0){
           System.out.println("No se puede convertir a la misma unidad");
       }
        //=================metros===========================================================
        //metros a centimetros
        if(unidadOriginal.compareTo(metros)==0 && unidadDestino.compareTo(centimetros)==0 ){
        resultado=cantidad*100;
        }
        //metro a mm
        if(unidadOriginal.compareTo(metros)==0 && unidadDestino.compareTo(milimetros)==0 ){
        resultado=cantidad*100;
        }
        //metro a km
        if(unidadOriginal.compareTo(metros)==0 && unidadDestino.compareTo(kilometros)==0){
        resultado=cantidad/1000;
        }
        //metro a milla
        if(unidadOriginal.compareTo(metros)==0 && unidadDestino.compareTo(millas)==0 ){
        resultado=cantidad/1609.344;
        }
        //metro a pies
        if(unidadOriginal.compareTo(metros)==0 && unidadDestino.compareTo(pies)==0 ){
        resultado=cantidad*3.2808399;
        }
        //metros a pulgadas
        if(unidadOriginal.compareTo(metros)==0 && unidadDestino.compareTo(pulgadas)==0 ){
        resultado=cantidad*39.3700787;
        }        
        //====================centimetros======================================================
        //cm a m
        if(unidadOriginal.compareTo(centimetros)==0 && unidadDestino.compareTo(metros)==0 ){
        resultado=cantidad/100;
        }
        //cm a mm
        if(unidadOriginal.compareTo(centimetros)==0 && unidadDestino.compareTo(milimetros)==0 ){
        resultado=cantidad*10;
        }
        //cm a km
        if(unidadOriginal.compareTo(centimetros)==0 && unidadDestino.compareTo(kilometros)==0){
        resultado=cantidad/100000;
        }
        //cm a milla
        if(unidadOriginal.compareTo(centimetros)==0 && unidadDestino.compareTo(millas)==0 ){
        resultado=cantidad/160934;
        }
        //cm a pies
        if(unidadOriginal.compareTo(centimetros)==0 && unidadDestino.compareTo(pies)==0 ){
        resultado=cantidad/30.48;
        }
        //cm a pulgadas
        if(unidadOriginal.compareTo(centimetros)==0 && unidadDestino.compareTo(pulgadas)==0 ){
        resultado=cantidad/2.54;
        }     
        //======milimetro===================================================================
        //mm a m
        if(unidadOriginal.compareTo(milimetros)==0 && unidadDestino.compareTo(metros)==0 ){
        resultado=cantidad/1000;
        }
        //mm a cm
        if(unidadOriginal.compareTo(milimetros)==0 && unidadDestino.compareTo(centimetros)==0 ){
        resultado=cantidad/10;
        }
        //mm a km
        if(unidadOriginal.compareTo(milimetros)==0 && unidadDestino.compareTo(kilometros)==0){
        resultado=cantidad/1e+6;
        }
        //mm a milla
        if(unidadOriginal.compareTo(milimetros)==0 && unidadDestino.compareTo(millas)==0 ){
        resultado=cantidad/1.609e+6;
        }
        //mm a pies
        if(unidadOriginal.compareTo(milimetros)==0 && unidadDestino.compareTo(pies)==0 ){
        resultado=cantidad*305;
        }
        //mm a pulgadas
        if(unidadOriginal.compareTo(milimetros)==0 && unidadDestino.compareTo(pulgadas)==0 ){
        resultado=cantidad/25.4;
        }   
        //=============================kilometros============================================
        //km a m
        if(unidadOriginal.compareTo(kilometros)==0 && unidadDestino.compareTo(metros)==0 ){
        resultado=cantidad*1000;
        }
        //km a cm
        if(unidadOriginal.compareTo(kilometros)==0 && unidadDestino.compareTo(centimetros)==0 ){
        resultado=cantidad/100000;
        }
        //km a mm
        if(unidadOriginal.compareTo(kilometros)==0 && unidadDestino.compareTo(milimetros)==0){
        resultado=cantidad*1e+6;
        }
        //km a milla
        if(unidadOriginal.compareTo(kilometros)==0 && unidadDestino.compareTo(millas)==0 ){
        resultado=cantidad/1.609;
        }
        //km a pies
        if(unidadOriginal.compareTo(kilometros)==0 && unidadDestino.compareTo(pies)==0 ){
        resultado=cantidad*3281;
        }
        //km a pulgadas
        if(unidadOriginal.compareTo(kilometros)==0 && unidadDestino.compareTo(pulgadas)==0 ){
        resultado=cantidad*39370;
        }
        //======millas===================================================================
        //milla a m
        if(unidadOriginal.compareTo(kilometros)==0 && unidadDestino.compareTo(metros)==0 ){
        resultado=cantidad/1609;
        }
        //milla a cm
        if(unidadOriginal.compareTo(kilometros)==0 && unidadDestino.compareTo(centimetros)==0 ){
        resultado=cantidad/160934;
        }
        //milla a mm
        if(unidadOriginal.compareTo(kilometros)==0 && unidadDestino.compareTo(milimetros)==0){
        resultado=cantidad*1.609e+6;
        }
        //milla a km
        if(unidadOriginal.compareTo(kilometros)==0 && unidadDestino.compareTo(millas)==0 ){
        resultado=cantidad*1.609;
        }
        //milla a pies
        if(unidadOriginal.compareTo(kilometros)==0 && unidadDestino.compareTo(pies)==0 ){
        resultado=cantidad*5280;
        }
        //milla a pulgadas
        if(unidadOriginal.compareTo(kilometros)==0 && unidadDestino.compareTo(pulgadas)==0 ){
        resultado=cantidad*63360;
        }
        //======Pies===================================================================
        //pies a m
        if(unidadOriginal.compareTo(pies)==0 && unidadDestino.compareTo(metros)==0 ){
        resultado=cantidad/3.281;
        }
        //pies a cm
        if(unidadOriginal.compareTo(pies)==0 && unidadDestino.compareTo(centimetros)==0 ){
        resultado=cantidad*30.48;
        }
        //pies a mm
        if(unidadOriginal.compareTo(pies)==0 && unidadDestino.compareTo(milimetros)==0){
        resultado=cantidad*305;
        }
        //pies a km
        if(unidadOriginal.compareTo(pies)==0 && unidadDestino.compareTo(millas)==0 ){
        resultado=cantidad/3281;
        }
        //pies a milla
        if(unidadOriginal.compareTo(pies)==0 && unidadDestino.compareTo(millas)==0 ){
        resultado=cantidad/5280;
        }
        //pies a pulgadas
        if(unidadOriginal.compareTo(pies)==0 && unidadDestino.compareTo(pulgadas)==0 ){
        resultado=cantidad*12;
        }
        //=============================pulgadas de pulagadas==================00
        
        return resultado;
        }
        
=======
   public double metrosAmilimetros(double Cantidadmetros){
        this.milimetros = Cantidadmetros* 1000;
        return milimetros;
   }
   
   //========Centimetros===============

   public double centimetrosAmetros(double Cantidadcentimetros){
     this.metros = Cantidadcentimetros * 100;
     return metros;

   }

   public double centimetrosAkilometros(double Cantidadcentimetros){
     this.kilometros = Cantidadcentimetros * 100000;
     return kilometros;
   }


   public double centimetrosAmilimetros(double Cantidadcentimetros){
     this.milimetros = Cantidadcentimetros /10;
     return 0.2;

   }

   //========kilometros===============

   public double kilometrosAmetros(double Cantidadkilometros){

     this.kilometros = Cantidadkilometros *1000;
     return kilometros;
   }

   public double kilometrosAcentrimetros(double Cantidadkilometros){
     this.kilometros = Cantidadkilometros * 100000;
     return kilometros;   
   }

   public double kilometrosAmilimetros(double Cantidadkilometros){
     this.kilometros = Cantidadkilometros / 0.0000010000;
     return kilometros;
   }

     //========Milimetros===============

     public double milimetrosAmetros(double Cantidadmilimetros){
          this.milimetros = Cantidadmilimetros/1000;

          return milimetros;
     }

     public double milimetrosAcentimetros(double Cantidadmilimetros){
          this.milimetros = Cantidadmilimetros * 10;
          return milimetros;
     }

     public double milimetrosAkilometros(double Cantidadmilimetros){

          this.milimetros = Cantidadmilimetros/1000000;
          return milimetros;
     }


>>>>>>> 7e3c1f4e2b992828b50819e51db0e0b1241ce839
}

