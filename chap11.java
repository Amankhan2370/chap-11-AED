import java.util.Scanner;

public class chap11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter an integer: ");
            int number = Integer.parseInt(scanner.nextLine());
            System.out.println("You entered: " + number);

            System.out.print("Enter a decimal number: ");
            double decimal = Double.parseDouble(scanner.nextLine());
            System.out.println("You entered: " + decimal);

        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid input. Please enter the correct number format.");
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            scanner.close();
            System.out.println("Program finished.");
        }
    }
}
