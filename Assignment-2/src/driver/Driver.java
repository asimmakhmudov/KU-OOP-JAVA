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
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Instructor instructor = new Instructor("Jack", 25, 1); 
        Course course = new Course("English",instructor,32);
        course.addStudent(23);
        course.getStudents();
        course.dropStudent(23);
        course.getStudents();
        Course.courses.add(course);
        course.getCourses();
        course.removeCourse(32);
        course.getCourses();
    }
    
}
