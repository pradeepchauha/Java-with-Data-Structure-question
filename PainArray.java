public class PainArray {
    public static void pair(int num[])
    {
        int tp=0;
        for(int i=0;i<num.length;i++)
        {
            int curr=num[i];
            for(int j=i+1;j<num.length;j++)
            {
                System.out.print("(" +curr + "," + num[j] + ")");
                tp++;
            }
            System.out.println();
        }
        System.out.println("total pair " + tp);
    }
    public static void main(String args[])
    {
        int arr[]={2,4,6,8,10};
        pair(arr);

    }
}
