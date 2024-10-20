package Conditional_Loops;

import java.util.*;
public class TriangleArea {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double base,height;
        System.out.println("Enter the value of base, height");
        base=sc.nextDouble();
        height=sc.nextDouble();
        double area=(base*height)/2;
        System.out.println("Area is "+area);
        sc.close();
    }
}
