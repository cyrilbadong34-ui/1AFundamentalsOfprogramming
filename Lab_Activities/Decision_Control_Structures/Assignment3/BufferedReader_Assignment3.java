import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BufferedReader_Assignment3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter NSAT Score: ");
        double nsatScore = Double.parseDouble(reader.readLine());

        System.out.print("Enter Parents' Monthly Salary: ");
        double parentsSalary = Double.parseDouble(reader.readLine());

        System.out.print("Enter Entrance Exam Score: ");
        double entranceScore = Double.parseDouble(reader.readLine());

        String status;
        if (parentsSalary > 10000 || nsatScore < 90 || entranceScore < 85) {
            status = "Rejected";
        } else if (parentsSalary <= 3500 && ((nsatScore + entranceScore) / 2.0) >= 91) {
            status = "Accepted";
        } else {
            status = "For Further Study";
        }

        System.out.println("\n--- Evaluation Result ---");
        System.out.println("Application Status: " + status);
    }
}