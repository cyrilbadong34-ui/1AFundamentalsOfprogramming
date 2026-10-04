import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class BufferedReader_Assignment1 {
    public static void main(String[] args) {

        BufferedReader data = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Enter Year: ");
            int year = Integer.parseInt(data.readLine());

            if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)){
                System.out.println("Leap Year");
            }else{
                System.out.println("Not a Leap Year");
            }

        }catch (IOException e){
            System.err.println("Error reading input stream");
        }catch (NumberFormatException e){
            System.out.println("Invalid number format! Please enter digits only.");
        }

    }
}