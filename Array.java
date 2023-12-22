import java.util.Scanner;

public class Array {
    public static void main(String args[])
    {
        int marks[]=new int[50];
        int number[]={2,4,7,9};
        int morenumber[]={3,4,5,76};
        String fruits[]={"pradeep","chuham","rajput"};

        Scanner ssc=new Scanner(System.in);
        marks[0]=ssc.nextInt();
        marks[1]=ssc.nextInt();
        marks[2]=ssc.nextInt();
        System.out.println("phy marks" +marks[0]);
        System.out.println("math matks" + marks[1]);
        System.out.println("chemi marks" + marks[2]);


    }
}
