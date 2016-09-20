/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chelovechische;

/**
 *
 * @author student
 */
public class CHELOVECHIZSHE {
    
        /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Homo Sanja = new Homo("Александр");
//        System.out.println(Sanja.name);
//        System.out.println(Sanja.age);
        Sanja.Info();
        
        Homo Vasja = new Homo("Василий", 35);
        Vasja.Info();

        
        Homo Artur = new Homo("Артур", 29,"М");
        Artur.Info();
        
        Homo Petr = new Homo ("Петр",16,100);
        
        
    }
    
}
