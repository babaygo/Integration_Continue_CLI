
package nombreromain;

public class NombreRomain {
    public static String Convertir(int nombreArabe) {
        // Test qui marche 
        String res="";
        if (nombreArabe % 5 == 4) {
            res += "IV";
        } else {
            res += "I".repeat(nombreArabe);
           
        }


        return res;
    }
}
