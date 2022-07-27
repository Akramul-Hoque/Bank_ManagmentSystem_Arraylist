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
public class SavingsAccount extends Account {

    int Year;
    public SavingsAccount() {
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int Year) {
        this.Year = Year;
    }

   public void showAccountInfo(){
       System.out.println("Name: "+name+"Number: "+acNumber+"Limit: "+Year+"years");
   }
    
    
}
