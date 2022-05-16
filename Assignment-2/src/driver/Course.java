/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package driver;

import static driver.Student.students;
import java.util.ArrayList;
/**
 *
 * @author User
 */
public class Course {
    public static ArrayList<Course> courses = new ArrayList<>();
    public String courseName;
    private Instructor instructor;
    private int courseCode;
    private int numberOfStudent;

    // Constructors    
    public Course(String courseName, Instructor instructor, int courseCode) {
        this.courseName = courseName;
        this.instructor = instructor;
        this.courseCode = courseCode;
    }

    public Course(String courseName, int courseCode) {
        this.courseName = courseName;
        this.courseCode = courseCode;
    }
    
    // Mathods    
    
    //Student
    public void addStudent(int studentNo){
        students.add(new Student("Asim Mahmudov", 18, studentNo, 2020));
        numberOfStudent++;
    }
    public void dropStudent(int studentNo){
       Student.removeStudent(studentNo);
    }
    public void getStudents(){
        Student.getStudents();
    }
   
    // Course    
    public void getCourses(){
        courses.forEach((course) -> {
            System.out.println(course);
        });
    }
    
    public void removeCourse(int courseCode){
        courses.removeIf(course -> course.courseCode == courseCode);
    }
    
    @Override
    public String toString() {
        return "Course{" 
               + "\nCourseName: " + courseName 
               + "\nInstructor => " + instructor 
               + "\ncourseCode: " + courseCode 
               + "\nNumber Of Students:" + numberOfStudent 
               +
               "\n}";
    }
}
