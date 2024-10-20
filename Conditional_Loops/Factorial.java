package Conditional_Loops;

import java.util.*;
public class Factorial {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the value of n");
        n=sc.nextInt();
        int fact=1;
        for(int i=1; i<=n; i++)
        {
            fact=fact*i;
        }
        System.out.print("Factorial is "+fact);
        sc.close();
    }
}
