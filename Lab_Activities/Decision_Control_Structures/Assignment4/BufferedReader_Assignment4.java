import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BufferedReader_Assignment4 {
    public static void main(String[] args) throws IOException {

        BufferedReader b = new BufferedReader(
                new InputStreamReader(System.in)
        );

        System.out.print("Enter height in cm: ");
        int height = Integer.parseInt(b.readLine());

        System.out.print("Enter age: ");
        int age = Integer.parseInt(b.readLine());

        System.out.print("Enter citizenship code (C/N): ");
        String citizenship = b.readLine();

        System.out.print("Enter recommendee code (R/N): ");
        String recommendee = b.readLine();

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