package Conditional_Loops;

import java.util.*;
public class Mulitiplicatin {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the value of n");
        n=sc.nextInt();
        for(int i=0; i<=10; i++)
        {
            int mul=n*i;
            System.out.println(n+ " X" +i+ " = " +mul);
        }
        sc.close();
    }
}
