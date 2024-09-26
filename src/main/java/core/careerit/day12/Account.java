package core.careerit.day12;

public class Account {

    private long acctNumber;
    private String name;
    private double balance;


    public Account(long acctNumber, String name, double balance) {
        this.acctNumber = acctNumber;
        this.name = name;
        this.balance = balance;
    }

    public void withDraw(double amount){
        if(amount > balance) {
            System.out.println("You don't have sufficient funds");
        }else{
            balance -= amount;
            System.out.println("Your account "+maskAcctNumber()+" is debited with " + amount+" and balance is "+balance);
        }
    }
    public void deposit(double amount){
        balance += amount;
        System.out.println("Your account "+maskAcctNumber()+" is credited with "+amount+" and balance is "+balance);
    }
    public void showDetails(){
        System.out.println("Account Number : "+maskAcctNumber());
        System.out.println("Name           : "+name);
        System.out.println("Balance        : "+balance);
    }
    public String maskAcctNumber(){
        String str = String.valueOf(acctNumber);
        return str.substring(0,4)+"****"+str.substring(str.length()-4);
    }
}
