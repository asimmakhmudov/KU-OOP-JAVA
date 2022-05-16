/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package driver;

import java.util.ArrayList;

public class Student extends Person{
    public static ArrayList<Student> students = new ArrayList<>();
    public int studentNo;
    public int entranceYear;

    // Constructor    
    public Student(String nameSurname, int age, int studentNo, int entranceYear) {
        super(nameSurname, age);
        this.studentNo = studentNo;
        this.entranceYear = entranceYear;
    }
    
    public Student(String nameSurname, int studentNo, int entranceYear) {
        super(nameSurname);
        this.studentNo = studentNo;
        this.entranceYear = entranceYear;
    }
    
    // Methods    
    public void getStudentInfo(){
        students.forEach((student) -> {
            System.out.println(student.toString());
        });
    }
    
    public static void getStudents(){
        students.forEach((student) -> {
            System.out.println(student);
        });
    }
    
    public static void removeStudent(int studentNo){
        students.removeIf(student -> student.studentNo == studentNo);
    }

    
    @Override
    public String toString() {
        return "\nStudent{" 
                + "\nName Surname: " + nameSurname 
                + "\nAge: " + age 
                + "\nStudentNo: " + studentNo 
                + "\nEntrance Year: " + entranceYear 
                + "\n}";
    }

}
