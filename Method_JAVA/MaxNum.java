import java.util.*;
public class MaxNum {
    public static int LargestNum(int x,int y, int z)
    {
        if(x>y && x>z)
        {
            return x;
        }else if(y>x &&  y>z)
        {
            return y;
        }else
        {
            return z;
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of x y and z");
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=sc.nextInt();
        int max=LargestNum(x, y, z);
        System.out.println(" Max is "+max);
        sc.close();
    }
}
