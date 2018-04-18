
package assignment;

public abstract class Account{
  
      String name;
      String account_no;

    public String getName() {
        return name;
    }

    public String getAccount_no() {
        return account_no;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAccount_no(String account_no) {
        this.account_no = account_no;
    }
    
    
      
      
      
    abstract public void withdrow(double amount); 
    
    abstract public void Deposit(double amount);
    
    //constrator method
    public Account(String name, String account_no) {
        this.name = name;
        this.account_no = account_no;
    }
}
