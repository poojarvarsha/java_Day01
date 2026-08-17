import java.util.Scanner;
public class Checkevenodd {
    public static void main(String[] arg)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n1 = sc.nextInt();
        if(n1%2==0)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }
    
}
