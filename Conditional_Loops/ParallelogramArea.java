package Conditional_Loops;

import java.util.*;
public class ParallelogramArea {
    public  static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double base,height;
        System.out.println("Enter the value of base, height");
        base=sc.nextDouble();
        height=sc.nextDouble();
        double area=base*height;
        System.out.println("Area is "+area);
        sc.close();
    }
}
