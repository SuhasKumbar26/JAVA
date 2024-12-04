import java.util.Scanner;

public class arthamaticOptr {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Two numbers: ");
        int x = input.nextInt();
        int y = input.nextInt();

        System.out.println("Addition: "+(x + y));
        System.out.println("Subtraction: "+(x - y));
        System.out.println("Division: "+(x / y));
        System.out.println("Multiplication: "+(x * y));
        System.out.println("Modulo: "+(x % y));
    }
}
