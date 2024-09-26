package core.careerit.day11;

public class StringExample2 {
    public static void main(String[] args) {
        String s1 = "Core";
        String s2 = "core";
        String s3 = new String("Core");
        String s4 = new String("core");

        System.out.println(s1.equals(s4));
        System.out.println(s2.equals(s3));
        System.out.println(s3.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s2.equals(s4));

    }
}
