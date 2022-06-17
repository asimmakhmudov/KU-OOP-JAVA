
package animaloop;

abstract class Animal {
    private int age;

    public Animal(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
    
    abstract void eat();
}
