import java.util.Scanner;

/** Demonstrates try, catch, and finally for division input. */
public class ExceptionHandlingDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.print("Enter numerator: ");
            int numerator = Integer.parseInt(input.nextLine());
            System.out.print("Enter denominator: ");
            int denominator = Integer.parseInt(input.nextLine());
            System.out.println("Result: " + (numerator / denominator));
        } catch (NumberFormatException exception) {
            System.out.println("Please enter whole numbers.");
        } catch (ArithmeticException exception) {
            System.out.println("Cannot divide by zero.");
        } finally {
            input.close();
            System.out.println("Calculation finished.");
        }
    }
}
