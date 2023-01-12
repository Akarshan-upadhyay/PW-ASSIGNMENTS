import java.util.*;
public class Q3
{
    static void printArray(int [] arr)
    {

        for( int i : arr)
        {
            if(i%2==0)
            System.out.println(i);
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
        printArray(arr);


    }
}