import java.util.Scanner;

/** Demonstrates variables, input, decisions, loops, and arrays. */
public class ProgrammingConstructs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer score from 0 to 100: ");
        int score = input.nextInt();

        if (score < 0 || score > 100) {
            System.out.println("Score is outside the valid range.");
        } else {
            String grade;
            switch (score / 10) {
                case 10:
                case 9: grade = "A"; break;
                case 8: grade = "B"; break;
                case 7: grade = "C"; break;
                case 6: grade = "D"; break;
                default: grade = "F";
            }
            System.out.println("Grade: " + grade);
        }

        int[] values = {4, 7, 2, 9, 5};
        int total = 0;
        for (int value : values) {
            total += value;
        }
        double average = (double) total / values.length;
        System.out.printf("Array average: %.2f%n", average);
        input.close();
    }
}
