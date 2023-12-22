public class SelectionSort {
    public static void selection(int arr[])
    {
        for(int i=0;i<arr.length-1;i++)
        {
            int minPos=i;
            for(int j=i+1;j<arr.length-1-i;j++)
            {
               if(arr[minPos]>arr[j])
               {
                   minPos=j;

               }
            }
//            swap
            int temp=arr[minPos];
            arr[minPos]=arr[i];
            arr[i]=temp;
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
        int num[]={5,4,1,2,3};
        selection(num);
        print(num);
    }
}
