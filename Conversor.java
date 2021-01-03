
public class Conversor {
//REVISADO
    public double dimensionless(double cantidad, int unidadOriginal){
        double adimensional = 0D;
        switch (unidadOriginal){
            case 1: // m
                adimensional = cantidad;
                break;
            case 2: // cm
                adimensional = cantidad * 0.01D;
                break;
            case 3: // mm
                adimensional = cantidad * 0.001D;
                break;
            case 4: // km
                adimensional = cantidad * 1000D;
                break;
            case 5: // mi
                adimensional = cantidad * 1609.34D;
                break;
            case 6: // ft
                adimensional = cantidad * 0.3048D;
                break;
            case 7: // in
                adimensional = cantidad * 0.0254D;
                break;
            default:
                adimensional = 0D;
            }
        return adimensional;
    }

    public double conversion(double longitud_dless, int unidadDestino){
        double resultado = 0D;
        switch (unidadDestino){
            case 1: // m
                resultado = longitud_dless;
                break;
            case 2: // cm
                resultado = longitud_dless * 100D;
                break;
            case 3: // mm
                resultado = longitud_dless * 1000D;
                break;
            case 4: // km
                resultado = longitud_dless * 0.001D;
                break;
            case 5: // mi
                resultado = longitud_dless / 1609.34D;
                break;
            case 6: // ft
                resultado = longitud_dless / 0.3048D;
                break;
            case 7: // in
                resultado = longitud_dless / 0.0254D;
                break;
            default:
                resultado = 0D; 
            }
        return resultado;
    }
}
