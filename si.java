import java.util.Scanner;
class si
{
    public static void main(String args[])
    {
        int p,r,t;
        double simple;
        System.out.print("Enter price,rate and time :");
        Scanner q = new Scanner(System.in);
        p=q.nextInt();
        r=q.nextInt();
        t=q.nextInt();
        simple=(p*r*t/100);
        System.out.print("Simple intrest is ="+simple);
    

    }
}