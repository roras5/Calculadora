public class Conversiones {
    
    private double metros;
    private double centimetros =4.2;
    private double kilometro;
    private double milimetros;


    public void setMetros(double m){

        this.metros = m;
    }

   public double metrosAcentimetros(){

        if(metros == 0){

            System.out.println("El valor debe ser diferente de cero");
        }else{

            centimetros = metros*100;
            
        }
        return this.centimetros;
       


   }




    
}
