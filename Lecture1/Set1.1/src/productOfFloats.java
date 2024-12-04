import java.util.Scanner;

public class productOfFloats {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two Float Numbers: ");
        float x = in.nextFloat();
        float y = in.nextFloat();
        System.out.println("Product: "+(x*y));
    }
}
