/** Custom checked exception raised for an invalid voting age. */
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class CustomExceptionDemo {
    static void checkVotingAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be at least 18 to vote.");
        }
        System.out.println("Eligible to vote.");
    }

    public static void main(String[] args) {
        int age = 16;
        try {
            checkVotingAge(age);
        } catch (InvalidAgeException exception) {
            System.out.println("Not eligible: " + exception.getMessage());
        }
    }
}
