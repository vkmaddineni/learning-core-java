package core.careerit.day17;

public class TransactionManager {
    public static void main(String[] args) {
        Transaction t1 = new Transaction(1, "A", "B", 1000, "Success");
        Transaction t2 = new Transaction(2, "B", "C", 2000, "Success");
        Transaction t3 = new Transaction(3, "C", "D", 3000, "Pending");
        Transaction t4 = new Transaction(4, "D", "E", 4000, "Pending");
        Transaction t5 = new Transaction(5, "E", "F", 5000, "Success");

        t1.showDetails();
        t2.showDetails();
        t3.showDetails();
        t4.showDetails();
        t5.showDetails();
    }

}
