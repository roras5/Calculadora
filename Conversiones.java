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

   public double metrosAkilometros(double Cantidadmetros){
        this.kilometros = Cantidadmetros/ 1000;

        return kilometros;

   }

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
    
}
