package Java_Basic;

import java.util.*;
public class InputSum {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x,y,sum=0;
        System.out.println("Enter the value of x and y");
        x=sc.nextInt();
        y=sc.nextInt();
        sum=x+y;
        System.out.println("Sum is " +sum);
        sc.close();
    }
}
