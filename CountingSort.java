public class CountingSort {
    public static void countingsort(int arr[])
    {
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            largest=Math.max(largest,arr[i]);
        }
        int count[]=new int[largest+1];
        for(int i=0;i<arr.length;i++)
        {
            count[arr[i]]++;

        }
        for(int i=0;i<count.length;i++)
        {
            int j=0;
            while(count[i]>0)
            {
                arr[j]=i;
                j++;
                count[i]--;

            }
        }
    }
    public static void print(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i] + " ");
        }
    }
    public static void main(String args[])
    {
        int arr[]={5,4,1,3,2};
        countingsort(arr);
        print(arr);
    }
}
