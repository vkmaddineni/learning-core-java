package core.careerit.day2;

import java.util.Scanner;

public class ConditionalStatements {
    public static void main(String[] args){
        //Simple if statement

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Age : " );
        int age = sc.nextInt();

        if(age < 0) {
            age = -age;
        }
        System.out.println("Entered Age is : "+age );
    }
}
