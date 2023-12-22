public class Concatnation {
    public static void printL(String str)
    {
        for(int i=0;i<str.length();i++)
        {
            System.out.print(str.charAt(i) + " ");
        }
    }
    public static void main(String args[])
    {
        String firmame="pradeep";
        String lastname="chauhan";
        String fullname=firmame + " " + lastname;
        //System.out.println(fullname.charAt(2));
        printL(fullname);

    }
}
