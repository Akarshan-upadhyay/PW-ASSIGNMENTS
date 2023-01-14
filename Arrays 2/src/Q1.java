import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the length of array:");

        int n = scn.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++){

            arr[i] = scn.nextInt();

        }

        int[] ans = new int[n];

        int idx = 0;

        for(int i = 0; i < n; i++){

            if(arr[i] >= 0){

                ans[idx] = arr[i];

                idx++;

            }

        }

        for(int i = 0; i < n; i++){

            if(arr[i] < 0){

                ans[idx] = arr[i];

                idx++;

            }

        }

        for(int i = 0; i < n; i++){

            System.out.print(ans[i] + " ");

        }

    }

}
//import java.util.Arrays;
//
//public class MoveNegatives {
//    public static void main(String[] args) {
//        int[] arr = {1, -1, 3, 2, -7, -5, 11, 6};
//
//        int j = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] >= 0) {
//                int temp = arr[i];
//                arr[i] = arr[j];
//                arr[j] = temp;
//                j++;
//            }
//        }
//
//        System.out.println("Modified array: " + Arrays.toString(arr));
//    }
//}
