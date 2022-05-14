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
public class User {
    private UserDetail details = new UserDetail();

    public UserDetail getDetails() {
        return details;
    }

    public int getAge() {
        return details.getAge();
    }

    public void setAge(int age) {
        details.setAge(age);
    }

    
}
