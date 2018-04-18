
package assignment;

public class Balance extends Account {

    private double balance;
    
    public Balance(double balance,String name, String account_no) {
                super(name,account_no);
                this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    
    
    @Override
    public void withdrow(double amount) {  
        if(amount<=balance)
            balance=balance-amount;        
        else
            System.out.println("Insufficient Balance");
    }

    @Override
    public void Deposit(double amount) {
        if(amount>0)
            balance=balance+amount;              
    }
    
}
