import java.util.*;
public class InbuiltFunction {
    public static void print(Integer arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i] + " ");
        }
    }
    public static void main(String args[])
    {
        Integer arr[]={1,5,8,3,9,4,7};
       // Arrays.sort(arr);
        Arrays.sort(arr,Collections.reverseOrder());
        print(arr);
    }
}
