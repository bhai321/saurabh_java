public class ConOverload
{
    // instance variables of the class
    int id;
    String name;
    ConOverload()
    {
        System.out.println("this a default constructor");
    }
    ConOverload(int i, String n)
    {
        id = i;
        name = n;
    }
public static void main(String[] args)
    {
        // object creation
        ConOverload s = new ConOverload();
        System.out.println("\nDefault Constructor values: \n");
System.out.println("Student Id : "+s.id + "\nStudent Name : "+s.name); 
System.out.println("\nParameterized Constructor values: \n"); 
ConOverload student = new ConOverload(10, "Shri"); 
System.out.println("Student Id : "+student.id + "\nStudent Name : "+student.name); 
    }
}