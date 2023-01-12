import java.util.*;
public class Q5 {

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int[] arr = new int[7];
        int i;
        for (i = 0; i < arr.length; i++) {
            arr[i] = sn.nextInt();
        }
        for (i = 1; i < arr.length - 1; i++) {
            if (arr[i - 1] < arr[i] && arr[i] > arr[i + 1]) {
                System.out.println(arr[i]);
                break;
            }
        }


    }

}