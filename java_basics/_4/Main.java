package javabasics._4;

public class Main {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();

    }

    /**
     * 1: Store your age in an appropriate variable, print it out in
     *    one line using the "+" in your print statement. Only use 1 print statement
     */
    private static void exercise1() {
        System.out.println("Exercise 1: ");
        // Write your code here
        // defined age variable
        int  myAge = 25;
        // statement that prints the age stored in the variable myAge
        System.out.println("My age is " + myAge + ".");

    }

    /**
     * 2: Store your first name initial (i.e. Jane -> J) in a variable, your age in another variable.
     *
     *    And then print them out on the same line using the following idea
     *
     *    System.out.println("My Age=" + myAge +", my initial=" + myInitial);
     */
    private static void exercise2() {
        System.out.println("\nExercise 2:");
        //Write your code here
        // variable containing initial of my name
        char myInitial = 'c';
        //  variable containing my age
        int myAge = 25;
        //statement printing initial and age
        System.out.println("My Age = " + myAge +", my initial = " + myInitial);

    }

    /**
     * 3: Write comments above each line of code, describing what the line of code is doing
     */
    private static void exercise3() {
        //statement that prints n° of exercise
        System.out.println("\nExercise 3:");
        // boolean variable containing if lunch has been eaten
        boolean hasEatenLunch = false;
        // double variable containing the cost of lunch
        double lunchCost = 5.99;
        //statement printing lunch cost variable
        System.out.println("Lunch cost = " + lunchCost);
        //statement printing hasEatenLunch variable
        System.out.println("Has Eaten lunch = " + hasEatenLunch);
    }
}

