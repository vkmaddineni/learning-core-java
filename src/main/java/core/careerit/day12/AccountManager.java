package core.careerit.day12;

public class AccountManager {
    public static void main(String[] args) {
         Account acct1 = new Account(126576565,"Venu Maddineni",127000.00);
         Account acct2 = new Account(26455744,"Tarun Maddineni",137000.00);
        acct1.showDetails();
        acct2.showDetails();
    }
}
