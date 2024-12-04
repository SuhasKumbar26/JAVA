import java.util.Scanner;

public class SumOfTwoNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first Number: ");
        int num1 = in.nextInt();
        System.out.print("Second number: ");
        int num2 = in.nextInt();
        System.out.println("Sum of Two number is: "+(num1+num2));
    }
}
