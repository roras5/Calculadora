 

public class Conversiones {

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
       double resultado=0;
       if(unidadOriginal.compareTo(unidadDestino)==0){
           System.out.println("Elijio la mismo unidad");
           resultado=cantidad;
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
        //=============================pulgadas==================
         //pulgadas a m
        if(unidadOriginal.compareTo(pulgadas)==0 && unidadDestino.compareTo(metros)==0 ){
        resultado=cantidad/39.37;
        }
        //pulgadas a cm
        if(unidadOriginal.compareTo(pulgadas)==0 && unidadDestino.compareTo(centimetros)==0 ){
        resultado=cantidad*2.54;
        }
        //pulgadas a mm
        if(unidadOriginal.compareTo(pulgadas)==0 && unidadDestino.compareTo(milimetros)==0){
        resultado=cantidad*25.4;
        }
        //pulgadas a km
        if(unidadOriginal.compareTo(pulgadas)==0 && unidadDestino.compareTo(kilometros)==0 ){
        resultado=cantidad/39370;
        }
        //pulgados a milla
        if(unidadOriginal.compareTo(pulgadas)==0 && unidadDestino.compareTo(millas)==0 ){
        resultado=cantidad/63360;
        }
        //pulgadas a pies
        if(unidadOriginal.compareTo(pulgadas)==0 && unidadDestino.compareTo(pies)==0 ){
        resultado=cantidad/12;
        }
        return resultado;
        }
        
}

