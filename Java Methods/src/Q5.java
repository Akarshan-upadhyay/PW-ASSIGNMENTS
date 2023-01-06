import java.util.Scanner;

public class Q5{

    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the three numbers:");

        int a = scn.nextInt();

        int b = scn.nextInt();

        int c = scn.nextInt();

        System.out.print(smallest(a, b, c));

    }

    public static int smallest(int a, int b, int c){

        return Math.min(a, Math.min(b,c));

    }

}
