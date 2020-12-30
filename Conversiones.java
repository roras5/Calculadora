public class Conversiones {
    
    private double metros;
    private double centimetros;
    private double kilometros;
    private double milimetros;


    public void setMetros(double m){

        this.metros = m;
    }


    public void setCentimetros(double cm){

        this.centimetros = cm;
    }


    public void setKilometros(double km){

        this.kilometros = km;
    }
    public void setMilimetros(double mm){

       this.milimetros = mm;
    }

    // Metodos para conversión de metros a otras unidades 
   public double metrosAcentimetros(){

        centimetros = metros*100;
       
        return this.centimetros;
   }

   public double metrosAkilometros(){
        kilometros = metros / 1000;

        return kilometros;

   }

   public double metrosAmilimetros(){
        milimetros = metros * 1000;
        return milimetros;
   }

    
}
