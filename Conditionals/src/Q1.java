import java.util.*;
public class Q1 {
    public static void main(String[] args) {
        Scanner sn =new Scanner(System.in);
        System.out.println("enter length ");
        int a = sn.nextInt();
        System.out.println("enter breadth ");
        int b = sn.nextInt();
         if(a==b)
         {
             System.out.println("square");
         }
         else{
             System.out.println("rectangle");
         }

    }
}