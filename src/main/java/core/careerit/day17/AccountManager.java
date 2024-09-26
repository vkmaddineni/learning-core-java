package core.careerit.day17;

public class AccountManager {

    public static void main(String[] args) {
        Account account = new Account(1001, "John", 45000);
        account.deposit(5000);
        account.withdraw(10000);
        account.showInfo();
        SavingsAccount savingsAccount = new SavingsAccount(1002, "Jane", 25000, 5000);
        savingsAccount.deposit(5000);
        savingsAccount.withdraw(10000);
        savingsAccount.showInfo();
        CurrentAccount currentAccount = new CurrentAccount(1003, "Doe", 35000, 10000);
        currentAccount.deposit(5000);
        currentAccount.withdraw(100000);
        currentAccount.showInfo();

        }
}
