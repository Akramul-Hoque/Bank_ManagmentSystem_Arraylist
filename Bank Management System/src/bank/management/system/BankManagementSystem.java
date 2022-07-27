
package bank.management.system;

import account.Account;
import account.Loan;
import account.SavingsAccount;
import account.StudentAccount;
import java.util.ArrayList;
import java.util.Scanner;

public class BankManagementSystem {

    
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        ArrayList<Employee> allEmployee = new ArrayList();
        ArrayList<Account> allAccount = new ArrayList();
        int serial = 12301;
        
        System.out.println("AH Bank Ltd.");
        System.out.println("Welcome!");
        System.out.println(".....................................");
        
        while(true){
            
            System.out.println("    Select YourSelf: ");

            System.out.println("1. Admin");
            System.out.println("2. Employee");
            System.out.println("3. Customer");

            int myOption = sc.nextInt();

            switch (myOption) {
                case 1:
                     adminOption(sc, allEmployee);
                    
                    break;
                case 2:
                    System.out.println("Please Log in First!!");
                    System.out.println("");
                    String noUse = sc.nextLine();
                    System.out.println("Enter your name:");
                    String eName = sc.nextLine();
                    System.out.println("Enter your id: ");
                    String eId = sc.nextLine();
                    for(Employee e : allEmployee){
                        if((e.employeeName.equals(eName)) && (e.employeeId.equals(eId))){
                            
                            System.out.println("See your choice:");
                            System.out.println("    1. See Total Customer");
                            System.out.println("    2. Add New Account");
                            System.out.println("    ");
                            
                            int option = sc.nextInt();
                            
                            if(option == 1){
                                System.out.println("Total "+allAccount.size()+" accounts are registered in your bank. But Your available branch A/C");
                                for(Account account : allAccount){
                                   if(account.branch.equals(e.employeeBranch)){
                                        System.out.println("Name: "+ account.name);
                                        System.out.println("A/C Number: "+account.acNumber);
                                        System.out.println("Branch: "+account.branch);
                                        account.showBalance();
                                        System.out.println(".........................................");
                                        System.out.println("");
                                   }
                                }
                                
                                System.out.println("");
                                
                            } else if(option == 2){
                                System.out.println("New Account Registration....");
                                System.out.println("Select One....");
                                System.out.println("    1. Savings Account");
                                System.out.println("    2. Student Account");
                                int choice = sc.nextInt();
                                
                                String noUseHere = sc.nextLine();
                                
                                System.out.println("New Account for(Name): ");
                                String name = sc.nextLine();
                                System.out.println("Branch: ");
                                String b = sc.nextLine();
                                serial = serial + 1;
                                String acNumber = "A-"+serial+"";
                                
                                switch(choice){
                                    case 1:
                                        System.out.println("Year: ");
                                        int y = sc.nextInt();
                                        SavingsAccount ac = new SavingsAccount();
                                        ac.name = name;
                                        ac.acNumber = acNumber;
                                        ac.setYear(y);
                                        ac.branch = b;
                                        
                                        allAccount.add(ac);
                                        System.out.println("New Account is registered successfully. Please keep noted the A/C Number.");
                                        ac.showAccountInfo();
                                System.out.println("");
                                System.out.println("...................................................");
                                System.out.println(" ");
                                        
                                        break;
                                    case 2: 
                                        
                                         System.out.println("Institute: ");
                                        String i = sc.nextLine();
                                        StudentAccount a = new StudentAccount();
                                        a.name = name;
                                        a.acNumber = acNumber;
                                        a.setInstitute(i);
                                        a.branch = b;
                                        
                                        allAccount.add(a);
                                        System.out.println("New Account is registered successfully. Please keep noted the A/C Number.");
                                        a.showAccountInfo();
                                System.out.println("");
                                System.out.println("...................................................");
                                System.out.println(" ");
                                        
                                        break;
                                    default:
                                        break;
                                }
                                
                              
                            }
                            
                        }
                        else
                         {System.out.println("Invalid");
                         }
                         
                    }  
                    break;
                case 3:
                    System.out.println("Please make sure its you....");
                    String noUsehere = sc.nextLine();
                    System.out.println("Customer's Name: ");
                    String name = sc.nextLine();
                    System.out.println("A/C Number: ");
                    String number = sc.nextLine();
                    
                    for(Account a : allAccount){
                        if(a.name.equals(name) && a.acNumber.equals(number)){
                            System.out.println("See your choice:");
                            System.out.println("    1. Deposit");
                            System.out.println("    2. Withdraw");
                            System.out.println("    3. Transfer Balance   ");
                            System.out.println("    4. Get Loan     ");
                            
                            
                            int p = sc.nextInt();
                            
                            switch (p) {
                                case 1:
                                    {
                                        System.out.println("Enter Amount: ");
                                        try{
                                            int amount = sc.nextInt();
                                            a.deposit(amount);
                                        } catch(Exception e){
                                            System.out.println("hello there.....");
                                            myOption = 0;
                                        }
                                        System.out.println("");
                                        break;
                                    }
                                case 2:
                                    {
                                        System.out.println("Enter Amount: ");
                                        int amount = sc.nextInt();
                                        a.withdraw(amount);
                                        break;
                                    }
                                case 3:
                                    {
                                        String useLess = sc.nextLine();
                                        System.out.println("Receiver Name: ");
                                        String receiver = sc.nextLine();
                                        System.out.println("Receiver A/C Number: ");
                                        String aC = sc.nextLine();
                                        System.out.println("Branch: ");
                                        String b = sc.nextLine();
                                        System.out.println("How much money you transfer: ");
                                        int amount = sc.nextInt();
                                        a.TransferBalance(amount, new Account(receiver, aC,b));
                                        break;
                                    }
                                case 4:
                                    {
                                        String useLess = sc.nextLine();
                                         System.out.println("You can get mazimum 50k as Loan");
                                         System.out.println("Enter Your Name:");
                                         String n = sc.nextLine();
                                         System.out.println("Enter AC Number: ");
                                         String ac = sc.nextLine();
                                         System.out.println("Branch: ");
                                         String b = sc.nextLine();
                                         System.out.println("how much money you want to get: ");
                                         int amount = sc.nextInt();

                                         Loan loan = new Loan(new Account(n, ac, b));
                                         loan.getLoan(amount);
                                         loan.ShowStatus();
                                         break;
                                    }
                                
                                    
                                default:
                                    break;
                            }
                            
                        }
                    }
                    
                    break;
                default:
                    break;
            }

            
        }
        
    }

    private static void adminOption(Scanner sc, ArrayList<Employee> allEmployee) {
        
                 System.out.println("See your choice:");
                            System.out.println("    1. Add new Employee");
                            System.out.println("    2. Employee Details");
        
               int q = sc.nextInt();
               
               switch(q)
               {
                   case 1:
                   {
               
        
                         System.out.println("Add an employee....");

                        String noUse = sc.nextLine();

                        System.out.print("Enter Employee Name: ");
                        String eName = sc.nextLine();

                        System.out.println("");

                        System.out.print("Enter Id: ");
                        String eId = sc.nextLine();

                        System.out.println("");

                        System.out.println("Enter Branch: ");
                        String eBranch = sc.nextLine();


                        System.out.println("Enter Salary");
                        String eSalary = sc.nextLine();

                        Employee one = new Employee(eName, eId, eBranch,eSalary);
                        allEmployee.add(one);
                        System.out.println("Employee added successfully");
                        break;
                        

                    }
                    case 2:
                    {
                    System.out.println("See all Employee");
                     System.out.println("Total "+allEmployee.size()+" accounts are registered in your branch");
                     for (Employee employee :allEmployee)
                     {
                           employee.seeEmployee();
                      
                    
                     }
                     break;
                
                    }
                    default:
                        break;
                

        
    }
    
}
}