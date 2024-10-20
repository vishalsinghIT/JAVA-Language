package Java_Basic;

import java.util.*;
public class Product {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x;
        double y;
        float z;
        System.out.println("Enter the value of x,y,and z");
        x=sc.nextInt();
        y=sc.nextDouble();
        z=sc.nextFloat();
        double mul= x*y*z;
        System.out.println("Product is " +mul);
        sc.close();
    }
}
