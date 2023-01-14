import java.util.Scanner;

public class Occurence_of_x {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the length of array:");

        int n = scn.nextInt();

        int[] arr1 = new int[n];
        System.out.println("Enter X");

        int x = scn.nextInt();

        for (int i = 0; i < n; i++) {

            arr1[i] = scn.nextInt();
        }
        System.out.println(occurence(arr1,n,x));
    }
    static int occurence(int [] arr1,int n,int x)
    {
        int c=0;
        for (int i = 0; i < n; i++)
        {
                if(arr1[i]==x)
                 c++;
        }
        return c;
    }
}