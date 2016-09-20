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
public class Homo {

    public String name;
    public int age;
    private int iq;
    public String sex;

    Homo(String name) {
        //тело конструктора
        this.name=name;
    }
    
    Homo(String name, int age) {
        //тело конструктора
        this.name=name;
        this.age=age;
    }
    
    Homo (String name, int age, String sex)
    {
        this.name=name;
        this.age=age;
        this.sex=sex;
    }
    
    Homo (String name, int age, int iq)
    {
        this.name=name;
        this.age=age;
        this.iq=iq;
    }
    
    
    void Info()
    {
        System.out.println("Меня зовут "+name);
        System.out.println("Мой возраст "+ age); 
        if (sex=="М") {
                    System.out.println("Я мааааааальчик");
            
        }
        if (sex=="Ж") {
                    System.out.println("Я девочка");
            
        }
        if (sex==null) {
                    System.out.println("Свой пол я не скажу, а вы не догадаетесь");
            
        }
        
    }
    
    
}
