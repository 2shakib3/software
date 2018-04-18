package assignment;

import java.util.Scanner;

/**
 *
 * @author Arafat apon(Id : 2015100000025)
 */
public class Assignment {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       
       String name;
       String account_no;
       double balance;
       
       System.out.println("Enter account name: ");
       name=input.nextLine();
       System.out.println("Enter account no: ");
       account_no=input.nextLine();  
       System.out.println("Enter balance: ");
       balance=input.nextDouble();
       
       Account_details abc = new Account_details( balance,  name,  account_no);
       
        System.out.println("****OPTION****");
        System.out.println("1. Deposite");
        System.out.println("2. Withdraw");
        System.out.println("3. Display Account Information");
        System.out.println("4. Exit");
        
       while(true){
          System.out.println("Enter An Option:\n");
          double amount;
          int option;
          option=input.nextInt(); 
          switch(option){
              case 1:
                  System.out.println("Enter deposite Amount: ");
                  amount=input.nextInt(); 
                  abc.Deposit(amount);
                  break;
              case 2:
                  System.out.println("Enter withdraw Amount: ");     
                  amount=input.nextInt(); 
                  abc.withdrow(amount);
                  break;
              case 3:
                  abc.print();
                  break;
              default :
                  System.out.println("Exiting Program....");
                  return;                
          }
          
       }

    }
    
}
