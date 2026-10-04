import java.util.Scanner;

public class Scanner_Assignment3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter NSAT Score: ");
        double nsatScore = scanner.nextDouble();

        System.out.print("Enter Parents' Monthly Salary: ");
        double parentsSalary = scanner.nextDouble();

        System.out.print("Enter Entrance Exam Score: ");
        double entranceScore = scanner.nextDouble();

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

        scanner.close();
    }
}