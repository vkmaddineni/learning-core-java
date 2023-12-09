package core.careerit.day3;

import java.util.Scanner;

public class SumOfNNaturalNumbers {
    public static void main(String[] args){
        // Sum of N Natural Numbers
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of number : ");
        int num = sc.nextInt();
        int sum = (num * (num+1))/2;
        System.out.println("Sum of the first "+num+" natural numbers is : "+sum);
        double avg = sum/(double) num;
        System.out.println("Average of the first "+num+" natural numbers is : "+avg);
        
        
    }
}
