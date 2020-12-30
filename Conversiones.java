public class Conversiones {
    
    private double metros;
    private double centimetros;
    private double kilometros;
    private double milimetros;
    
    //Metodos para conversión de metros a otras unidades 
    
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
    
}
