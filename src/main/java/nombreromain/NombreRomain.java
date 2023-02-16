
package nombreromain;

public class NombreRomain {
    public static String Convertir(int nombreArabe) {
        // Test qui marche
        String res = "";
        int rest = nombreArabe;
        do {
            if (rest >= 1000) {
                res += "M";
                rest -= 1000;
            } else {
                if (rest >= 900) {
                    res += "CM";
                    rest -= 900;
                } else {
                    if (rest >= 500) {
                        res += "D";
                        rest -= 500;
                    } else {
                        if (rest >= 400) {
                            res += "CD";
                            rest -= 400;
                        } else {
                            if (rest >= 100) {
                                res += "C";
                                rest -= 100;
                            } else {
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
                            }
                        }
                    }
                }
            }
        } while (rest > 0);
        return res;
    }
}
