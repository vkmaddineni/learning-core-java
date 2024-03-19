package core.careerit.day8;

public class Employee {
    private String empno;
    private String ename;
    private double salary;

    public Employee(String empno, String ename, double salary) {
        this.empno = empno;
        this.ename = ename;
        this.salary = salary;
    }

    public void showDetails(){
        System.out.println(empno+" "+ename+" "+salary);
    }

    public String getEmpno() {
        return empno;
    }

    public String getEname() {
        return ename;
    }

    public double getSalary() {
        return salary;
    }

    public void setEmpno(String empno) {
        this.empno = empno;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
