package core.careerit.day6;

public class DaysInGivenMonth {
    public DaysInGivenMonth() {
    }

    public static void main(String[] args) {
        int month = 12;
        int year = 2024;
        String monthName = " ";
        switch (month) {
            case 1:
                monthName = "January";
                break;
            case 2:
                monthName = "February";
                break;
            case 3:
                monthName = "March";
                break;
            case 4:
                monthName = "April";
                break;
            case 5:
                monthName = "May";
                break;
            case 6:
                monthName = "June";
                break;
            case 7:
                monthName = " July";
                break;
            case 8:
                monthName = " August";
                break;
            case 9:
                monthName = " September";
                break;
            case 10:
                monthName = " October";
                break;
            case 11:
                monthName = " November";
                break;
            case 12:
                monthName = " December";
                break;
            default:
                System.out.println("" + month + " is not a valid month");
                System.exit(0);
        }

        int var10000;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                var10000 = 31;
                break;
            case 2:
                var10000 = (year % 4 != 0 || year % 100 == 0) && year % 400 != 0 ? 28 : 29;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                var10000 = 30;
                break;
            default:
                throw new IllegalArgumentException("Invalid Month Number ");
        }

        int numDays = var10000;
        System.out.println("Number of Days in " + monthName + "," + year + " : " + numDays);
    }
}
