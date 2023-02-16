package test;

import nombreromain.NombreRomain;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

public class NombreRomainsTest {

    @Test
    @DisplayName("ETANT DONNE un chiffre arabe 1" +
            "QUAND on le convertit en nombre romain" +
            "ALORS on obtient un I")
    public void Test_1() {
        // ETANT DONNE un chiffre arabe 1
        int chiffreArabe = 1;

        
        
        // QUAND on le convertit en nombre romain
        String nombreRomain = NombreRomain.Convertir(chiffreArabe);

        // ALORS on obtient un I
        assertEquals("I", nombreRomain);
    }

    @Test
    public void Test2() {
        // ETANT DONNE le chiffre 2
        int chiffreArabe = 2;
        // QUAND on le convertir en nombre romain
        String nombreRomain = NombreRomain.Convertir(chiffreArabe);

        assertEquals("II", nombreRomain);

    }

    @Test
    public void Test3() {
        // ETANT DONNE le chiffre 3
        int chiffreArabe = 3;
        // QUAND on le convertir en nombre romain
        String nombreRomain = NombreRomain.Convertir(chiffreArabe);

        assertEquals("III", nombreRomain);

    }

    @Test
    public void Test4() {
        // ETANT DONNE le chiffre 4
        int chiffreArabe = 4;
        // QUAND on le convertir en nombre romain
        String nombreRomain = NombreRomain.Convertir(chiffreArabe);

        assertEquals("IV", nombreRomain);

    }

    @Test
    public void Test5() {
        // ETANT DONNE le chiffre 5
        int chiffreArabe = 5;
        // QUAND on le convertir en nombre romain
        String nombreRomain = NombreRomain.Convertir(chiffreArabe);

        assertEquals("V", nombreRomain);

    }

    @Test
    public void Test6() {
        // ETANT DONNE le chiffre 6
        int chiffreArabe = 6;
        // QUAND on le convertir en nombre romain
        String nombreRomain = NombreRomain.Convertir(chiffreArabe);

        assertEquals("VI", nombreRomain);

    }

    @Test
    public void Test7() {
        // ETANT DONNE le chiffre 7
        int chiffreArabe = 7;
        // QUAND on le convertir en nombre romain
        String nombreRomain = NombreRomain.Convertir(chiffreArabe);

        assertEquals("VII", nombreRomain);

    }

    @Test
    public void Test8() {
        // ETANT DONNE le chiffre 8
        int chiffreArabe = 8;
        // QUAND on le convertir en nombre romain
        String nombreRomain = NombreRomain.Convertir(chiffreArabe);

        assertEquals("VIII", nombreRomain);

    }

    @Test
    public void Test9() {
        // ETANT DONNE le chiffre 9
        int chiffreArabe = 9;
        // QUAND on le convertir en nombre romain
        String nombreRomain = NombreRomain.Convertir(chiffreArabe);

        assertEquals("IX", nombreRomain);

    }

    @Test
    public void Test10() {
        // ETANT DONNE le chiffre 10
        int chiffreArabe = 10;
        // QUAND on le convertir en nombre romain
        String nombreRomain = NombreRomain.Convertir(chiffreArabe);

        assertEquals("X", nombreRomain);

    }

    @Test
    public void Test11() {
        // ETANT DONNE le chiffre 11
        int chiffreArabe = 11;
        // QUAND on le convertir en nombre romain
        String nombreRomain = NombreRomain.Convertir(chiffreArabe);

        assertEquals("XI", nombreRomain);

    }

    @Test
    public void Test12() {
        // ETANT DONNE le chiffre 12
        int chiffreArabe = 12;
        // QUAND on le convertir en nombre romain
        String nombreRomain = NombreRomain.Convertir(chiffreArabe);

        assertEquals("XII", nombreRomain);

    }

    @Test
    public void Test13() {
        // ETANT DONNE le chiffre 13
        int chiffreArabe = 13;
        // QUAND on le convertir en nombre romain
        String nombreRomain = NombreRomain.Convertir(chiffreArabe);

        assertEquals("XIII", nombreRomain);

    }

    @Test
    public void Test14() {
        // ETANT DONNE le chiffre 14
        int chiffreArabe = 14;
        // QUAND on le convertir en nombre romain
        String nombreRomain = NombreRomain.Convertir(chiffreArabe);

        assertEquals("XIV", nombreRomain);

    }

    @Test
    public void Test15() {
        // ETANT DONNE le chiffre 15
        int chiffreArabe = 15;
        // QUAND on le convertir en nombre romain
        String nombreRomain = NombreRomain.Convertir(chiffreArabe);

        assertEquals("XV", nombreRomain);

    }

    @Test
    public void Test16() {
        // ETANT DONNE le chiffre 16
        int chiffreArabe = 16;
        // QUAND on le convertir en nombre romain
        String nombreRomain = NombreRomain.Convertir(chiffreArabe);

        assertEquals("XVI", nombreRomain);

    }

    @Test
    public void Test17() {
        // ETANT DONNE le chiffre 17
        int chiffreArabe = 17;
        // QUAND on le convertir en nombre romain
        String nombreRomain = NombreRomain.Convertir(chiffreArabe);

        assertEquals("XVII", nombreRomain);

    }

