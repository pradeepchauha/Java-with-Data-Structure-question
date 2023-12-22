import java.util.Scanner;

public class PrimeNumber1 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num= sc.nextInt();
        boolean isPrime=true;
        for(int i=2;i<=num-1-i;i++)
        {
            if(num%i==0)
            {
                isPrime=false;
            }

        }
        if(isPrime==true)
        {
            System.out.println("n is prime number");
        }
        else {
            System.out.println("n is not prime");
        }

    }
}
