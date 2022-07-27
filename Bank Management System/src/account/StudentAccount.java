/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package account;

/**
 *
 * @author Admin
 */
public class StudentAccount extends Account{
    private String institute;
    
    public StudentAccount(){
        
    }

    public String getInstitute() {
        return institute;
    }

    public void setInstitute(String institute) {
        this.institute = institute;
    }
    
     public void showAccountInfo(){
       System.out.println("Name: "+name+"  Number: "+acNumber+"  Institute: "+institute+".");
   }
    
}
