import java.util.Scanner;

public class simpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter P T R : ");
        float p = input.nextFloat();
        float t = input.nextFloat();
        float r = input.nextFloat();
        double interest = (p*t*r)/100;
        System.out.println("Simple interest: "+interest);
    }
}
