import java.util.Scanner;

public class Scanner_Assignment4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter height in cm: ");
        int height = input.nextInt();

        System.out.print("Enter age: ");
        int age = input.nextInt();

        System.out.print("Enter citizenship code (C/N): ");
        String citizenship = input.next();

        System.out.print("Enter recommendee code (R/N): ");
        String recommendee = input.next();

        if (recommendee.equalsIgnoreCase("R") ||
                (height >= 200 &&
                        age >= 21 && age <= 25 &&
                        citizenship.equalsIgnoreCase("C"))) {

            System.out.println("Accepted");
        } else {
            System.out.println("Rejected");
        }
    }
}