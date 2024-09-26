package core.careerit.day17;

public class SavingsAccount extends Account{
    private double minBalance;
    public SavingsAccount(long id, String name, double balance, double minBalance) {
        super(id, name, balance);
        this.minBalance = minBalance;
    }
    public void withdraw(double amount) {
        if (amount > balance){
            System.out.println(" Sorry ! Insufficient Balance");
        }else if (balance - amount < minBalance) {
            System.out.println("Sorry ! Minimum Balance must be maintained");
        } else {
            balance -= amount;
            System.out.println("Amount " + amount + " withdrawn from your account");
        }

    }
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Amount " + amount + " deposited to your account");
    }
}
