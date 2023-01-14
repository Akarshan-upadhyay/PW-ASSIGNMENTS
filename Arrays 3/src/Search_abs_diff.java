import java.util.Scanner;

public class Search_abs_diff {

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
         if(absDiff(arr1,n,x))
             System.out.println("yes");
         else
             System.out.println("no");
    }
    static boolean absDiff(int arr1[],int n,int x)
    {
        for (int i = 0; i < n; i++) {
            for(int j=i+1;j<n;j++)
            {
                if(Math.abs(arr1[i]-arr1[j])==x);
                return true;

            }
        }
        return false;
    }
}