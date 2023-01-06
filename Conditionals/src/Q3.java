import java.util.*;
public class Q3 {
    public static void main(String[] args) {
        Scanner sn =new Scanner(System.in);
        System.out.println("enter cost price");
        double cp = sn.nextDouble();
        System.out.println("enter selling price ");
        double sp = sn.nextDouble();
        if(sp>cp)
        System.out.println("profit = "+ (sp-cp));
        else
        System.out.println("loss = "+ (cp-sp));
    }
}
