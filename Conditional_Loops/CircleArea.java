package Conditional_Loops;

import java.util.*;
public class CircleArea {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double radius;
        System.out.println("Enter the radius of circle");
        radius=sc.nextDouble();
        double area=Math.PI*radius*radius;
        System.out.println("Area is " +area);
        sc.close();
    }
}
