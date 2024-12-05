import java.util.Scanner;

public class bitwiseOperator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        System.out.println("And& : "+(num1&num2));
        System.out.println("Or| : "+(num1|num2));
        System.out.println("Xor^ : "+(num1^num2));
        System.out.println("lShift : "+(num1<<1));
        System.out.println("rShift : "+(num1>>1));
    }
}
