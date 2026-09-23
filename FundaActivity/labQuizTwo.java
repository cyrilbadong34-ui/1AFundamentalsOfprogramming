import java.util.Scanner;
public class labQuizTwo {
    public static void main(String[] args) {

        String name;
        int amount;
        double ss;
        double vin;
        double kilo;

        Scanner inputDevice = new Scanner(System.in);

        System.out.println("Welcome To Adobo Cooking Show");
        System.out.print("Enter Your Name: ");
        name = inputDevice.nextLine();

        System.out.print("How many Kilo of pork will you cook? ");
        kilo = inputDevice.nextDouble();

        double ans1 = kilo * 0.5;
        double ans2 = kilo * 0.33;

        System.out.println("The ratio of soy sauce for " + kilo + "kg is = " + ans1);
        System.out.println("The ratio of vinegar for " + kilo + "kg is = " + ans2);



    }
}