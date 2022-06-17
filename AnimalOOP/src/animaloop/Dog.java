/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animaloop;

/**
 *
 * @author User
 */
public class Dog extends Animal implements Printable {

    public Dog(int age) {
        super(age);
    }
    
    @Override
    void eat() {
        System.out.println("Dog is Eating");
    }

    @Override
    public void print() {
        System.out.println("Printed Dog");
    }
    
}
