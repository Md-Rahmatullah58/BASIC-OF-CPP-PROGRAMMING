import java.util.Scanner;
class fibonacii
{
    public static void main(String args[])
    {
        int i, n,a=0,b=1,c=2,d;//tribonacci series also here ok!! and fibonaci seriese!!
        System.out.print("Enter number :");
        Scanner r=new Scanner(System.in);
        n=r.nextInt();
        for(i=1;i<=n;i++)
        {
            System.out.print(a+" ");
            d=a+b+c;
            a=b;
            b=c;
            c=d;
        }
    }
}