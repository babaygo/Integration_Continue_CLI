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
        //ETANT DONNE un chiffre arabe 1
        int chiffreArabe = 1;

        // QUAND on le convertit en nombre romain
        String nombreRomain = NombreRomain.Convertir(chiffreArabe);

        // ALORS on obtient un I
        assertEquals("I", nombreRomain);
    }

        @Test
    public void Test2() {
         // ETANT DONNE le chiffre 2
         int chiffreArabe =2;
         //QUAND on le convertir en nombre romain
         String nombreRomain = NombreRomain.Convertir(chiffreArabe);
 
         assertEquals("II", nombreRomain);
         
     }

     @Test
     public void Test3() {
          // ETANT DONNE le chiffre 3
          int chiffreArabe =3;
          //QUAND on le convertir en nombre romain
          String nombreRomain = NombreRomain.Convertir(chiffreArabe);
  
          assertEquals("III", nombreRomain);
          
      }

      @Test
      public void Test4() {
           // ETANT DONNE le chiffre 4
           int chiffreArabe =4;
           //QUAND on le convertir en nombre romain
           String nombreRomain = NombreRomain.Convertir(chiffreArabe);
   
           assertEquals("IV", nombreRomain);
           
       }

       @Test
       public void Test5() {
            // ETANT DONNE le chiffre 5
            int chiffreArabe =5;
            //QUAND on le convertir en nombre romain
            String nombreRomain = NombreRomain.Convertir(chiffreArabe);
    
            assertEquals("V", nombreRomain);
            
        }

        @Test
        public void Test6() {
             // ETANT DONNE le chiffre 6
             int chiffreArabe =6;
             //QUAND on le convertir en nombre romain
             String nombreRomain = NombreRomain.Convertir(chiffreArabe);
     
             assertEquals("VI", nombreRomain);
             
         }
         @Test
         public void Test7() {
              // ETANT DONNE le chiffre 7
              int chiffreArabe =7;
              //QUAND on le convertir en nombre romain
              String nombreRomain = NombreRomain.Convertir(chiffreArabe);
      
              assertEquals("VII", nombreRomain);
              
          }

          @Test
          public void Test8() {
               // ETANT DONNE le chiffre 8
               int chiffreArabe =8;
               //QUAND on le convertir en nombre romain
               String nombreRomain = NombreRomain.Convertir(chiffreArabe);
       
               assertEquals("VIII", nombreRomain);
               
           }
           @Test
           public void Test9() {
                // ETANT DONNE le chiffre 9
                int chiffreArabe =9;
                //QUAND on le convertir en nombre romain
                String nombreRomain = NombreRomain.Convertir(chiffreArabe);
        
                assertEquals("IX", nombreRomain);
                
            }
            @Test
            public void Test10() {
                 // ETANT DONNE le chiffre 10
                 int chiffreArabe =10;
                 //QUAND on le convertir en nombre romain
                 String nombreRomain = NombreRomain.Convertir(chiffreArabe);
         
                 assertEquals("X", nombreRomain);
                 
             }
             @Test
             public void Test11() {
                  // ETANT DONNE le chiffre 11
                  int chiffreArabe =11;
                  //QUAND on le convertir en nombre romain
                  String nombreRomain = NombreRomain.Convertir(chiffreArabe);
          
                  assertEquals("XI", nombreRomain);
                  
              }
}
