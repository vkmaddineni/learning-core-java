package core.careerit.day12;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class WalletService {

    public static void main(String[] args) {
    }
    public List<Wallet> list;
    public WalletService() {
         list = new ArrayList<>();
    }
    public void createWallet(Wallet wallet){
       if(isWalletExists(wallet.getMobile())){
           System.out.println("Already wallet exists with the given number ");
       }else{
           list.add(wallet);
           System.out.println("Wallet created successfully");
       }
    }
    public void loadMoney(String mobile,double amount){
        if (isWalletExists(mobile)) {
            Wallet wallet = new Wallet();
           // wallet.setBalance(wallet.getBalance()+amount);
            wallet.deposit(amount);

        }else{
            System.out.println(" There is no Wallet exists with this number");
        }
    }

    public void viewWallets(){
        if (list.isEmpty()){
            System.out.println("No Wallet is created yet. Please create a wallet to see details ");
        }else{
            for(Wallet wallet:list){
                System.out.println(" ");
                wallet.showDetails();
                System.out.println(" ");
            }
        }
    }
    public void transferAmount(String fromMobile, String toMobile,double amount ){
        if (isWalletExists(fromMobile) && isWalletExists(toMobile)){
            Wallet fromWallet = new Wallet();
            Wallet toWallet = new Wallet();
            System.out.println(" From Wallet Money "+fromWallet.getBalance());
            System.out.println(" To Wallet Money "+toWallet.getBalance());

            if (fromWallet.getBalance() >= amount) {
                fromWallet.setBalance(fromWallet.getBalance() - amount);
                toWallet.setBalance(toWallet.getBalance()+amount);
                System.out.println("Amount "+amount+ " is credited to your wallet and your current balance is "+ toWallet.getBalance());
                System.out.println("Amount "+amount+ " is debited to your wallet and your current balance is "+  fromWallet.getBalance());

            }else {
                System.out.println(" You don't have sufficient funds");
            }
        }else {
            System.out.println("Please provide valid from and to mobile numbers");
        }
    }
    public boolean isWalletExists(String mobile){
        for(Wallet wallet:list){
          if(wallet.getMobile().equals(mobile)){
              return true;
          }
        }
        return false;
    }
}
