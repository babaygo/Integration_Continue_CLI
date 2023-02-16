
package nombreromain;

public class NombreRomain {
    public static String Convertir(int nombreArabe) {
        // Test qui marche
        String res = "";
        int rest = nombreArabe;
        do {
            if (rest >= 90) {
                res += "XC";
                rest -= 90;
            } else {
                if (rest >= 50) {
                    res += "L";
                    rest -= 50;
                } else {
                    if (rest >= 40) {
                        res += "XL";
                        rest -= 40;
                    } else {
                        if (rest >= 10) {
                            res += "X";
                            rest -= 10;
                        } else {
                            if (rest == 9) {
                                res += "IX";
                                rest -= 9;
                            } else {
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
                            }
                        }
                    }
                }
            }
        } while (rest > 0);
        return res;
    }
}
