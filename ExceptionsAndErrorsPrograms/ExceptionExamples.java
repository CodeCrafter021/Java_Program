package ExceptionsAndErrorsPrograms;

public class ExceptionExamples {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;
            System.out.println(result);
        } catch (ArithmeticException exception) {
            System.out.println("Runtime exception: " + exception.getMessage());
        }
        try {
            Integer.parseInt("not a number");
        } catch (NumberFormatException exception) {
            System.out.println("Unchecked exception: " + exception.getClass().getSimpleName());
        }
        try {
            throw new Exception("Checked exception example");
        } catch (Exception exception) {
            System.out.println("Checked exception: " + exception.getMessage());
        }
        try {
            throw new IllegalArgumentException("Multiple exceptions example");
        } catch (ArithmeticException | IllegalArgumentException exception) {
            System.out.println("Handled: " + exception.getClass().getSimpleName());
        }
        System.out.println("Hierarchy: " + RuntimeException.class.getSuperclass().getSimpleName());
        System.out.println("Error types: " + Error.class.getSuperclass().getSimpleName());
    }
}