package core.careerit.day2;

import java.util.Scanner;

public class RequiredCabs {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of students : ");
        int studentCount = sc.nextInt();
        System.out.println("Enter the number of available seats in cab : ");
        int cabCapacity = sc.nextInt();

        int requiredCabs = studentCount / cabCapacity;
        if(studentCount % cabCapacity != 0) {
          requiredCabs +=1;
        }
        System.out.println("Required Cabs  : "+requiredCabs);


    }
}
