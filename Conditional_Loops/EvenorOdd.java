package Conditional_Loops;

import java.util.*;
public class EvenorOdd {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the value of n");
        n=sc.nextInt();
        if(n%2==0)
        {
            System.out.println("Even number ");
        }
        else{
            System.out.println("Odd");
        }
        sc.close();
    }
    
}
