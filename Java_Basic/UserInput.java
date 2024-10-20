package Java_Basic;

import java.util.*;
public class UserInput {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        float y=sc.nextFloat();
        double z=sc.nextDouble();
        String name=sc.next();
        String namef=sc.nextLine();
        System.out.println(x+ " ," +y+ "," +z+ " ," +name+ " ," +namef+ ",");
        sc.close();


    }
}
