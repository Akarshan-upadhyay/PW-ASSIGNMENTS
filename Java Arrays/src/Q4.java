import java.util.*;
public class Q4
{

    public static void main(String [] args )
    {
        Scanner sn=new Scanner(System.in);
        int [] arr = new int[7];
        int i;
        for(i=0;i<arr.length;i++)
        {
            arr [i] = sn.nextInt();
        }
        System.out.println((Arrays.stream(arr).min()));

    }
}