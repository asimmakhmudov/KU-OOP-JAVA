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
public class Cat extends Animal {

    public Cat(int age) {
        super(age);
    }

    @Override
    void eat() {
        System.out.println("Cat is eating");
    }
}
