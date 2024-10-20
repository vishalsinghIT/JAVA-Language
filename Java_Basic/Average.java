package Java_Basic;

import java.util.*;
public class Average {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter the value of a,b and c");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        int Avg=(a+b+c)/3;
        System.out.println("The average is "+Avg);
        sc.close();
    }
}
