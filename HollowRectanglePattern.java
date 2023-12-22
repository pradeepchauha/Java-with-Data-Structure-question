

public class HollowRectanglePattern {
    public static void hollow(int totrow,int totlcol)
    {
        for(int i=1;i<=totrow;i++)
        {
            for(int j=1;j<=totlcol;j++)
            {
                if(i==1 || i==totrow || j==1 || j==totlcol)
                {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        hollow(12,5);
    }
}
