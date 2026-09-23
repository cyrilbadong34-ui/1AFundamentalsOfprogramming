import java.io.*;

public class fifthJava {
    public static void main(String[] args) {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Enter your age: ");
            String ageInput = dataIn.readLine();
            int age = Integer.parseInt(ageInput);

            System.out.print("Enter your exact height in meters:");
            String heightinput = dataIn.readLine();
            int height = Integer.parseInt(heightinput);
            System.out.println("You are " + age + " years old and " + height + "m tall.");

        } catch (IOException e) {
            System.err.println("Error reading input stream.");
        } catch (NumberFormatException e) {
            System.err.println("Invalid number format! Please enter digits only.");

        }
    }}