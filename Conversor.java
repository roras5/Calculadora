public class Conversor {

    public void conversion(double cantidad, int unidadOriginal, int unidadDestino) {
        double resultado = 0D;
        if (unidadOriginal == unidadDestino) {
            System.out.println("Elijio la mismo unidad");
            resultado = cantidad;
            
           System.out.println("resultado = " + String.format("%.6f", resultado));
        }
        //=================metros===========================================================
        //metros a centimetros
        if (unidadOriginal == 1 && unidadDestino == 2) {
            resultado = cantidad * 100D;
            System.out.println("resultado = " + String.format("%.6f", resultado));
        }
        //metro a mm
        if (unidadOriginal == 1 && unidadDestino == 3) {
            resultado = cantidad * 100D;
            System.out.println("resultado = " + String.format("%.6f", resultado));
        }
        //metro a km
        if (unidadOriginal == 1 && unidadDestino == 4) {
            resultado = cantidad / 1000D;
            System.out.println("resultado = " + String.format("%.6f", resultado));
        }
        //metro a milla
        if (unidadOriginal == 1 && unidadDestino == 5) {
            resultado = cantidad / 1609.344D;
            System.out.println("resultado = " + String.format("%.6f", resultado));
        }
        //metro a pies
        if (unidadOriginal == 1 && unidadDestino == 6) {
            resultado = cantidad * 3.2808399D;
            System.out.println("resultado = " + String.format("%.6f", resultado));
        }
        //metros a pulgadas
        if (unidadOriginal == 1 && unidadDestino == 7) {
            resultado = cantidad * 39.3700787D;
            System.out.println("resultado = " + String.format("%.6f", resultado));
        }
        //====================centimetros======================================================
        //cm a m
        if (unidadOriginal == 2 && unidadDestino == 1) {
            resultado = cantidad / 100D;
            System.out.println("resultado = " + String.format("%.6f", resultado));
        }
        //cm a mm
        if (unidadOriginal == 2 && unidadDestino == 3) {
            resultado = cantidad * 10D;
            System.out.println("resultado = " + String.format("%.6f", resultado));
        }
        //cm a km
        if (unidadOriginal == 2 && unidadDestino == 4) {
            resultado = cantidad / 100000D;
            System.out.println("resultado = " + String.format("%.6f", resultado));
        }
        //cm a milla
        if (unidadOriginal == 2 && unidadDestino == 5) {
            resultado = cantidad / 160934D;
            System.out.println("resultado = " + String.format("%.6f", resultado));
        }
        //cm a pies
        if (unidadOriginal == 2 && unidadDestino == 6) {
            resultado = cantidad / 30.48D;
            System.out.println("resultado = " + String.format("%.6f", resultado));
        }
        //cm a pulgadas
        if (unidadOriginal == 2 && unidadDestino == 7) {
            resultado = cantidad / 2.54D;
            System.out.println("resultado = " + String.format("%.6f", resultado));
        }
        //======milimetro===================================================================
        //mm a m
        if (unidadOriginal == 3 && unidadDestino == 1) {
            resultado = cantidad / 1000D;
            System.out.println("resultado = " + String.format("%.6f", resultado));
        }
        //mm a cm
        if (unidadOriginal == 3 && unidadDestino == 2) {
            resultado = cantidad / 10D;
            System.out.println("resultado = " + String.format("%.6f", resultado));
        }
        //mm a km
        if (unidadOriginal == 3 && unidadDestino == 4) {
            resultado = cantidad / 1e+6D;
            System.out.println("resultado = " + String.format("%.6f", resultado));
        }
        //mm a milla
        if (unidadOriginal == 3 && unidadDestino == 5) {
            resultado = cantidad / 1.609e+6D;
            System.out.println("resultado = " + String.format("%.6f", resultado));
        }
        //mm a pies
        if (unidadOriginal == 3 && unidadDestino == 6) {
            resultado = cantidad * 305D;
            System.out.println("resultado = " + String.format("%.6f", resultado));
        }
        //mm a pulgadas
        if (unidadOriginal == 3 && unidadDestino == 7) {
            resultado = cantidad / 25.4D;
            System.out.println("resultado = " + String.format("%.6f", resultado));
        }
        //=============================kilometros============================================
        //km a m
        if (unidadOriginal == 4 && unidadDestino == 1) {
            resultado = cantidad * 1000D;
            System.out.println("resultado = " + String.format("%.6f", resultado));
        }
        //km a cm
        if (unidadOriginal == 4 && unidadDestino == 2) {
            resultado = cantidad / 100000D;
            System.out.println("resultado = " + String.format("%.6f", resultado));
        }
        //km a mm
        if (unidadOriginal == 4 && unidadDestino == 3) {
            resultado = cantidad * 1e+6D;
            System.out.println("resultado = " + String.format("%.6f", resultado));
        }
        //km a milla
        if (unidadOriginal == 4 && unidadDestino == 5) {
            resultado = cantidad / 1.609D;
            System.out.println("resultado = " + String.format("%.6f", resultado));
        }
        //km a pies
        if (unidadOriginal == 4 && unidadDestino == 6) {
            resultado = cantidad * 3281D;
            System.out.println("resultado = " + String.format("%.6f", resultado));
        }
        //km a pulgadas
        if (unidadOriginal == 4 && unidadDestino == 7) {
            resultado = cantidad * 39370D;
            System.out.println("resultado = " + String.format("%.6f", resultado));
        }
        //======millas===================================================================
        //milla a m
        if (unidadOriginal == 5 && unidadDestino == 1) {
            resultado = cantidad / 1609D;
            System.out.println("resultado = " + String.format("%.6f", resultado));
        }
        //milla a cm
        if (unidadOriginal == 5 && unidadDestino == 2) {
            resultado = cantidad / 160934D;
            System.out.println("resultado = " + String.format("%.6f", resultado));
        }
        //milla a mm
        if (unidadOriginal == 5 && unidadDestino == 3) {
            resultado = cantidad * 1.609e+6D;
            System.out.println("resultado = " + String.format("%.6f", resultado));
        }
        //milla a km
        if (unidadOriginal == 5 && unidadDestino == 4) {
            resultado = cantidad * 1.609D;
            System.out.println("resultado = " + String.format("%.6f", resultado));
        }
        //milla a pies
        if (unidadOriginal == 5 && unidadDestino == 6) {
            resultado = cantidad * 5280D;
            System.out.println("resultado = " + String.format("%.6f", resultado));
        }
        //milla a pulgadas
        if (unidadOriginal == 5 && unidadDestino == 7) {
            resultado = cantidad * 63360D;
            System.out.println("resultado = " + String.format("%.6f", resultado));
        }
        //======Pies===================================================================
        //pies a m
        if (unidadOriginal == 6 && unidadDestino == 1) {
            resultado = cantidad / 3.281D;
            System.out.println("resultado = " + String.format("%.6f", resultado));
        }
        //pies a cm
        if (unidadOriginal == 6 && unidadDestino == 2) {
            resultado = cantidad * 30.48D;
            System.out.println("resultado = " + String.format("%.6f", resultado));
        }
        //pies a mm
        if (unidadOriginal == 6 && unidadDestino == 3) {
            resultado = cantidad * 305D;
            System.out.println("resultado = " + String.format("%.6f", resultado));
        }
        //pies a km
        if (unidadOriginal == 6 && unidadDestino == 4) {
            resultado = cantidad / 3281D;
            System.out.println("resultado = " + String.format("%.6f", resultado));
        }
        //pies a milla
        if (unidadOriginal == 6 && unidadDestino == 5) {
            resultado = cantidad / 5280D;
            System.out.println("resultado = " + String.format("%.6f", resultado));
        }
        //pies a pulgadas
        if (unidadOriginal == 6 && unidadDestino == 7) {
            resultado = cantidad * 12D;
            System.out.println("resultado = " + String.format("%.6f", resultado));
        }
        //=============================pulgadas==================
        //pulgadas a m
        if (unidadOriginal == 7 && unidadDestino == 1) {
            resultado = cantidad / 39.37D;
            System.out.println("resultado = " + String.format("%.6f", resultado));
        }
        //pulgadas a cm
        if (unidadOriginal == 7 && unidadDestino == 2) {
            resultado = cantidad * 2.54D;
            System.out.println("resultado = " + String.format("%.6f", resultado));
        }
        //pulgadas a mm
        if (unidadOriginal == 7 && unidadDestino == 3) {
            resultado = cantidad * 25.4D;
            System.out.println("resultado = " + String.format("%.6f", resultado));
        }
        //pulgadas a km
        if (unidadOriginal == 7 && unidadDestino == 4) {
            resultado = cantidad / 39370D;
            System.out.println("resultado = " + String.format("%.6f", resultado));
        }
        //pulgados a milla
        if (unidadOriginal == 7 && unidadDestino == 5) {
            resultado = cantidad / 63360D;
            System.out.println("resultado = " + String.format("%.6f", resultado));
        }
        //pulgadas a pies
        if (unidadOriginal == 7 && unidadDestino == 6) {
            resultado = cantidad / 12D;
            System.out.println("resultado = " + String.format("%.6f", resultado));
        }
    }

}
