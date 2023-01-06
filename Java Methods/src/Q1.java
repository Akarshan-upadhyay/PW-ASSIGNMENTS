import java.util.Scanner;

public class Q1{

    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the three numbers:");

        int a = scn.nextInt();

        int b = scn.nextInt();

        int c = scn.nextInt();

        System.out.print(avg(a, b, c));

    }

    public static int avg(int a, int b, int c){

        return (a+b+c)/3;

    }

}

