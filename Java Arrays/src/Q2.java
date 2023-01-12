import java.util.*;
public class Q2
{
    //    static void printArray(int [] arr)
//    {
//        for(int i=0;i<arr.length;i++)
//        {
//            System.out.println(arr[i]);
//        }
//    }
    static void printOddIndices( String [] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(i%2!=0)
                System.out.println(arr[i]);
        }
    }
    public static void main(String [] args )
    {
        Scanner sn=new Scanner(System.in);
        System.out.println("enter length of array ");
        int n= sn.nextInt();
        String [] arr = new String[7];
        int i;
        for(i=0;i<arr.length;i++)
        {
            arr [i] = sn.next();
        }
        printOddIndices(arr);


    }
}