import java.util.Scanner;
public class MyClass
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int d=a*a+b*b;
        double c=Math.sqrt(d);
        System.out.printf("%.2f",c);
    }
}