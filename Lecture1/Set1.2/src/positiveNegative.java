import java.util.Scanner;

public class positiveNegative {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        float num = input.nextFloat();
        if (num>0){
            System.out.println("Positive");
        } else if (num<0) {
            System.out.println("Negative");
        }
        else System.out.println("Zero ");
    }
}
