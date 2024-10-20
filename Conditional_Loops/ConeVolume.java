package Conditional_Loops;

import java.util.*;
public class ConeVolume {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double r,h;
        System.out.println("Enter the value of radius and height");
        r=sc.nextDouble();
        h=sc.nextDouble();
        double volume=(Math.PI*r*r*h)/3;
        System.out.println("Area is " +volume);
        sc.close();
    }
}
