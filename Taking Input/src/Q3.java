import java.util.*;
public class Q3 {
    public static void main(String[] args) {
        Scanner sn =new Scanner(System.in);
        double a = sn.nextDouble();
        double b = sn.nextDouble();
        double c = sn.nextDouble();
        System.out.println("Total Marks ="+ (a+b+c));
        System.out.println("Percentage="+ ((a+b+c)*100)/300 + "%");
    }
}
