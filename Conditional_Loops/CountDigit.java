package Conditional_Loops;

import java.util.*;
public class CountDigit {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the value of n");
        n=sc.nextInt();
        int count=0;
        while(n>0)
        {
            n/=10;
            count++;
        }
        System.out.println("Nubmer of digit is "+count);
        sc.close();
    }
}
