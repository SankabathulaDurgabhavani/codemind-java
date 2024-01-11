import java.util.Scanner;
public class MyClass{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int z=a/(60*60);
        int m=a%(60*60);
        int d=m/60;
        int s=m%60;
        System.out.printf("H:M:S-%d:%d:%d",z,d,s);
    }
}