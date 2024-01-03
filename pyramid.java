import java.util.Scanner;
class pyramid 
{
    public static void main(String args[])
    {
        int n,i,j,k;
        System.out.print("Enter the number :");
        Scanner r=new Scanner(System.in);
        n=r.nextInt();
        for(i=1;i<=n;i++)
        {
         for(j=1;j<i;j++)
         {
            System.out.print(" ");//duoble space is triangle and single for pyramid okk!!
         }
         for(k=i;k<=n;k++)
         {
         System.out.print("* ");
         }
         System.out.print("\n");
        }
    }
}
