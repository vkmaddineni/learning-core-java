package core.careerit.day4;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;


public class DiceGame {

    public static void main(String[] args) {

        int generatedNum = ThreadLocalRandom.current().nextInt(1, 7 );
        for (int i=1;i<=3;i++){
            Scanner sc = new Scanner(System.in);
            System.out.println("Guess a Number 1-6: ");
            int guessNum = sc.nextInt();

            if (guessNum == generatedNum) {
                System.out.println("You guessed a number in "+i+" attempts");
                break;
            }else{
                if(i==3){
                    System.out.println("You have reached maximum attempts ");
                    System.out.println(" The generated number is : "+generatedNum);
                }else{
                    System.out.println("Sorry ! wrong guess. Try again ");
                }

            }
        }

    }
}
