import java.util.Scanner;

public class compoundInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter P T R : ");
        float p = input.nextFloat();
        float t = input.nextFloat();
        float r = input.nextFloat();
        double CompoundInterest = p*(1+r/100)*t;
        System.out.println("Simple Compound Interest: "+CompoundInterest);
    }
}
