package main;

public class Person {
    
    public String name;
    public String email;
    
    public Person(String name, String email) {
        this.name = name;
        this.email = email;      
    }
     
    
    // Name    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    // Email    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    } 

    @Override
    public String toString() {
        return  
//                "\n----------------\n" 
//                + "Person" 
//                + "\n----------------\n" 
                "Name: " + name 
                + "\n" 
                +"Email: " + email;
    }
    
}
