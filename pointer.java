import java.util.Scanner;
class pointer
{
    public static void main(String args[])
    {
        int a,b,*p,*q,c;
        System.out.print("enter two number :");
        Scanner r =new Scanner(System.in);
        a=r.nextInt();
        b=r.nextInt();
        *p=&a;
        *q=&b;
        c=*p+*q;
        System.out.print("sum of two number is ="+c);
    }
}