package core.careerit.day6;

import java.util.Scanner;

public class MonthName {
    public MonthName() {
    }

    public static void main(String[] args) {
        String monthName = " ";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Date of Birth : ");
        String dob = sc.next();
        String[] arr = dob.split("-");
        int month = Integer.parseInt(arr[1]);
        switch (month) {
            case 1:
                monthName = " January ";
                break;
            case 2:
                monthName = " February ";
                break;
            case 3:
                monthName = " March ";
                break;
            case 4:
                monthName = " April ";
                break;
            case 5:
                monthName = " May ";
                break;
            case 6:
                monthName = " June ";
                break;
            case 7:
                monthName = " July ";
                break;
            case 8:
                monthName = " August ";
                break;
            case 9:
                monthName = " September ";
                break;
            case 10:
                monthName = " October ";
                break;
            case 11:
                monthName = " November ";
                break;
            case 12:
                monthName = " December ";
                break;
            default:
                System.out.println("" + month + " is not a valid month");
                System.exit(0);
        }

        String formattedDob = monthName + " " + arr[2] + "," + arr[0];
        System.out.println("Date of Birth in text format is " + formattedDob);
    }
}
