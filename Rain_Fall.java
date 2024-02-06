import java.util.*;
public class Cs{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a<3)
        {
            System.out.print("LIGHT");
        }
        else if(a>=3 && a<7)
        {
            System.out.print("MODERATE");
        }
        else if(a>=7)
        {
            System.out.print("HEAVY");
        }
    }
}