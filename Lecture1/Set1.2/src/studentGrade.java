import java.util.Scanner;

public class studentGrade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Marks Boy: ");
        int marks = input.nextInt();

        if (marks>=90){
            System.out.println("grade A");
        } else if(marks>=75){
            System.out.println("grade B");
        } else if(marks>=60){
            System.out.println("grade C");
        } else if(marks>30){
            System.out.println("grade D");
        } else {
            System.out.println("grade F");
        }
    }
}
