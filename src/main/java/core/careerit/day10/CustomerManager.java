package core.careerit.day10;

public class CustomerManager {
    public static void main(String[] args) {
        Customer c1 = new Customer("1001", "Krishna", "krishna.vytla@gmail.com");
        Customer c2 = new Customer("1002", "Manoj", "manojk.kumar@gmail.com");
        Customer c3 = new Customer("1003", "Charan", "charan.bachu@gmail.com");
        Customer c4 = new Customer("1004", "Sai", "saikarry@gmail.com");

        Customer[] customers = {c1, c2, c3, c4};
        for (Customer customer : customers) {
            System.out.println(customer.getId());
            System.out.println(customer.getName());
            System.out.println(customer.getEmail());

        }
    }
}
