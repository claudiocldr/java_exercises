package javabasics._14;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
        exercise4();
        exercise5();
    }

    /**
     * 1a: Use a FOR EACH loop to the total sum all the elements of the ArrayList itemsA
     * 1b: Use a FOR EACH loop to the total sum all the elements of the int array itemsB
     * 1c: Use a FOR I loop to the total sum all the elements of the int ArrayList itemsA
     * <p>
     * Print your results
     * <p>
     * Notice how we can use the same exact code for arrays and ArrayLists
     */
    private static void exercise1() {
        System.out.println("Exercise 1a:");
        List<Integer> itemsA = Arrays.asList(1, 56, 23);

        int sumForA = 0;

        // Write your code for 1a here
        // for each loop iterating integers inside the list and adding them to the variable sumForA
        for (Integer number : itemsA) {
            sumForA += number;
        }
        System.out.println(sumForA);

        System.out.println("\nExercise 1b:");
        int[] itemsB = new int[]{1, 56, 23};

        int sumForB = 0;

        // Write your code for 1b here
//        for each loop iterating integers inside the array and adding them to the variable sumForA
        for (Integer number : itemsB){
            sumForB += number;
        }
        System.out.println(sumForB);
        System.out.println("\nExercise 1c:");

        int sumForC = 0;

        // Write your code for 1c here, refer back to the lesson to check the fori syntax
        // initializing loop using as a stopping condition i < itemsA.size()
        for (int i = 0; i < itemsA.size(); i++) {
            // adding element with index i to sumForC for each cycle
            sumForC += itemsA.get(i);
        }
        System.out.println(sumForC);

        if (sumForA != sumForB || sumForB != sumForC) {
            System.out.println("Failed, sums are different!");
        } else {
            System.out.println("Success, sums are the same!");
        }
    }

    /**
     * 2: Find the smallest and largest items in the arraylist
     * using a for each loop and an if statement/Math.min
     */
    private static void exercise2() {
        System.out.println("Exercise 2:");
        List<Integer> items = Arrays.asList(300, 23, 56, 55, 84);
        int minNumber = Integer.MAX_VALUE;
        int maxNumber = 0;

        // Write code here
        // for each loop using Math.max method
        for (Integer number : items) {
            maxNumber = Math.max(number, maxNumber);
            minNumber = Math.min(number, minNumber);
        }
        // printing maxNumber and minNumber derived from for each loop using Math.max and Math.min method
        System.out.println("Max number is " + maxNumber + " and min number is " +minNumber);
        // for each loop using if statement
        for (Integer number : items) {
            if (number >= maxNumber) {
                maxNumber = number;
            } else {}
            if (number <= minNumber) {
                minNumber = number;
            }

        }
        // printing maxNumber and minNumber derived from for each loop using if statement
        System.out.println("Max number is " + maxNumber + " and min number is " +minNumber);
    }

    // 3: Edit the fori loop below so it only prints the first 2 names.

    private static void exercise3() {
        System.out.println("Exercise 3:");
        List<String> names = Arrays.asList("Alan", "Alice", "Antonio", "Aziz");

        for (
                int index = 0;
                index < names.size() - 2; // <---- Edit this line
                index = index + 1
        ) {
            System.out.println(names.get(index));
        }
    }

    /**
     * 4: Edit the fori loop below so it prints the 8 multiplication table
     * <p>
     * Bonus, how could we use a single variable to change our times table?
     * <p>
     * Multiplication tables, in case my vocabulary is different:
     * <a href="https://i.pinimg.com/originals/e0/ca/5f/e0ca5f21a16a02edbba8b758e7aa4af5.jpg">
     *      https://i.pinimg.com/originals/e0/ca/5f/e0ca5f21a16a02edbba8b758e7aa4af5.jpg
     * </a>
     */
    private static void exercise4() {
        System.out.println("Exercise 4:");
        System.out.println("La tabellina dell'8 è: ");
        // I've rewritten completely the for cycle in order to work in 2 lines with printing included
        for (int number = 1; number <= 10; number++)
        {
            int timesTableCurrentValue = 8 * number;
            System.out.println("8 x " + number + " = " +timesTableCurrentValue);

        }
    }

    /**
     * 5: BONUS! This is an optional task, but it is recommended you complete it
     * -------------------------------------------------------------------------<br/>
     * Inside of the fori loop below, write another fori loop to complete all
     * the multiplication tables between 1-10.
     *
     * i.e. 5  = 5,10,15,20,25,30,35,40,45,50
     *
     * When a loop in inside a loop, we call this a nested loop
     */
    private static void exercise5() {
        System.out.println("Exercise 5:");
        // first loop that iterates the numbers I'm gonna multiply
        for (int timesTableNumber = 1; timesTableNumber <= 10; timesTableNumber++) {
            // descriptive print statements
            System.out.println("");
            System.out.println("La tabellina del " + timesTableNumber + " è:");
            // loop inside the 1° loop that iterates the multiplier
            for (int startingNumber = 1; startingNumber <= 10; startingNumber++) {
                System.out.print(timesTableNumber * startingNumber +",");
            }
        }
    }
}
