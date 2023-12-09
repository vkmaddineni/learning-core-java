package core.careerit.day2;

import java.util.Scanner;

public class ProfitCalculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Buying  Price :" );
        float bp = sc.nextFloat();
        System.out.println("Enter the Selling Price :" );
        float sp = sc.nextFloat();


        if (sp > bp){
            float profit = sp-bp;
            System.out.println("Profit is : " +profit );
        }else if (bp > sp){
            float loss = bp-sp;
            System.out.println("Loss   is :" + loss );
        }else {
            System.out.println(" No profit or No Loss" );

        }

    }

}
