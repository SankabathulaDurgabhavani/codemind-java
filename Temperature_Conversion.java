import java.util.Scanner;
public class MyClass{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        float a=sc.nextFloat();
        double r=32+(a*9/5);
        System.out.printf("%.2f",r);
    }
}