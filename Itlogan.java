
import java.util.Scanner;

public class Itlogan {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dozen = 0;
        double loose = 0;
        System.out.println("----- Hit any key to start.");
        String bleh = sc.nextLine();
        System.out.println(
                "============================== \n"
                + " Welcome to Dizon Dairy Farms \n"
                + "============================== \n");
        System.out.print("Enter number of eggs: ");
        int egg = Integer.valueOf(sc.nextLine());
        if (egg < 0) {
            System.out.println("Invalid input. Please enter a non-negative number of eggs.");
        } else {
            System.out.println("==============================");
            System.out.println("You ordered " + egg + " eggs");
            while (egg >= 12) {
                dozen += 1;
                egg -= 12;
            }
            loose = egg;

            double price = (dozen * 36) + (loose * 4.75);
            System.out.println("No. of dozen: " + dozen + " at Php 36.00 per dozen\n"
                    + "No. of loose eggs: " + egg + " at Php 4.75 each.\n"
                    + "==============================\n");
            System.out.printf("Your Total Amount Due is: %,.2f\n", price);
            System.out.println("==============================");

        }
    }
}
