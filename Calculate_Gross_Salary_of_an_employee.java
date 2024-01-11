import java.util.Scanner;
public class MyClass{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        float bs=sc.nextFloat();
        float hra=sc.nextFloat();
        float da=sc.nextFloat();
        double pf=(0.12)*bs;
        double gs=bs+hra+da+pf;
        System.out.printf("%.2f
",pf);
        System.out.printf("%.2f",gs);
    }
}