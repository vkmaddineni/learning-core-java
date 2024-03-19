package core.careerit.day8;

import java.util.Arrays;

public class EmployeeDetails {
    public static void main(String[] args) {
      String data ="1001-Venukumar-1000000,1002-Raj-150000,1003-Madhu-300000,1004-Srini-100000";
      String[] empArr = data.split(",");
      System.out.println(Arrays.toString(empArr));
      Employee[] arr = new Employee[empArr.length];
      int i =0;
      for(String ele:empArr){
         String[] empData = ele.split("-");
         String empno = empData[0];
         String ename = empData[1];
         double salary = Double.parseDouble(empData[2]);
         Employee emp = new Employee(empno,ename,salary);
         arr[i++] = emp;
      }
      for (Employee emp:arr){
          emp.showDetails();
      }
    }
}
