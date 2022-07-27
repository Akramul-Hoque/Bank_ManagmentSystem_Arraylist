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
public class Loan extends Account{
    private int LoanAmount = 0;
      
      public Loan(Account ac){
          this.name = ac.name;
          this.acNumber = ac.acNumber;
      }
      
      public void getLoan(int amount)
      {
          if(amount <= 50000){
              LoanAmount = amount;
          }
      }
      
      public void ShowStatus(){
          System.out.println("Account holder: "+name+"; A/C Number:  "+acNumber+"; Loan Balance: "+LoanAmount);
    
      }
}
