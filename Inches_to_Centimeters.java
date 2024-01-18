import java.util.Scanner;
public class MyClass{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt();
        double d=2.54*i;
        System.out.printf("%.2f",d);
    }
}