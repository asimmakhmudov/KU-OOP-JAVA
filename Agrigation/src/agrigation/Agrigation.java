/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agrigation;

/**
 *
 * @author User
 */
public class Agrigation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        User user = new User();
        
        user.getDetails().setId(new Identification("Asim", "Mahmudov"));
        String details = user.getDetails().getId().print().toUpperCase();
        System.out.println("Uppercase: " + details);
        
    }
    
}
