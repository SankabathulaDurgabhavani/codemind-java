import java.util.Scanner;
public class MyClass
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        float f=(a+b)/2f;
        System.out.printf("%.4f",f);
    }
}