public class Conversor {

    public void conversion(double cantidad, int unidadOriginal, int unidadDestino) {
        double resultado = 0D;
        if (unidadOriginal == unidadDestino) {
            System.out.println("Elijio la mismo unidad");
            resultado = cantidad;
            
           System.out.println("resultado = " + String.format("%.6f", resultado)+" "+unidadDestino);
        }
        //=================metros===========================================================
        //metros a centimetros
        if (unidadOriginal == 1 && unidadDestino == 2) {
            resultado = cantidad * 100D;
            System.out.println("resultado = " + String.format("%.6f", resultado)+" "+unidadDestino);
        }
        //metro a mm
        if (unidadOriginal == 1 && unidadDestino == 3) {
            resultado = cantidad * 100D;
            System.out.println("resultado = " + String.format("%.6f", resultado)+" "+unidadDestino);
        }
        //metro a km
        if (unidadOriginal == 1 && unidadDestino == 4) {
            resultado = cantidad / 1000D;
            System.out.println("resultado = " + String.format("%.6f", resultado)+" "+unidadDestino);
        }
        //metro a milla
        if (unidadOriginal == 1 && unidadDestino == 5) {
            resultado = cantidad / 1609.344D;
            System.out.println("resultado = " + String.format("%.6f", resultado)+" "+unidadDestino);
        }
        //metro a pies
        if (unidadOriginal == 1 && unidadDestino == 6) {
            resultado = cantidad * 3.2808399D;
            System.out.println("resultado = " + String.format("%.6f", resultado)+" "+unidadDestino);
        }
        //metros a pulgadas
        if (unidadOriginal == 1 && unidadDestino == 7) {
            resultado = cantidad * 39.3700787D;
            System.out.println("resultado = " + String.format("%.6f", resultado)+" "+unidadDestino);
        }
        //====================centimetros======================================================
        //cm a m
        if (unidadOriginal == 2 && unidadDestino == 1) {
            resultado = cantidad / 100D;
            System.out.println("resultado = " + String.format("%.6f", resultado)+" "+unidadDestino);
        }
        //cm a mm
        if (unidadOriginal == 2 && unidadDestino == 3) {
            resultado = cantidad * 10D;
            System.out.println("resultado = " + String.format("%.6f", resultado)+" "+unidadDestino);
        }
        //cm a km
        if (unidadOriginal == 2 && unidadDestino == 4) {
            resultado = cantidad / 100000D;
            System.out.println("resultado = " + String.format("%.6f", resultado)+" "+unidadDestino);
        }
        //cm a milla
        if (unidadOriginal == 2 && unidadDestino == 5) {
            resultado = cantidad / 160934D;
            System.out.println("resultado = " + String.format("%.6f", resultado)+" "+unidadDestino);
        }
        //cm a pies
        if (unidadOriginal == 2 && unidadDestino == 6) {
            resultado = cantidad / 30.48D;
            System.out.println("resultado = " + String.format("%.6f", resultado)+" "+unidadDestino);
        }
        //cm a pulgadas
        if (unidadOriginal == 2 && unidadDestino == 7) {
            resultado = cantidad / 2.54D;
            System.out.println("resultado = " + String.format("%.6f", resultado)+" "+unidadDestino);
        }
        //======milimetro===================================================================
        //mm a m
        if (unidadOriginal == 3 && unidadDestino == 1) {
            resultado = cantidad / 1000D;
            System.out.println("resultado = " + String.format("%.6f", resultado)+" "+unidadDestino);
        }
        //mm a cm
        if (unidadOriginal == 3 && unidadDestino == 2) {
            resultado = cantidad / 10D;
            System.out.println("resultado = " + String.format("%.6f", resultado)+" "+unidadDestino);
        }
        //mm a km
        if (unidadOriginal == 3 && unidadDestino == 4) {
            resultado = cantidad / 1e+6D;
            System.out.println("resultado = " + String.format("%.6f", resultado)+" "+unidadDestino);
        }
        //mm a milla
        if (unidadOriginal == 3 && unidadDestino == 5) {
            resultado = cantidad / 1.609e+6D;
            System.out.println("resultado = " + String.format("%.6f", resultado)+" "+unidadDestino);
        }
        //mm a pies
        if (unidadOriginal == 3 && unidadDestino == 6) {
            resultado = cantidad * 305D;
            System.out.println("resultado = " + String.format("%.6f", resultado)+" "+unidadDestino);
        }
        //mm a pulgadas
        if (unidadOriginal == 3 && unidadDestino == 7) {
            resultado = cantidad / 25.4D;
            System.out.println("resultado = " + String.format("%.6f", resultado)+" "+unidadDestino);
        }
        //=============================kilometros============================================
        //km a m
        if (unidadOriginal == 4 && unidadDestino == 1) {
            resultado = cantidad * 1000D;
            System.out.println("resultado = " + String.format("%.6f", resultado)+" "+unidadDestino);
        }
        //km a cm
        if (unidadOriginal == 4 && unidadDestino == 2) {
            resultado = cantidad / 100000D;
            System.out.println("resultado = " + String.format("%.6f", resultado)+" "+unidadDestino);
        }
        //km a mm
        if (unidadOriginal == 4 && unidadDestino == 3) {
            resultado = cantidad * 1e+6D;
            System.out.println("resultado = " + String.format("%.6f", resultado)+" "+unidadDestino);
        }
        //km a milla
        if (unidadOriginal == 4 && unidadDestino == 5) {
            resultado = cantidad / 1.609D;
            System.out.println("resultado = " + String.format("%.6f", resultado)+" "+unidadDestino);
        }
        //km a pies
        if (unidadOriginal == 4 && unidadDestino == 6) {
            resultado = cantidad * 3281D;
            System.out.println("resultado = " + String.format("%.6f", resultado)+" "+unidadDestino);
        }
        //km a pulgadas
        if (unidadOriginal == 4 && unidadDestino == 7) {
            resultado = cantidad * 39370D;
            System.out.println("resultado = " + String.format("%.6f", resultado)+" "+unidadDestino);
        }
        //======millas===================================================================
        //milla a m
        if (unidadOriginal == 5 && unidadDestino == 1) {
            resultado = cantidad / 1609D;
            System.out.println("resultado = " + String.format("%.6f", resultado)+" "+unidadDestino);
        }
        //milla a cm
        if (unidadOriginal == 5 && unidadDestino == 2) {
            resultado = cantidad / 160934D;
            System.out.println("resultado = " + String.format("%.6f", resultado)+" "+unidadDestino);
        }
        //milla a mm
        if (unidadOriginal == 5 && unidadDestino == 3) {
            resultado = cantidad * 1.609e+6D;
            System.out.println("resultado = " + String.format("%.6f", resultado)+" "+unidadDestino);
        }
        //milla a km
        if (unidadOriginal == 5 && unidadDestino == 4) {
            resultado = cantidad * 1.609D;
            System.out.println("resultado = " + String.format("%.6f", resultado)+" "+unidadDestino);
        }
        //milla a pies
        if (unidadOriginal == 5 && unidadDestino == 6) {
            resultado = cantidad * 5280D;
            System.out.println("resultado = " + String.format("%.6f", resultado)+" "+unidadDestino);
        }
        //milla a pulgadas
        if (unidadOriginal == 5 && unidadDestino == 7) {
            resultado = cantidad * 63360D;
            System.out.println("resultado = " + String.format("%.6f", resultado)+" "+unidadDestino);
        }
        //======Pies===================================================================
        //pies a m
        if (unidadOriginal == 6 && unidadDestino == 1) {
            resultado = cantidad / 3.281D;
            System.out.println("resultado = " + String.format("%.6f", resultado)+" "+unidadDestino);
        }
        //pies a cm
        if (unidadOriginal == 6 && unidadDestino == 2) {
            resultado = cantidad * 30.48D;
            System.out.println("resultado = " + String.format("%.6f", resultado)+" "+unidadDestino);
        }
        //pies a mm
        if (unidadOriginal == 6 && unidadDestino == 3) {
            resultado = cantidad * 305D;
            System.out.println("resultado = " + String.format("%.6f", resultado)+" "+unidadDestino);
        }
        //pies a km
        if (unidadOriginal == 6 && unidadDestino == 4) {
            resultado = cantidad / 3281D;
            System.out.println("resultado = " + String.format("%.6f", resultado)+" "+unidadDestino);
        }
        //pies a milla
        if (unidadOriginal == 6 && unidadDestino == 5) {
            resultado = cantidad / 5280D;
            System.out.println("resultado = " + String.format("%.6f", resultado)+" "+unidadDestino);
        }
        //pies a pulgadas
        if (unidadOriginal == 6 && unidadDestino == 7) {
            resultado = cantidad * 12D;
            System.out.println("resultado = " + String.format("%.6f", resultado)+" "+unidadDestino);
        }
        //=============================pulgadas==================
        //pulgadas a m
        if (unidadOriginal == 7 && unidadDestino == 1) {
            resultado = cantidad / 39.37D;
            System.out.println("resultado = " + String.format("%.6f", resultado)+" "+unidadDestino);
        }
        //pulgadas a cm
        if (unidadOriginal == 7 && unidadDestino == 2) {
            resultado = cantidad * 2.54D;
            System.out.println("resultado = " + String.format("%.6f", resultado)+" "+unidadDestino);
        }
        //pulgadas a mm
        if (unidadOriginal == 7 && unidadDestino == 3) {
            resultado = cantidad * 25.4D;
            System.out.println("resultado = " + String.format("%.6f", resultado)+" "+unidadDestino);
        }
        //pulgadas a km
        if (unidadOriginal == 7 && unidadDestino == 4) {
            resultado = cantidad / 39370D;
            System.out.println("resultado = " + String.format("%.6f", resultado)+" "+unidadDestino);
        }
        //pulgados a milla
        if (unidadOriginal == 7 && unidadDestino == 5) {
            resultado = cantidad / 63360D;
            System.out.println("resultado = " + String.format("%.6f", resultado)+" "+unidadDestino);
        }
        //pulgadas a pies
        if (unidadOriginal == 7 && unidadDestino == 6) {
            resultado = cantidad / 12D;
            System.out.println("resultado = " + String.format("%.6f", resultado)+" "+unidadDestino);
        }
    }

}
