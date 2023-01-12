import java.util.*;
public class Q1
{
//    static void printArray(int [] arr)
//    {
//        for(int i=0;i<arr.length;i++)
//        {
//            System.out.println(arr[i]);
//        }
//    }
    static void checkPositive(int [] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>=0)
            System.out.println(arr[i]);
        }
    }
    public static void main(String [] args )
    {
        Scanner sn=new Scanner(System.in);
        int [] arr = new int[7];
        int i;
        for(i=0;i<arr.length;i++)
        {
            arr [i] = sn.nextInt();
        }
       checkPositive(arr);


    }
}