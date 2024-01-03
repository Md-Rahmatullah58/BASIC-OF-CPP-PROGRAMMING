import java.util.Scanner;
class palindrome
{
    public static void main(String args[])
    {
        int n,r,sum=0,c;//arm=0
        System.out.print("Enter the number :");
        Scanner q=new Scanner(System.in);
        n=q.nextInt();
        c=n;
        while(n!=0)
        {
            r=n%10;
            sum=(sum*10)+r;//arm+r*r*r
            n=n/10;
        }
        if(c==sum)
        {
        System.out.print("palindrome number is = ");//armstrong number
        }
        else
        {
            System.out.print("Not Palindrome number");
        }
    }
}