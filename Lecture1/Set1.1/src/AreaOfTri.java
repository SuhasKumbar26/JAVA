import java.util.Scanner;

public class AreaOfTri {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Breadth and height of triangle: ");
        float breadth = in.nextFloat();
        float height = in.nextFloat();
        double Area = 0.5*(breadth)*(height);
        System.out.println("Area of triangle is: "+Area);
    }
}
