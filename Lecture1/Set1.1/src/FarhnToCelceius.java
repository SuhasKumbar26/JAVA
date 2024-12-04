import java.util.Scanner;

public class FarhnToCelceius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter FarhnHeat value : ");
        float farhnHeat = input.nextFloat();
        double Celcieus = (farhnHeat-32)*5/9;
        System.out.println("Celceius value: "+Celcieus);

    }
}
