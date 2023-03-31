package javabasics._5;

public class Main {
    // Don't forget to use comments to clear things up if you need them!
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
        exercise4Bonus();
        exercise5Bonus();
        playAroundWithModulus();
    }

    /*
            Remember the symbols you need to do maths are

            Plus = +
            Minus = -
            Multiply or times = *
            Divide = /
     */

    /**
     * 1: Create an int variable, add 1 to the value and then print it. Use the + operator
     * Then minus 1 from the same variable and print it.
     */
    private static void exercise1() {
        System.out.println("Exercise 1:");
        // Write your code here
        // declaring integer variable;
        int number_exercise1 = 0;
        // incrementing variable by 1;
        number_exercise1 += 1;
        //printing incremented variable
        System.out.println(number_exercise1);
        // decrementing variable by 1
        number_exercise1 -=1;
        // printing decremented variable
        System.out.println(number_exercise1);
    }

    /**
     * 2: Create a double variable, times by 2 and then print it.
     * <p>
     * Create another double variable, which is the previous variable divided by 2
     * and then print it
     */
    private static void exercise2() {
        System.out.println("\nExercise 2:");
        // Write your code here
        // declaring variable times 2;
        double number_exercise2_1 = 1 * 2;
        // printing variable times 2;
        System.out.println(number_exercise2_1);
        // declaring variable which is number_exercise2_1 / 2;
        double number_exercise2_2 = number_exercise2_1 / 2;
        // printing variable declared in the previous line;
        System.out.println(number_exercise2_2);


    }

    /**
     * 3: We are going to convert the temperature from celsius to fahrenheit
     * <p>
     * Create a double variable called celsius
     * <p>
     * Create a new variable called fahrenheit
     * <p>
     * The variable fahrenheit should be set as
     * celsius times by 1.8 plus 32
     * <p>
     * Print out celsius and fahrenheit with 2 print statements
     */
    private static void exercise3() {
        System.out.println("\nExercise 3:");
        // Write your code here
        // declaring variable which is in celsius degrees
        double celsius = 1;
        // declaring variable which is celsius converted to fahrenheit
        double fahrenheit = (celsius * 1.8) + 32;
        // printing temperature in celsius
        System.out.println("this is the temperature in celsius: " + celsius);
        // printing temperature in fahrenheit
        System.out.println("this is the temperature in fahrenheit: " + fahrenheit);
    }

    /**
     * 4: BONUS! This is an optional task, but it is recommended you complete it
     * ----------------------------------------------------------------------
     * Create an int called age with a starting value of 10.
     * <p>
     * Only using the '++' operator increase this value to 15
     */
    private static void exercise4Bonus() {
        System.out.println("\nExercise 4:");
        // Write your code here
        //declaring age variable
        int age = 10;
        //incrementing age variable 5 times by 1
        age++;
        age++;
        age++;
        age++;
        age++;
        //printing age variable to see if it's correct
        System.out.println(age);
    }

    /**
     * 5: BONUS! This is an optional task, but it is recommended you complete it
     * ----------------------------------------------------------------------
     * Create an int called age set as 50
     * <p>
     * Using the -= operator change this value from 50 to 0 in one line of code,
     * <p>
     * Underneath create another int called secondAge set as 50
     * <p>
     * Change this value from 50 to 0 in 3 lines of code
     */
    private static void exercise5Bonus() {
        System.out.println("\nExercise 5:");
        // Write your code here
        // declaring age variable as 50
        int age = 50;
        // decrementing age variable by age value
        age -= age;
        // printing final age value to check result
        System.out.println(age);
        // declaring secondAge variable as 50;
        int secondAge = 50;
        // decrementing in 3 lines secondAge to reach 0
        secondAge -= 1;
        secondAge -= 1;
        secondAge -= secondAge;
        // printing final secondAge value to check result
        System.out.println(secondAge);
    }

    /**
     * This is completely optional, but if you guys want to play around with
     * modulus to get a better understanding. Simply change the code below
     */
    private static void playAroundWithModulus() {
        System.out.println("\nModulus testing!:");

        int value = 5;   // <--- change this value
        int modulus = 4; // <--- and this value to see the results of modulus
        // the modulus operator gives the remainder of the division, for example
        // 5 % 4 will give 1, because 5 / 4 will give 1 with the reminder of 1

        System.out.println("Modulus calculation, " + value + " % " + modulus +
                "=" + value % modulus);
    }

}
