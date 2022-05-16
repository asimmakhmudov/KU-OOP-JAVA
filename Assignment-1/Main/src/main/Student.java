package main;

public class Student extends Person{
    
    private final String Status[] = {"FRESHMAN", "SOPHOMORE", "JUNIOR", "SENIOR"};
    private int status = 1;
    
    public Student(String name, String email, int status) {
        super(name, email);
        this.status = status;
    }
    
    // Status    
    public String getStatus() {
        switch (status) {
            case 1:
                return Status[0];
            case 2:
                return Status[1];
            case 3:
                return Status[2];
            case 4:
                return Status[3];
            default:
                break;
        }
        return null; 
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "\nStudent"
                + "\n------------\n"
                + super.toString() 
                + "\n" 
                + "Status: " + Status[status - 1];
    }
    
}
