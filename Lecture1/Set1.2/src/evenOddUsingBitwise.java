import java.util.Scanner;

public class evenOddUsingBitwise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter one number: ");
        int num1 = input.nextInt();

        if((num1&1)==0){
            System.out.println("Even");
        } else System.out.println("Odd");
    }
}
