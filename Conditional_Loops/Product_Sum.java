package Conditional_Loops;

//Given an integer number n, return the difference between the product of its digits and the sum of its digits.
import java.util.*;
public class Product_Sum 
{
 public static void main(String args[])
 {
    Scanner sc=new Scanner(System.in);
    int n;
    System.out.println("Enter the value of n");
    n=sc.nextInt();
    int pro=1,sum=0;
    while(n>0)
    {
        int r=n%10;
        pro=pro*r;
        sum=sum+r;
        n/=10;
    }
    int sub=pro-sum;
    System.out.println("Subtract is "+sub);
    sc.close();
 }   
}
