package Conditional_Loops;

import java.util.*;
public class Reverse {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the value of n");
        n=sc.nextInt();
        int rev=0;
        while (n>0)
         {
          int r=n%10;
          rev=rev*10+r;
          n/=10;
        }
        System.out.println(rev);
        sc.close();
    }
}
