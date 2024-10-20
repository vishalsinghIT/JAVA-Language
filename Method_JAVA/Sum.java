import java.util.*;
public class Sum {
    public static int Add(int x, int y){
        return x+y;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number x and y");
        int x=sc.nextInt();
        int y=sc.nextInt();
        int sum=Add(x, y);
        System.out.println("Sum is "+sum);
        sc.close();
    }
}
