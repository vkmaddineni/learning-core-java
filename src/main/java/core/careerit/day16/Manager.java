package core.careerit.day16;

public class Manager {
    public static void main(String[] args) {
        Student student = new Student(1001, "John", 1, 2021);
        student.showDetails();
        Student student1 = student.promote();
        student1.showDetails();
        Student student2 = student1.promote();
        student2.showDetails();
        student.showDetails();
    }
}
