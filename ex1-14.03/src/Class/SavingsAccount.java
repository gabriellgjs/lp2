package Class;

public class SavingsAccount extends Account {
    private double interestRate;
    
    
    public SavingsAccount(int number, String holder, double balance, double interestRate) {
        super(number, holder, balance);

        if(interestRate >= 0){
            this.interestRate = interestRate;
            return;
        }

        throw new Error("The interest rate of a Savings Account cannot be negative.");
    }

    public void uptadeBalance() {
       this.balance += this.balance * this.interestRate;
    }
}