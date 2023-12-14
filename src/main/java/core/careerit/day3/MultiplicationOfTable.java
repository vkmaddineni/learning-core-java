package core.careerit.day3;

import java.util.Scanner;

public class MultiplicationOfTable {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int num = sc.nextInt();

        for (int i = 1; i <= 10; i++){
            System.out.printf("%s * %s = %s%n",num,i,num*i);
        }

        System.out.println("-".repeat(50));

        for (int i=10;i>1;i--) {
            System.out.printf("%s * %s = %s%n",num,i,num*i);
        }


    }
}
