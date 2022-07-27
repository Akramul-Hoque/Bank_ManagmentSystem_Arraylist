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
public class Account {
    public String name;
    public String acNumber;
    public String branch;
    private int balance = 0;
    
    
    public Account()
    {
    }

    public Account(String name, String acNumber, String branch) {
        this.name = name;
        this.acNumber = acNumber;
        this.branch = branch;
    }

    public void deposit(int amount) {
        try{
            if (amount > 0) {
                balance += amount;
                System.out.println("You have deposit: " + amount + "and available: " + balance);
            } else {
                System.out.println("INvalid");
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void showBalance(){
        System.out.println("Your Current Balance: "+balance);
    }

    public void withdraw(int amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("You have wtihdraw: " + amount + "and available: " + balance);
        } else {
            System.out.println("invalid");
        }
    }
    
    public void TransferBalance(int amount, Account account){
        if(amount>500 && amount <= balance){
            balance -= amount;
            account.balance += amount;
            System.out.println("Transfer"+amount+"  TK to "+account.name);
        }
    }
    public void ShowStatus(){
        System.out.println("Account holder: "+name+"; A/C Number:  "+acNumber+"; Balance: "+balance+"; Branch: "+branch);
    }

}
