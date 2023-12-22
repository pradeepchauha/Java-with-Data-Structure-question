public class ReverseArray {
    public static void reverse(int num[])
    {
        int first=0,last=num.length-1;
        while(first<last)
        {
            int temp=num[last];
            num[last]=num[first];
            num[first]=temp;
            first++;
            last--;
        }
    }
    public static void main(String agrs[])
    {
        int arr[]={2,4,6,8,10,12};
        reverse(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]  + " ");
        }
    }
}
