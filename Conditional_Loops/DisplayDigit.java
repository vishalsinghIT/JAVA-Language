package Conditional_Loops;

import java.util.*;
public class DisplayDigit {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the value of n");
        n=sc.nextInt();
        while(n>0)
        {
            int r=n%10;
            System.out.println(r);
            n/=10;
        }
        sc.close();
    }
}
