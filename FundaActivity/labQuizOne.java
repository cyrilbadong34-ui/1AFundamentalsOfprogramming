import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class labQuizOne {
    public static void main(String[] args) {

        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Enter Your Birth Year:");
            String yearInput = dataIn.readLine();
            int year = Integer.parseInt(yearInput);
            int lastyear = 2026-year;

            System.out.println("You were born last " +year);
            System.out.println("You are now "+lastyear);


        } catch (IOException e) {
            System.err.print("Error reading input stream.");
        } catch (NumberFormatException e) {

            System.err.println("Invalid number format! Please enter digits only.");}
    }

}