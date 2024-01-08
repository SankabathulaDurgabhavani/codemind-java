import java.util.Scanner;
public class MyClass{
    public static void main(String[] args)
    {
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int r=a/365;
    int s=a%365;
    int t=s/7;
    System.out.println(r);
    System.out.println(t);
    }
}