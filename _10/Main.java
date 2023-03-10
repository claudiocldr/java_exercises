
package javabasics._10;

public class Main {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
        exercise4Bonus();
    }

    /**
     * AND = &&
     * OR = ||
     * XOR = ^
     */

    /**
     * 1: Using an if statement, print: "Comfortable clothes" if the following conditions are met:
     *
     *    isWarm is true and wearingShorts is true
     *    isWarm is false and wearingShorts is false
     *
     *    If these conditions are not met, print: "Uncomfortable clothes"
     */
    private static void exercise1() {
        System.out.println("\nExercise 1 - Comfortable clothes:");

        double temperatureInCelsius = 25;
        double isWarmTemperatureInCelsius = 20;
        boolean isWarm = temperatureInCelsius >= isWarmTemperatureInCelsius;
        boolean wearingShorts = true;

        // Write your code here
        // the exercise is confusing because he asks that the following conditions are met
        // but it is impossible have simultaneously the same boolean with two different values so I've put an || operator
        if ((isWarm && wearingShorts) || (!isWarm && !wearingShorts))
        { System.out.println("Comfortable clothes");}
        else { System.out.println ("Uncomfortable clothes");}
    }

    /**
     * 2: We are going to automate the club bouncer, write a condition with an if statement with the && (and)
     *    to check if someone is able to enter the club.
     *
     *    Their shoeType must be "fancy" AND they must be over 18 AND they must have at least 10 euros in their pocket
     *
     *    Write 1 if statement that checks all of these, print "Come in" if they meet the condition
     *    or "stay out" if they don't.
     */
    private static void exercise2() {
        System.out.println("\nExercise 2 - Club Bouncer:");
        String shoeType = "fancy";



        int age = 30;
        double eurosInPocket = 7.5;
        double eurosForEntry = 10;

        // Write your code here
        // I've put the second and third condition between parenthesis in order to be evaluated as one
        // so the first condition will be evaluated with just one boolean value
        if(shoeType.equals("fancy") && (age >= 18 && eurosInPocket >= eurosForEntry))
        {
            System.out.println("Come in");} else {
            System.out.println("stay out");}
    }

    /**
     * 3: Write an if else statement to calculate our grade
     *
     *    If our grade is 90%+ of the total, we print "A"
     *    If our grade is 80%+ of the total, we print "B"
     *    If our grade is 70%+ of the total, we print "C"
     *    If our grade is 60%+ of the total, we print "D"
     *    If our grade is under 60% of the total, we print "F"
     *
     *    If 'isTestRetry' we cap the maximum grade at C
     *
     *    Remember was can use ! to invert the value of a boolean, i.e. true -> false
     */
    private static void exercise3() {
        System.out.println("\nExercise 3 - Test Grader:");
        double ourTestScore = 8;
        double maxTestScore = 10;
        boolean isTestRetry = true;
        //Write your code here
        // double variable which indicates the percentage score
        double percentageScore = ourTestScore / maxTestScore;
        // if statement to decide the corresponding mark based on the percentage score
        if (percentageScore <= 0.59 ) {
            System.out.println("F");
        } else if (percentageScore >= 0.60 && percentageScore < 0.70)
        {System.out.println("D");}
        else if (percentageScore >= 0.70 && percentageScore < 0.80)
        {System.out.println("C");}
        // adding the check on the boolean isTestRetry in order to check if the test is retried or not
        else if ((percentageScore >= 0.80 && percentageScore < 0.90) && isTestRetry == false)
        {System.out.println("B");}
        else if (percentageScore >= 0.90 && isTestRetry == false)
        {System.out.println("A");}
        else {System.out.println("C");}



    }


    /**
     * 4: BONUS! This is an optional task, but it is recommended you complete it
     * ---------------------------------------------------------------------------------
     *    Write a XOR condition, print "safe" if only one car is driving down the road,
     *    print "CRASH! or No cars" if not.
     *
     *    XOR = ^
     */
    private static void exercise4Bonus() {
        System.out.println("\nExercise 4 (Optional) - One way road:");
        boolean carIsDrivingFromLeftToRight = true;
        boolean carIsDrivingFromRightToLeft = false;

        //Write your code here
        // using the XOR operator to check that only one condition between the two must be true
        if (carIsDrivingFromLeftToRight ^ carIsDrivingFromRightToLeft) {
            System.out.println("safe");
        } else { System.out.println("CRASH!"); }
    }
}
