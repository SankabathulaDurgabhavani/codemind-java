import java.util.Scanner;
public class MyClass{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=512*2*a*b*c;
        System.out.printf("%d KB",d/1024);
    }
}