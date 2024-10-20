package Conditional_Loops;

//A factor is a number that divides another number exactly without leaving a remainder. 
import java.util.*;
public class Factor {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the value of n");
        n=sc.nextInt();
        for(int i=2; i<=n; i++)
        {
            if(n%i==0)
            {
                System.out.print(i+ " , ");
            }
        }
        sc.close();

    }
}
