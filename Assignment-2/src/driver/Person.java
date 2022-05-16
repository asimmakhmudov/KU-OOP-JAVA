/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package driver;

/**
 *
 * @author User
 */
abstract class Person {
    public String nameSurname;
    public int age;

    // Constructor    
    public Person(String nameSurname, int age) {
        this.nameSurname = nameSurname;
        this.age = age;
    }

    public Person(String nameSurname) {
        this.nameSurname = nameSurname;
    }
   

    @Override
    public String toString() {
        return "Person{" + "nameSurname=" + nameSurname + ", age=" + age + '}';
    }
    
      
    
}
