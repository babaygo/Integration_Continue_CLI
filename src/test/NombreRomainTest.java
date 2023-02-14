package test;

import nombreromain.NombreRomain;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NombreRomainsTest {

    @Test
    @DisplayName("ETANT DONNE un chiffre arabe 1" +
            "QUAND on le convertit en nombre romain" +
            "ALORS on obtient un I")
    public void Test_1() {
        //ETANT DONNE un chiffre arabe 1
        int chiffreArabe = 1;

        // QUAND on le convertit en nombre romain
        int nombreRomain = NombreRomain.Convertir(chiffreArabe);

        // ALORS on obtient un I
        assertEquals('I', nombreRomain);
    }
}