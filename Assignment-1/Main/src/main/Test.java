package main;
import java.util.Scanner;

public class Test {
    
    public static void main(String[] args) {
        
        MyDate date1 = new MyDate();
        MyDate date2 = new MyDate(561555550000L);
        Scanner scanner = new Scanner(System.in);
        
        // Student        
        Student student = new Student("Student", "student@mail.com", 4);
        // Faculty        
        Faculty faculty = new Faculty("Faculty", "faculty.surname22@gmail.com", "Azerbaijan, Baku", date1 , 500, "10:00-18:00", 2);
        // Staff
        Staff staff = new Staff("Staff", "staff.surname22@gmail.com", "Azerbaijan, Baku", date1 , 1200, "10:00-18:00", 1);

        // Question Section
        int QuestionNum = 0;
        do {
            System.out.println("----------------------");
            System.out.println("Press 1 for Question 1");
            System.out.println("Press 2 for Question 2");
            System.out.println("Press 0 for Exit");
            System.out.print("Enter: ");
            QuestionNum = scanner.nextInt();
            switch (QuestionNum) {
                case 0:
                    System.out.println("---> Bye, Thanks for using program <---");
                    break;
                case 1:
                    System.out.println("-----------------");
                    System.out.println("Date-1: " + date1);
                    System.out.println("Date-2: " + date2);
                    break;
                case 2:
                    System.out.println(student.toString());
                    System.out.println(faculty.toString());
                    System.out.println(staff.toString());
                    break;
                default: 
                    System.out.println("---> Invalid input, Try again <---");
            }
        } while(QuestionNum != 0);
    }

}
