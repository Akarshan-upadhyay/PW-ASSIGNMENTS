import java.util.*;
public class Q3{
    public static void main(String[] args) {
        Scanner sn =new Scanner(System.in);
        int a = sn.nextInt();
        int sum=0 , r;
     while(a!=0)
     {
         r=a%10;
         sum = sum+r;
         a=a/10;
     }
        System.out.println("after "+sum);
    }
}
