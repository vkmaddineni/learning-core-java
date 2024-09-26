package core.careerit.day16;

public class Student {
   private final int id;
   private final String name;
   private final int section;
   private final int year;

   public Student(int id, String name, int section, int year) {
      this.id = id;
      this.name = name;
      this.section = section;
      this.year = year;
   }
   public Student promote(){
       return new Student(id,name,section+1,year+1);
   }
   public void showDetails(){
       System.out.println("Id: "+id);
       System.out.println("Name: "+name);
       System.out.println("Section: "+section);
       System.out.println("Year: "+year);
   }

}
