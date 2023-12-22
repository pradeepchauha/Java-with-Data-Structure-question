import java.util.StringTokenizer;

public class SubString {
    public static String substring12(String str, int si,int end)
    {
        String substr="";
        for(int i=si;i<end;i++)
        {
            substr+=str.charAt(i);

        }
        return substr;
    }
    public static void main(String args[])
    {
        String str="HelloWorld";
        System.out.println(str.substring(0,5));
       // System.out.println( substring(str,1,5));
    }
}
