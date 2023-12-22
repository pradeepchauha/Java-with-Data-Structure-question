import java.util.Scanner;

public class SumOfNaturalNumber {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num= sc.nextInt();
        int sum=0;
        int i=1;
        for(  i=0;i<=num;i++)
        {
            sum=sum+i;
            System.out.println(sum);

        }
    }
}
