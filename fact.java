import java.util.Scanner;
class fact
{
    public static void main(String args[])
    {
        int i,n,fact=1;
        System.out.print("Enter the number :");
        Scanner r=new Scanner(System.in);
         n=r.nextInt();
         for(i=1;i<=n;i++)
         {
            fact=fact*i;
         }
         System.out.print("factorial is = :"+fact);
    }
}