import java.util.*;
public class Product {
    public static int Mul(int x, int y)
    {
        return x*y;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of x,y");
        int x= sc.nextInt();
        int y=sc.nextInt();
        int pro=Mul(x, y);
        System.out.println("Product is "+pro);
        sc.close();
    }
}