    @Test
    public void Test18() {
        // ETANT DONNE le chiffre 8
        int chiffreArabe = 18;
        // QUAND on le convertir en nombre romain
        String nombreRomain = NombreRomain.Convertir(chiffreArabe);

        assertEquals("XVIII", nombreRomain);

    }

    @Test
    public void Test19() {
        // ETANT DONNE le chiffre 19
        int chiffreArabe = 19;
        // QUAND on le convertir en nombre romain
        String nombreRomain = NombreRomain.Convertir(chiffreArabe);

        assertEquals("XIX", nombreRomain);

    }

    @Test
    public void Test20() {
        // ETANT DONNE le chiffre 20
        int chiffreArabe = 20;
        // QUAND on le convertir en nombre romain
        String nombreRomain = NombreRomain.Convertir(chiffreArabe);

        assertEquals("XX", nombreRomain);

    }

    @Test
    public void Test39() {
        // ETANT DONNE le chiffre 39
        int chiffreArabe = 39;
        // QUAND on le convertir en nombre romain
        String nombreRomain = NombreRomain.Convertir(chiffreArabe);

        assertEquals("XXXIX", nombreRomain);

    }

    @Test
    public void Test49() {
        // ETANT DONNE le chiffre 49
        int chiffreArabe = 49;
        // QUAND on le convertir en nombre romain
        String nombreRomain = NombreRomain.Convertir(chiffreArabe);

        assertEquals("XLIX", nombreRomain);

    }

    @Test
    public void Test50() {
        // ETANT DONNE le chiffre 50
        int chiffreArabe = 50;
        // QUAND on le convertir en nombre romain
        String nombreRomain = NombreRomain.Convertir(chiffreArabe);

        assertEquals("L", nombreRomain);

    }

    @Test
    public void Test99() {
        // ETANT DONNE le chiffre 99
        int chiffreArabe = 99;
        // QUAND on le convertir en nombre romain
        String nombreRomain = NombreRomain.Convertir(chiffreArabe);

        assertEquals("XCIX", nombreRomain);

    }
    @Test
    public void Test100() {
        // ETANT DONNE le chiffre 200
        int chiffreArabe =100;
        //QUAND on le convertir en nombre romain
        String nombreRomain = NombreRomain.Convertir(chiffreArabe);

        assertEquals("C", nombreRomain);
        
    }
    @Test
    public void Test200() {
        // ETANT DONNE le chiffre 200
        int chiffreArabe =200;
        //QUAND on le convertir en nombre romain
        String nombreRomain = NombreRomain.Convertir(chiffreArabe);

        assertEquals("CC", nombreRomain);
        
    }
    @Test
    public void Test250() {
        // ETANT DONNE le chiffre 250
        int chiffreArabe =250;
        //QUAND on le convertir en nombre romain
        String nombreRomain = NombreRomain.Convertir(chiffreArabe);
        assertEquals("CCL", nombreRomain);
        
    }
    @Test
    public void Test400() {
        // ETANT DONNE le chiffre 400
        int chiffreArabe =400;
        //QUAND on le convertir en nombre romain
        String nombreRomain = NombreRomain.Convertir(chiffreArabe);
        assertEquals("CD", nombreRomain);
        
    }
    @Test
    public void Test499() {
        // ETANT DONNE le chiffre 499
        int chiffreArabe =499;
        //QUAND on le convertir en nombre romain
        String nombreRomain = NombreRomain.Convertir(chiffreArabe);
        assertEquals("CDXCIX", nombreRomain);
    }

    @Test
    public void Test500() {
        // ETANT DONNE le chiffre 500
        int chiffreArabe =500;
        //QUAND on le convertir en nombre romain
        String nombreRomain = NombreRomain.Convertir(chiffreArabe);
        assertEquals("D", nombreRomain);
    }

    @Test
    public void Test800() {
        // ETANT DONNE le chiffre 500
        int chiffreArabe =800;
        //QUAND on le convertir en nombre romain
        String nombreRomain = NombreRomain.Convertir(chiffreArabe);
        assertEquals("DCCC", nombreRomain);
    }
    @Test
    public void Test900() {
        // ETANT DONNE le chiffre 900
        int chiffreArabe =900;
        //QUAND on le convertir en nombre romain
        String nombreRomain = NombreRomain.Convertir(chiffreArabe);
        assertEquals("CM", nombreRomain);
    }
    @Test
    public void Test1000() {
        // ETANT DONNE le chiffre 1000
        int chiffreArabe =1000;
        //QUAND on le convertir en nombre romain
        String nombreRomain = NombreRomain.Convertir(chiffreArabe);
        assertEquals("M", nombreRomain);
    }
    @Test
    public void Test3999() {
        // ETANT DONNE le chiffre 3999
        int chiffreArabe =3999;
        //QUAND on le convertir en nombre romain
        String nombreRomain = NombreRomain.Convertir(chiffreArabe);
        assertEquals("MMMCMXCIX", nombreRomain);
    }
}
