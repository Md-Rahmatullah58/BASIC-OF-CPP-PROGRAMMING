import java.util.Scanner;
 public  class Area {
    public static void main(String args[]) {
        
        float r;
        // double area;
        float area;
        System.out.print("Enter radius of a circle :");
        Scanner rk= new Scanner(System.in);
        r= rk.nextFloat();
        area=3.14f*r*r;//f for making float value
        System.out.println("Area of a circle is :"+area);
    }
}
