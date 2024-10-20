package Conditional_Loops;

import java.util.*;
public class PrismVolume {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double base, height;
        System.out.println("Enter the value of base height ");
        base=sc.nextDouble();
        height=sc.nextDouble();
        double volume= base*height;
        System.out.println("Volume is "+volume);
        sc.close();
    }
}
