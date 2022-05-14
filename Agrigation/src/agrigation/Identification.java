/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agrigation;

/**
 *
 * @author User
 */
public class Identification implements Printable{
    String name;
    String surname;

    @Override
    public String print() {
        String str = name + " " + surname;
        System.out.println(str);
        return str;
    }

    public Identification(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
    
    
}
