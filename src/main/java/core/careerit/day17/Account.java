package core.careerit.day17;

public class Account {
    private long id;
    private String name;
    public double balance;

    public Account  (long id, String name, double balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
        System.out.println("Account Created with Balance: " + balance);

    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Amount Deposited: " + amount);
    }
    public void withdraw(double amount) {
        if (amount > balance){
            System.out.println(" Sorry! Insufficient funds");
        }else {
            balance -= amount;
            System.out.println("Amount" + amount + " is withdrawn from your account");
        }
    }
    public void showInfo() {
        System.out.println("Account Information");
        System.out.println("Account ID: " + id);
        System.out.println("Account Name: " + name);
        System.out.println("Account Balance: " + balance);
    }


}
