package test;

import nombreromain.NombreRomain;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class NombreRomainsTest {

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

        @Test
    public void Test2() {
         // ETANT DONNE le chiffre 2
         int chiffreArabe =2;
         //QUAND on le convertir en nombre romain
         String nombreRomain = NombreRomain_I1.Convertir(chiffreArabe);
 
         assertEquals("II", nombreRomain);
         
     }
}
