//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package core.careerit.day6;

import java.util.Scanner;

public class CalculatorExample {
    public CalculatorExample() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println(" ");
            System.out.println(" Please Enter 1. Add 2.Subtract 3.Multiply 4.Division 5.Reminder 6.Exit ");
            int ch = sc.nextInt();
            int a;
            int b;
            if (ch >= 6) {
                a = 0;
                b = 0;
            } else {
                System.out.println("Enter the First number  : ");
                a = sc.nextInt();
                System.out.println("Enter the Second number : ");
                b = sc.nextInt();
            }

            switch (ch) {
                case 1:
                    System.out.println("Addition of numbers " + a + " and " + b + " is : " + add(a, b));
                    break;
                case 2:
                    System.out.println("Subtraction of numbers " + a + " and " + b + " is : " + subtract(a, b));
                    break;
                case 3:
                    System.out.println("Multiplication of numbers " + a + " and " + b + " is : " + multiply(a, b));
                    break;
                case 4:
                    System.out.println("Division of numbers " + a + " and " + b + " is : " + divide(a, b));
                    break;
                case 5:
                    System.out.println("Reminder of numbers " + a + " and " + b + " is : " + reminder(a, b));
                    break;
                case 6:
                    System.out.println("Thank you ");
                    System.exit(0);
                default:
                    System.out.println(" Enter Valid input 1-6 only");
            }
        }
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return Math.abs(a - b);
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int divide(int a, int b) {
        return a / b;
    }

    public static int reminder(int a, int b) {
        return a % b;
    }
}
