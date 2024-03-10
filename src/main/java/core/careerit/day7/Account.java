package core.careerit.day7;

public class Account {
    int acctNum;
    String name;
    double balance;

   public Account(int acctNum,String name,double balance ){
       this.acctNum = acctNum;
       this.name    = name;
       this.balance = balance;
   }
    public void withdraw(double amount){
        if (amount <= balance) {
            balance = balance - amount;
          } else {
            System.out.println("This account doesn't have sufficient balance");
        }
    }
    public void deposit(double amount){
         balance = balance + amount;
    }
    public void showDetails(){
        System.out.println(acctNum+" "+name+" "+balance);
    }
}
