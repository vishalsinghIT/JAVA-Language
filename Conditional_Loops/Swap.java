package Conditional_Loops;

import java.util.*;
public class Swap {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x,y;
        System.out.println("Enter the value of x,y,");
        x=sc.nextInt();
        y=sc.nextInt();
        // swap number
        int temp=x;
        x=y;
        y=temp;
        System.out.println(x+ " , " +y);
        sc.close();
    }
}
