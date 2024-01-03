import java.util.Scanner;
class Star 
{
    public static void main(String args[])
    {
        int n,i,j,k;
        System.out.print("Enter the number :");
        Scanner r=new Scanner(System.in);
        n=r.nextInt();
        for(i=1;i<=n;i++)
        {
         for(j=i;j<n;j++)
         {
            System.out.print("  ");//duoble space is triangle and single for pyramid okk!!
         }
         for(k=1;k<=i;k++)
         {
         System.out.print("* ");
         }
         System.out.print("\n");
        }
    }
}