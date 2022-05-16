package main;

public class Employee extends Person {
        
    private String office;
    private final MyDate dateHired;
    private int salary;  
    
    public Employee(String name, String email, String office, MyDate dateHired , int salary) {
        super(name, email);
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;
    }

    // Getter Setter
    
    // Office    
    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

        
    // Salary    
    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    

    @Override
    public String toString() {
        return  super.toString()
                + "\n"
                + "Office: " + office 
                + "\n" 
                + "Date Hired: " + dateHired 
                + "\n" 
                + "Salary: " + salary + "$";
    }

}
