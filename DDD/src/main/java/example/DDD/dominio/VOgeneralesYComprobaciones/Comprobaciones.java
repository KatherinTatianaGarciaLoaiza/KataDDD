package example.DDD.dominio.VOgeneralesYComprobaciones;

public class Comprobaciones {

    public static void ComprobacionString(String dato){
        if(dato.isBlank()){
            throw new IllegalArgumentException("No pueden haber datos en blanco.");
        }
    }
}
