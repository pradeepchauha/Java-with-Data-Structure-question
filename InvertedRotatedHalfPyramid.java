public class InvertedRotatedHalfPyramid {
    public static void patter(int totrow )
    {
        for(int i=1;i<=totrow;i++)
        {
            for(int j=1;j<=totrow-i;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        patter(4);
    }
}
