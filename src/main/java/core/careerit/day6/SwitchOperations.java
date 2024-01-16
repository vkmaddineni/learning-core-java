
package core.careerit.day6;

import java.util.Scanner;

public class SwitchOperations {
    public SwitchOperations() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            while(true) {
                System.out.println(" Please Enter 1. Is Prime 2.Reverse 3.SumOfDigits 4.Fibonacci 5.Exit ");
                int ch = sc.nextInt();
                switch (ch) {
                    case 1:
                        System.out.println("Enter the number to check prime ; ");
                        int pNum = sc.nextInt();
                        System.out.println("Is number " + pNum + " Prime ? " + isPrime(pNum));
                        break;
                    case 2:
                        System.out.println("Enter the number to reverse ; ");
                        int rev = sc.nextInt();
                        System.out.println("Reverse of Number    " + rev + " is : " + reverse(rev));
                        break;
                    case 3:
                        System.out.println("Enter the number to get sum of Digits : ");
                        int sDigit = sc.nextInt();
                        System.out.println("Sum of Digit of " + sDigit + " is : " + sumOfDigits(sDigit));
                        break;
                    case 4:
                        System.out.println("Enter the number to get Fibonacci Term : ");
                        int fNum = sc.nextInt();
                        System.out.println("Fibonacci  Number of " + fNum + " is : " + fibonacciTerm(fNum));
                        break;
                    case 5:
                        System.out.println("Thank you ");
                        System.exit(0);
                    default:
                        System.out.println(" Enter Valid input 1-5 only");
                }
            }
        }
    }

    public static boolean isPrime(int num) {
        if (num < 2 || num % 2 == 0 && num != 2) {
            return false;
        } else {
            for(int i = 2; i <= num / 2; ++i) {
                if (num % i == 0) {
                    return false;
                }
            }

            return true;
        }
    }

    public static int reverse(int num) {
        int rev;
        for(rev = 0; num != 0; num /= 10) {
            int r = num % 10;
            rev = rev * 10 + r;
        }

        return rev;
    }

    public static int sumOfDigits(int num) {
        int sum;
        for(sum = 0; num != 0; num /= 10) {
            int r = num % 10;
            sum += r;
        }

        return sum;
    }

    public static int fibonacciTerm(int num) {
        if (num == 1) {
            return 0;
        } else if (num != 2 && num != 3) {
            int a = 0;
            int b = 1;

            for(int i = 1; i <= num; ++i) {
                int sum = a + b;
                a = b;
                b = sum;
            }

            return b;
        } else {
            return 1;
        }
    }
}
