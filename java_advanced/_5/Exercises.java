package _5;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Exercises {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
        exercise4();
    }

    /**
     * 1: Uncomment the Files.createFile() line below and write a try catch block that
     * prints it's stack trace
     */
    private static void exercise1() {
        System.out.println("Exercise 1: ");
        // Your code here
        try {
            Files.createFile(Path.of("Test.txt"));
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }


    /**
     * 2:
     * <p>
     * Write a try-catch block that attempts to open a file
     * <p>
     * In the catch block, print a message that informs the user that the file could not be found.
     */
    private static void exercise2() {
        System.out.println("\nExercise 2: ");
        // Your code here

        String userInputFileName = "test-file.txt";
        try {
            Files.readString(Paths.get(userInputFileName));
        } catch (Exception exception) {
            System.out.println("the file could not be found ");
        }
    }

    /**
     * 3:
     * <p>
     * Write a try-catch block that attempts to parse a string as an integer.
     * <p>
     * In the catch block, print a message that informs the user that the input was not a valid integer.
     */
    private static void exercise3() {
        System.out.println("\nExercise 3: ");
        // Your code here

        try {
            Integer.parseInt("house");
        } catch (NumberFormatException exception) {
            System.out.println("the input was not a valid integer");
        }
    }

    /**
     * 4:
     * <p>
     * Write a try block that around this print statement that attempts to divide 2 numbers
     * <p>
     * Create multiple catch blocks that catch different types of exceptions, such as NumberFormatException and DivideByZeroException.
     * <p>
     * In each catch block, print a message that informs the user of the specific exception that was caught and why it occurred.
     */
    private static void exercise4() {
        System.out.println("\nExercise 4: ");
        // Your code here
        Double num1 = 10.0;
        String num2AsString = "0.0";
        // non capisco perchè non viene lanciato il sout nel blocco di dell'eccezione
        // pur dividendo un numero per 0
        try {
            System.out.println(num1 / Double.parseDouble(num2AsString));
        } catch (ArithmeticException exception) {
            System.out.println("can't divide a number by 0");
        } catch (NumberFormatException exception) {
            System.out.println("can't convert a string without proper formatting to a numeric type");
        }


    }
}
