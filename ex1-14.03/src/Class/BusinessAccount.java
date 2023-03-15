package Class;

public class BusinessAccount extends Account {
    private double loanLimit;

    public BusinessAccount(int number, String holder, double balance, double loanLimit) {
        super(number, holder, balance);

        if(loanLimit >= 0) {
            this.loanLimit = loanLimit;
            return;
        }

        throw new Error("The loan limit cannot be a negative value.");
    }
    
    public void loan(double amount){
        if(amount <= 0) {
            System.out.println("You cannot request a loan for a negative or zero value.");
            return;
        }

        if(loanLimit < amount) {
            this.balance -= 10;
        }

        this.balance += amount;

    }
}