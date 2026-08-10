import java.util.Scanner;
public class Username{
    public static void main(String[] arg)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your name:");
        String name = sc.nextLine();
        System.out.println("My name is " + name);

    }
}