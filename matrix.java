import java.util.Scanner;
class matrix
{
    public static void main(String args[])
    {
        int a[][] = new int[2][2];
        int b[][] = new int[2][2];
        int i,j;
        int sum[][] = new int[2][2];
        Scanner r=new Scanner(System.in);
        System.out.print("Enter First Matrix element :");
        for(i=0;i<2;i++)
        {
            for(j=0;j<2;j++)
            {
                a[i][j]=r.nextInt();
            }
        }
        System.out.print("\nFirst Matrix elements :\n");
        for(i=0;i<2;i++)
        {
            for(j=0;j<2;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.print("\n");
        }
        System.out.print("Enter second matrix elemnts array :");
        for(i=0;i<2;i++)
        {
            for(j=0;j<2;j++)
            {
                b[i][j]=r.nextInt();
            }
        }
        System.out.print("\nSecond matrix elements:\n");
        for(i=0;i<2;i++)
        {
            for(j=0;j<2;j++)
            {
                System.out.print(b[i][j]+" ");
            }
            System.out.print("\n");
        }
        for(i=0;i<2;i++)
        {
            for(j=0;j<2;j++)
            {
                sum[i][j]=a[i][j]+b[i][j];
            }
        }
        System.out.print("\nSum of two Matrix is =>\n");
        for(i=0;i<2;i++)
        {
            for(j=0;j<2;j++)
            {
                System.out.print(sum[i][j]+" ");
            }
            System.out.print("\n");
        }
    }  
}