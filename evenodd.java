import java.util.Scanner;
class evenodd
{
    public static void main(String[] args)
{
    int n;
    System.out.print("enter number :");
    Scanner r=new Scanner(System.in);
    n=r.nextInt();
    if(n%2==0)
    {
    System.out.print("Even number is="+n);
    }
    else
    {
        System.out.print("Odd number is =+n");
    }
}
}