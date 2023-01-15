import java.util.Scanner;

public class RepeatingElement {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the length of array:");

        int n = scn.nextInt();

        int[] arr1 = new int[n];
          for (int i = 1; i < n; i++)
        {

            arr1[i] = scn.nextInt();
        }
        occurence(arr1,n);
    }
    static void occurence(int [] arr1,int n)
    {
        int c=0;
        for (int i = 1; i < n; i++)
        {
            for( c=i+1;c<n;c++)
            {
                if(arr1[i]==arr1[c])
                {
                    System.out.println(i);
                    return;
            }}
        }System.out.println(-1);

    }
}