public class LargestArray {
    public static int largest(int arr[])
    {
        int largest=Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(largest<arr[i])
            {
                largest=arr[i];
            }
            if(smallest>arr[i])
            {
                smallest=arr[i];
            }


        }
        System.out.println("smallest vallue" + smallest);
        return largest;
    }
    public static void main(String args[])
    {
        int num[]={2,4,6,8,10,12,14,16,18};
        System.out.println("the largest vallue id " + largest(num));

    }
}
