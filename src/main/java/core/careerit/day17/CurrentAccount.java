package core.careerit.day17;

public class CurrentAccount extends Account{
    private double overdraftLimit;
    public CurrentAccount(long id, String name, double balance, double overdraftLimit) {
        super(id, name, balance);
        this.overdraftLimit = overdraftLimit;
    }
    public void withdraw(double amount) {
        if (amount > balance){
            if(amount > balance + overdraftLimit){
                System.out.println("Sorry ! Insufficient Balance");
            } else {
                balance -= amount;
                System.out.println("Amount " + amount+ " withdrawn from your account");
            }
            System.out.println("You have reached your overdraft limit");
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
