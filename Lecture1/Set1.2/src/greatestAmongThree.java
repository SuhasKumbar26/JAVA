import java.util.Scanner;

public class greatestAmongThree {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

        if(num1>num2){
            System.out.println("Num1 is greater: "+num1);
        } else if (num2 > num3) {
            System.out.println("Num2 is greater: "+num2);
        } else System.out.println("Num3 is greater: "+num3);
    }
}
