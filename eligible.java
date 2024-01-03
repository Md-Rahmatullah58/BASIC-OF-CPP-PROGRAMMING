import java.util.Scanner;
class eligible
{
    public static void main(String args[])
    {
        int age;
        System.out.print("Enter your age :");
        Scanner r=new Scanner(System.in);
        age=r.nextInt();
        if(age>=18)
        {
            System.out.print("eligible for vote");
        }
        else
        {
            System.out.print("Not eligible for vote");
        }
    }
}