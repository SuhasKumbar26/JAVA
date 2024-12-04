import java.util.Scanner;

public class swapTwoNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        System.out.println("Before Swapping: "+num1+" "+num2);
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("After Swapping: "+num1+" "+num2);
    }
}
