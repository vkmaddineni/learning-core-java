package core.careerit.day1;

import java.util.Scanner;

public class SqrtOfANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num1 = sc.nextInt();
        double sqrt = Math.sqrt(num1);

        System.out.println("Sqrt of "+num1+" is : "+Math.round(sqrt));


    }
}
