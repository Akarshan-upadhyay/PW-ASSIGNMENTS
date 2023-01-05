import java.util.*;
public class Q5 {
    public static void main(String[] args) {
        Scanner sn =new Scanner(System.in);
        System.out.println("enter first number ");
        int a = sn.nextInt();
        System.out.println("enter second number ");
        int b = sn.nextInt();
        System.out.println("Numbers before Swap "+ a +","+b);
        int temp =0;
        temp= a;
        a=b;
        b= temp;
        System.out.println("numbers after swap "+ a +","+b);

    }
}
