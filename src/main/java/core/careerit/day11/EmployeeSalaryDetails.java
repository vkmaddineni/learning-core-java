package core.careerit.day11;

import java.util.Scanner;

public class EmployeeSalaryDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(EmployeeSalaryDetails.class.getResourceAsStream("/employee.txt"));
        boolean isHeading = true;
        while (sc.hasNextLine()){
            String data = sc.nextLine();
           if(isHeading){
               isHeading = false;
               continue;
           }else{
               String [] arr = data.split(",");
               double salary = Double.parseDouble(arr[2]);
               double comm   = Double.parseDouble(arr[3]);
               double totalSalary = salary + comm;
               double bonus = 500;
               if(comm > 0 && comm <500) {
                   bonus = comm * 2;
               }else if (comm > 500){
                   bonus = comm + comm/2;
               }
               data += ","+totalSalary+","+bonus;
               System.out.println("----------------------------------");
               System.out.println(data);
           }
        }
    }
}
