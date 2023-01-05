import java.util.*;
public class Q2{
    public static void main(String[] args) {
        Scanner sn =new Scanner(System.in);
        int a = sn.nextInt();
        int b = sn.nextInt();
        System.out.println("before "+a+"" + b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("after "+a +""+ b);
    }
}