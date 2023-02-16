
package nombreromain;

public class NombreRomain {
    public static String Convertir(int nombreArabe) {
        // Test qui marche
        String res = "";
        int rest = nombreArabe;
        do {
            if (rest >= 5) {
                res += "V";
                rest -= 5;
            } else {
                if (rest % 5 == 4) {
                    res += "IV";
                    rest -= 4;
                } else {
                    res += "I".repeat(rest);
                    rest -= rest;
                }
            }
        } while (rest > 0);
        return res;
    }
}
