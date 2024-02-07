import java.util.*;
public class Cs{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        //int c=(a*a)+(b*b);
        double d=Math.sqrt((a*a)+(b*b));
        System.out.printf("%.2f",d);
    }
}