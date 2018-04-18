
package assignment;

public class Account_details extends Balance{
    
    public Account_details(double balance, String name, String account_no) {
        super(balance, name, account_no);
    }
   public void print(){
       
       System.out.println("Name = "+name+'\n'+"Account No = "+account_no+"\n"+"Balance = "+getBalance());
   }
    
}
