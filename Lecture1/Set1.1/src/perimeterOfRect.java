import java.util.Scanner;

public class perimeterOfRect {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Sides of the rectangle: ");
        float s1 = in.nextFloat();
        float s2 = in.nextFloat();
        float s3 = in.nextFloat();
        float s4 = in.nextFloat();
        System.out.println("Perimeter of RectAngle is: "+(s1+s2+s3+s4));
    }
}
