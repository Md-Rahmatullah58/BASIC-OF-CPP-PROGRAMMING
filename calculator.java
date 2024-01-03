import java.util.Scanner;
class calculator
{
    public static void main(String args[])
    {
        int ch,d,a,b;
        System.out.print("Enter two number :");
        Scanner r = new Scanner(System.in);
        a= r.nextInt();
        b= r.nextInt();
        System.out.print("Enter the user choice number :");
        ch= r.nextInt();
        if(ch==1)
        {
            d=a+b;
            System.out.print("Addition :"+d);
        }
        else if(ch==2)
        {
            d=a-b;
            System.out.print("Subtraction :"+d);
        }
        else if(ch==3)
        {
            d=a*b;
            System.out.print("Multiplication :"+d);
        }
        else if(ch==4)
        {
            d=a/b;
            System.out.print("Division:"+d);
        }
        else if(ch==5)
        {
            d=a%b;
            System.out.print("reminder :"+d);
        }
        else
        {
        
            System.out.print("invalide user choice");
        }
    }
}