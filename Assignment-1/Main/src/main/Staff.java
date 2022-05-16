package main;

public class Staff extends Employee {
    
    private final String Title[] = {"ASSISTANT","OFFICER","MANAGER"};
    private int title = 1;
    
    public Staff(String name, String email, String office, MyDate dateHired, int salary, String officeHours, int title) {
        super(name, email, office, dateHired ,salary);
        this.title = title;
    }
    
    // Title    
    public String getTitle() {
        switch (title) {
            case 1:
                return Title[0];
            case 2:
                return Title[1];
            case 3:
                return Title[2];
            default:
                break;
        }
        return null;
    }

    public void setTitle(int title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "\nStaff"
                + "\n------------\n" 
                + super.toString() 
                + "\n" 
                + "Title: " + Title[title - 1] 
                + "\n";
    }
    
}
