import java.util.Scanner;

public class Find_Missing_no {

    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the length of array");

        int n = scn.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements of array");

        for(int i = 0; i < n; i++){

            arr[i] = scn.nextInt();

        }
        int total = (n * (n + 1)) / 2;
        int sum = 0;
        for (int i = 0; i < n-1; i++) {
            sum += arr[i];
        }

        System.out.println(total-sum);

    }

}