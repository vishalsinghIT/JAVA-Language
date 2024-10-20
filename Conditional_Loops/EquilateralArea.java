package Conditional_Loops;

import java.util.*;
public class EquilateralArea {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double a;
        System.out.println("Enter the side of Equilateral");
        a=sc.nextDouble();
        double area=(Math.sqrt(3)/4)*(a*a);
        System.out.println("Area is "+area);
        sc.close();
    }
}
