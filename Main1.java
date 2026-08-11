import java.util.Scanner;

class Student{
    String name;
    int age,rollno,marks;
    
   void input(){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter name:");
    String name=nextline();

    System.out.println("Enter age:");
    int age =nextint();

    System.out.println("Enter rollno:");
    int rollno =nextint();

    System.out.println("Enter marks:");
    int marks =nextint();
   }

   void display(){
    System.out.println("Name:" + name);
    System.out.println("age:" + age);
    System.out.println("roll no:" + rollno);
    System.out.println("marks:" + marks);
   }
}
public class Main1
{
    public static void main(String[] arg)
    {
        Student s= new Student();
        s.input();
        s.display();
    }
}