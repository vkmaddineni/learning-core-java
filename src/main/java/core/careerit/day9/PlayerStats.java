package core.careerit.day9;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class PlayerStats {
    public static void main(String[] args) throws IOException {
        /*Player player = new Player("Dhoni","WK","India","CSK",180000);
        player.showDetails();*/
        /*String line1 ="MS Dhoni,WK-Batsman,India,CSK,132500000";
        String line2 ="Rashid Khan,Bowler,Afghanisthan,GT,150000000";
        String line3 ="Virat Kohli,Batsman,India,RCB,150000000";

        Player player1 = convertRowToPlayer(line1);
        Player player2 = convertRowToPlayer(line2);
        Player player3 = convertRowToPlayer(line3);

        Player[] players = new Player[]{player1,player2,player3};
        for(Player player: players){
            player.showDetails();
        }
        */

        File file = new File(Objects.requireNonNull(PlayerStats.class.getResource("/Players.csv")).getFile());
        List<String> lines = Files.readAllLines(file.toPath());

        int c = 0;

        Player[] players = new Player[lines.size()-1];
        for (int i=1; i < lines.size();i++){
            String row = lines.get(i);
            Player player = convertRowToPlayer(row);
            players[c++] = player;
        }

        /*for(Player player:players){
            player.showDetails();
        }*/
        double maxAmount = getMaxAmount(players);
        System.out.println("Maximum Amount is : "+maxAmount);

        double minAmount = getMinAmount(players);
        System.out.println("Minimum Amount is : "+minAmount);

        String team = "MI";
        double totalAmount = getTotalAmount(players,team);
        System.out.println("Total Amount of "+team+" is : "+totalAmount);
        System.out.println(Arrays.toString(getPlayersAmountBetween(players,1000000,1000000000)));
        Player [] maxPaidPlayers = getMaxPaidPlayers(players);
        for(Player player:maxPaidPlayers){
            player.showDetails();
        }


    }

   private static double getTotalAmount (Player[] arr,String team){
        double totalAmount = 0;
        for(Player player:arr) {
            if (player.getTeam().equals(team)) {
                totalAmount += player.getAmount();
            }
        }
        return totalAmount;
   }

   private static Player[] getPlayersAmountBetween(Player[] arr,double low, double high){
        Player[] tmp = new Player[arr.length];
        int i =0;
        for (Player player:arr){
            if (player.getAmount() >= low && player.getAmount()<= high){
                tmp[i++]= player;
            }
        }
        Player[] finalResult = new Player[i];
        System.arraycopy(tmp,0,finalResult,0,i);
        return finalResult;
   }
   public static Player[] getMaxPaidPlayers(Player[] arr){
        double maxAmount = getMaxAmount(arr);
        Player[] tmp = new Player[arr.length];
        int c =0;
        for(Player player:arr){
            if (player.getAmount() == maxAmount){
                tmp[c++]= player;
            }
        }
        Player[] finalArr = new Player[c];
        System.arraycopy(tmp,0,finalArr,0,c);
        return finalArr;
   }
    private static double getMaxAmount(Player[] players){
        double maxAmount = players[0].getAmount();

        for (Player player : players) {
            double amount = player.getAmount();
            if (maxAmount < amount) {
                maxAmount = amount;
            }
        }
        return maxAmount;

    }
    private static double getMinAmount(Player[] players){
        double minAmount = players[0].getAmount();

        for (Player player : players) {
            double amount = player.getAmount();
            if (minAmount > amount) {
                minAmount = amount;
            }
        }
        return minAmount;

    }
    private static Player convertRowToPlayer(String row){
        String[] arr = row.split(",");
        String  name = arr[0];
        String  role = arr[1];
        String  country = arr[2];
        String  team = arr[3];
        double  amount = Double.parseDouble(arr[4]);
        return new Player(name,role,country,team,amount);
    }
}
