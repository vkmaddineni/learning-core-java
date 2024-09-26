package core.careerit.day12;

public class Wallet {

    private String name;
    private String mobile;
    private double balance;

    public Wallet(String name, String mobile, double balance) {
        this.name = name;
        this.mobile = mobile;
        this.balance = balance;
    }

    public Wallet() {

    }

    public void showDetails(){
        System.out.println(name+" "+mobile+" "+balance);
    }
    public void deposit(double amount)
    {
        balance += amount;
        System.out.println("The amount "+amount+" is credit to your account and your current balance is "+balance);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
