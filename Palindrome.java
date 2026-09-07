import java.util.Scanner;

public class Palindrome {
    public static void main(String[] arg)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        int num=n;
        int rev=0;
        while(n>0)
        {
            int x=n%10;
            rev=rev*10+x;
            n=n/10;
        }
        if(num==rev)
             System.out.println("its a palindrome");
        else
            System.out.println("its not a palindrome");
        sc.close();
    }
}
