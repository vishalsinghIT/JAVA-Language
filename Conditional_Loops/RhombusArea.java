package Conditional_Loops;

import java.util.*;
public class RhombusArea {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double d1,d2;
        System.out.println("Enter the value of digonals");
        d1=sc.nextDouble();
        d2=sc.nextDouble();
        double area=(d1*d2)/2;
        System.out.println("Area is "+area);
        sc.close();
    }
}
