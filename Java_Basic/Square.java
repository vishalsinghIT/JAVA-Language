package Java_Basic;

import java.util.*;
public class Square {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int side;
        System.out.println("Enter the side of square is ");
        side=sc.nextInt();
        int Area= side*side;
        System.out.println("Enter the side "+Area);
        sc.close();
    }
}
