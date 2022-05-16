/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package driver;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class Instructor extends Person{
    public static ArrayList<Instructor> instructors = new ArrayList<>();
    private int id;

    public Instructor(String nameSurname, int age, int id) {
        super(nameSurname, age);
        this.id = id;
    }
    
    public void getInstructors(){
        instructors.forEach((instructor) -> {
            System.out.println(instructor);
        });
    }
    
    public void removeInstructor(int id){
        instructors.removeIf(instructor -> instructor.id == id);
    }

    @Override
    public String toString() {
        return  "{ ID: " + id + ", Name Surname: " + nameSurname + ", Age: " + age + " }";
    }

       
    
}
