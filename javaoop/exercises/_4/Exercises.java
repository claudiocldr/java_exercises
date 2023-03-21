package javabasics.javaoop.exercises._4;

import java.util.Random;

public class Exercises {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
        exercise4();
    }

    /**
     * 1: Create variables with the MINIMUM POSSIBLE scope for currentCount and totalCount (both ints)
     */
    // In questo esercizio, nella classe ExerciseLunch ci sono numerosi metodi setter che hanno come scope private
    // non li ho corretti semplicemente perchè non influiscono sull'andamento del programma e non è richiesto correggerli
    // dalla consegna dell'esercizio.
    public static void exercise1() {
        System.out.println("Exercise 1:");
        int totalCount = 0;
        for (int i = 0; i < 100; i++) { int luckyRolls = 0;

            while (rollD6() == 6) {
                luckyRolls++;
            }
            totalCount += luckyRolls;
            luckyRolls = 0;
        }

        System.out.println(totalCount);
    }

    private static final Random random = new Random();

    private static int rollD6() {
        return random.nextInt(6) + 1;
    }

    /**
     * 2a: Change the scope modifiers (also known as access modifiers) in the class ExerciseLunch so no errors appear below,
     * <p>
     * 2b: Now change these modifiers to the MINIMUM possible scope, to have no errors
     */
    static void exercise2() {
        System.out.println("\nExercise 2:");
        ExerciseLunch exerciseLunch = new ExerciseLunch(3.4, "Tuesday");
        exerciseLunch.setLunchWeightInGrams(500);
        System.out.println("Lunch on " + exerciseLunch.getNameOfDayEaten() + " cost " + exerciseLunch.getPrice());
    }

    /**
     * 3: Edit this method and Exercise Lunch to fix the errors in the method below
     *
     *    Only make edits that remove or add the words, static or final
     */
    static public void exercise3() {
        ExerciseLunch exerciseLunch = null;
        exerciseLunch = new ExerciseLunch(3.4, "Tuesday");
        ExerciseLunch.printMaxPrice();
    }

    /**
     * 4: Add constants to the function below for relevant values,
     *    make sure they are static and final
     *    and can be accessed anywhere in this class, but nowhere else.
     *    use SNAKE_CASE naming
     */
    //creating constants for max weeks, days and hours
    private static final int MAX_WEEKS = 52;
    private static final int MAX_DAYS = 7;
    private static final int MAX_HOURS = 24;

    public static void exercise4() {
        System.out.println("\nExercise 4:");

        for (int week = 0; week < MAX_WEEKS; week++) {
            for (int day = 0; day < MAX_DAYS; day++) {
                for (int hour = 0; hour < MAX_HOURS; hour++) {
                    System.out.println("Week " + week +", day " + day +", hour " + hour);
                }
            }
        }
    }
}
