import java.util.Scanner;

class Student{
    String name;
    int age,rollno,marks;
    
   void input(){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter name:");
    name = sc.nextLine();

    System.out.println("Enter age:");
    age = sc.nextInt();

    System.out.println( "Enter rollno:");
    rollno = sc.nextInt();

    System.out.println("Enter marks:");
    marks = sc.nextInt();
   }

   void display(){
    System.out.println("Name:" + name);
    System.out.println("age:" + age);
    System.out.println("roll no:" + rollno);
    System.out.println("marks:" + marks);
   }
}
public class Main2{
    public static void main(String[] arg)
    {
        Student s = new Student();
        s.input();
        s.display();
    }
}