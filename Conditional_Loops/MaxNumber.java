package Conditional_Loops;

import java.util.*;
public class MaxNumber {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x,y,z;
        System.out.println("Enter the value of x,y,z");
        x=sc.nextInt();
        y=sc.nextInt();
        z=sc.nextInt();
        if(x>y && x>z)
        {
            System.out.println(x);
        }
        else if(y>x && y>z)
        {
            System.out.println(y);
        }
        else
        {
            System.out.println(z);
        }
        sc.close();
    }
}
