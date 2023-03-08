package javabasics._6;

public class Main {
    // Don't forget to use comments to clear things up if you need them!
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
        exercise4Bonus();
    }

    /**
     * 1: Create a double variable called value, create another double variable called valueSquareRoot
     *
     *    Use Math.sqrt to find the square root of value and assign it to valueSquareRoot
     */
    private static void exercise1() {
        System.out.println("Exercise 1:");
        // Write your code here
        // declaring value variable
        double value = 25;
        // declaring valueSquareRoot to which I assigned the square root of the value variable
        double valueSquareRoot = Math.sqrt(value);
        // printing valueSquareRoot to test
        System.out.println("the square root of " + value + " is " + valueSquareRoot);

    }

    /**
     * 2: See the code below
     *
     *    Print out the highest value using Math.max()
     *
     *    Then print out the lowest value using Math.min()
     *
     *    You must put your variables into these methods and separate them with a comma
     */
    private static void exercise2() {
        System.out.println("\nExercise 2:");
        int valueA = 5;
        int valueB = 10;
        // printing max value between the two variables using Math.max method
        System.out.println("Max = " + Math.max(valueA, valueB));
        // printing min value between the two variables using Math.min method
        System.out.println("Min = " + Math.min(valueA, valueB));

        // Write your code here
        // I'm writing the code above because I'll put the math method in the print statement - Claudio
    }

    /**
     * 3: Use Modulus (%) to calculate the remaining amount of money if we buy as many burgers as possible, print remainder
     */
    private static void exercise3() {
        System.out.println("\nExercise 3:");

        int totalMoney = 50;
        int costPerBurger = 9;
        // Write your code here
        // using the modulo operator to get the reminder of totalMoney / costPerBurger
        int remainingMoney = totalMoney % costPerBurger;
        // printing the remainder
        System.out.println("Remainder = " + remainingMoney);
    }

    /**
     * 4: BONUS! This is an optional task, but it is recommended you complete it
     * ----------------------------------------------------------------------
     * I've chosen loads of methods from the Math Library, write comments above each line to guess what they do!
     *
     * You do not need to write any code
     *
     * Answers can be found in resources
     */
    private static void exercise4Bonus() {
        System.out.println("\nExercise 4 (Bonus!):");

        double ourValue = 4.5;

        // Math.ceil returns the value of ourValue rounded up to its nearest integer
        System.out.println(ourValue + " after using ceiling=" + Math.ceil(ourValue));
        // Math.floor returns the value of ourValue rounded down to its nearest integer
        System.out.println(ourValue + " after using floor=" + Math.floor(ourValue));
        // Math.round returns the value of ourValue rounded to its nearest integer
        System.out.println(ourValue + " after using round=" + Math.round(ourValue));
        // Math.pow returns the value of ourValue to the power of 2
        System.out.println(ourValue + " after using powerOf with the value of 2=" + Math.pow(ourValue, 2));
        // Math.pow returns the value of ourValue to the power of 3
        System.out.println(ourValue + " after using powerOf with the value of 3=" + Math.pow(ourValue, 3));
        // Math.random returns a random number between 0 and ourValue
        System.out.println(ourValue + " times random =" + Math.random() * ourValue);
    }
}