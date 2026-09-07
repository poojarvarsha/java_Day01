import java.util.Scanner;

public class Positive{
    public static void main(String[] arg)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        if(n>0)
            System.out.println( "positive");
        else
            if(n<0)
            System.out.println( "negative");
        else
             System.out.println("zero");
            sc.close();
    }
    
}
