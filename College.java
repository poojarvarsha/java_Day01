import java.util.Scanner;

public class College {
    public static void main(String[] arg )
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name:");
        String name = sc.nextLine();
        System.out.println("Enter the marks:");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int n3=sc.nextInt();
        int total=(n1+n2+n3);
        double avg=(total)/3;
        if(avg>85)
            System.out.println("Distinction");
        else if(avg>34)
            System.out.println("Pass");
        else
            System.out.println("Fail");
        System.out.println("total:" + total);
        System.out.println("Avg:" + avg);
    }
    
}
