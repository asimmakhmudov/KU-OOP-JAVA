package animaloop;

import java.util.ArrayList;

public class AnimalOop {

    public static void main(String[] args) {
        ArrayList<Animal> list = new ArrayList<Animal>();
        list.add(new Dog(3));
        list.add(new Cat(3));
        list.add(new Animal(5){
            @Override
            void eat() {
                System.out.println("Anounimous Class eat method");
            }
        });
        
        System.out.println("/////////Eating Methods//////////");
        callEat(list);
        System.out.println("/////////Printable Methods//////////");
        callPrint(list);
        System.out.println("/////////Searching//////////");
        callEatWithAge(list, 4);
    }
    
    
    public static void callEat(ArrayList<Animal> list) {
        for(Animal animal : list) {
            animal.eat();
        }    
    }
    public static void callPrint(ArrayList list) {
        for(Object an : list) {
            if(an instanceof Printable){
                ((Printable) an).print();
            }
        }
    }
    public static void callEatWithAge(ArrayList<Animal> list, int age) {
        for(Animal animal : list) {
            if(animal.getAge() < age) {
                animal.eat();
            }
        }
    }
}
