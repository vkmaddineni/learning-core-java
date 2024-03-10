package core.careerit.day7;

public class AccountManager {
    public static void main(String[] args) {
        Account account1 = new Account(1000,"Venu Maddineni",5000000);
        Account account2 = new Account(1001,"Mary",500000);

        account1.withdraw(200000);
        account2.deposit(500000);

        account1.showDetails();
        account2.showDetails();
    }

}
