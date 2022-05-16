package main;

public class Faculty extends Employee {
    
    private final String Rank[] = {"ASSISTANT PROFESSOR","ASSOCTATE PROFESSOR","PROFESSOR"};
    private String officeHours;
    private int rank = 1;
    
    public Faculty(String name, String email, String office, MyDate dateHired, int salary, String officeHours, int rank) {
        super(name, email, office, dateHired, salary);
        this.officeHours = officeHours;
        this.rank = rank;
    }
    
    
    // Office Hours    
    public String getOfficeHours() {
        return officeHours;
    }

    public void setOfficeHours(String officeHours) {
        this.officeHours = officeHours;
    }

    // Rank    
    public String getRank() {
        switch (rank) {
            case 1:
                return Rank[0];
            case 2:
                return Rank[1];
            case 3:
                return Rank[2];
            default:
                break;
        }
        return null;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "\nFaculty" 
                + "\n------------\n" 
                + super.toString() 
                + "\n" 
                + "Office Hours: " + officeHours 
                + "\n" 
                + "Rank: " + Rank[rank - 1];
    }

}
