
package bank.management.system;

import account.Account;


public class Employee implements IEmployee{
    
    public String employeeName;
    public String employeeId;
    public String employeeBranch;
    private String employeeSalary;

    public Employee(String employeeName, String employeeId, String employeeBranch,String employeeSalary) {
        this.employeeName = employeeName;
        this.employeeId = employeeId;
        this.employeeBranch = employeeBranch;
        this.employeeSalary = employeeSalary;
    }
    
    public void seeEmployee(){
        System.out.println("Name: "+ employeeName+", Id: "+employeeId+", Branch: "+employeeBranch+",Salary"+employeeSalary);
    }
    
    
    public void addAccount(Account account){
       
    }
    public void seeDetails(String name){
        
    }
    public void totalCustomer(){
        
    }
//    public void showDetails(){
//        System.out.println("Name: "+employeeName);
//         System.out.println("ID: "+employeeId);
//         System.out.println("Branch"+employeeBranch);
//         System.out.println("Salary"+employeeSalary);
//         
//  }

   
}
