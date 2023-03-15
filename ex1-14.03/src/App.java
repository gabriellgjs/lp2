import Class.BusinessAccount;
import Class.SavingsAccount;

public class App {
    public static void main(String[] args) throws Exception {
        SavingsAccount savingsAccount =  new SavingsAccount(2, "Gabriel", 20, 0.50);
        
        savingsAccount.uptadeBalance();

        System.out.println(savingsAccount.getBalance());
        
        savingsAccount.withdraw(20);
        System.out.println(savingsAccount.getBalance());
        
        //

        BusinessAccount businessAccount =  new BusinessAccount(1, "Gabriel", 50, 50);

        businessAccount.loan(51);
        System.out.println(businessAccount.getBalance());     
    }
}
