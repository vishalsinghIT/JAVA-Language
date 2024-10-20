package Conditional_Loops;

import java.util.*;
public class RectangleArea {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double length, width;
        System.out.println("Enter the value of Length and width");
        length=sc.nextDouble();
        width=sc.nextDouble();
        double Area=length*width;
        System.out.println("Area is "+Area);
        sc.close();
    }
}
