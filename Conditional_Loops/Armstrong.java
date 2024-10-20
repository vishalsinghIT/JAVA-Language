package Conditional_Loops;

import java.util.*;
public class Armstrong {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the value of n");
        n=sc.nextInt();
        int sum=0;
        int m=n;
        while(n>0)
        {
            int r=n%10;
             sum=sum+r*r*r;
             n/=10;
        }
        System.out.println(sum);
        if(m==sum)
        {
            System.out.println("Armstrong ");
        }else{
            System.out.println(" NotArmstrong ");
        }
        sc.close();
    }
}
