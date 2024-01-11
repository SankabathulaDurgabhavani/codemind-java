import java.util.Scanner;
public class MyClass{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=sc.nextInt();
        int w=(z-y);
        int a=w/x;
        System.out.println(a);
    }
}