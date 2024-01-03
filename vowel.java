import java.util.Scanner;
class vowel
{
    public static void main(String args[])
     {
        char ch;
        System.out.print("Enter the character");
        Scanner r=new Scanner(System.in);
        ch=r.next().charAt(0);
        if(ch=='e'||ch=='o'||ch=='a')
        {
            System.out.print("vowel");
        }
        else
        {
            System.out.print("consonant");
        }
    }
}