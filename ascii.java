import java.util.Scanner;
class ascii
{
    public static void main(String args[])
    {
        char ch;
        System.out.print("enter the character ;");
        Scanner r=new Scanner(System.in);
        ch=r.next().charAt(0);
        System.out.print(ch);
    }
}