package _6;

import java.time.LocalDate;

public class Exercises {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
        exercise4();
        exercise5();
    }

    private enum YouCanUseClassLocalEnumsLikeThis {
        THIS_CAN_ONLY_BE_ACCESSED_IN_THIS_CLASS,
        THIS_TOO
    }

    /**
     * 1:
     * <p>
     * <p>
     * Create an enum called "Days" with the values "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY", "SUNDAY".
     * <p>
     * Loop over the values with Days.values() and print them out.
     */
    private static void exercise1() {
        System.out.println("\nExercise 1: ");
        // Your code here
        for (Days day : Days.values()) {
            System.out.println(day);

        }
    }

    private enum Days {

        MONDAY(false),
        TUESDAY(false),
        WEDNESDAY(false),
        THURSDAY(false),
        FRIDAY(false),
        SATURDAY(true),
        SUNDAY(true);
        final Boolean isWeekend;

        Days(Boolean isWeekend) {
            this.isWeekend = isWeekend;
        }
    }


    /**
     * 2:
     * <p>
     * <p>
     * Create an enum called "Seasons" with the values "SPRING", "SUMMER", "FALL", "WINTER".
     * <p>
     * Write a method that takes a Seasons value as input and returns the corresponding date range of months in that season.
     */
    private static void exercise2() {
        System.out.println("\nExercise 2: ");
        // Your code here
        System.out.println(returnDate(Seasons.FALL));
    }

    // method that based on the season enum value returns range of months in which the season last
    private static String returnDate(Seasons season) {
        switch (season) {
            case SPRING -> {
                return "21st March - 21st June";
            }
            case SUMMER -> {
                return "22nd June - 22nd September";
            }
            case FALL -> {
                return "23rd September - 22nd December";
            }
            case WINTER -> {
                return "23rd December - 20th March";
            }
            default -> {
                return "invalid season";
            }
        }
    }

    private enum Seasons {
        SPRING, SUMMER, FALL, WINTER;
    }

    /**
     * 3:
     * <p>
     * <p>
     * Create an enum called "TrafficLight" with the values "RED", "YELLOW", "GREEN".
     * <p>
     * Write code that simulates the behavior of a traffic light. It should take the current state of the traffic light as input and return the next state.
     */
    private static void exercise3() {
        System.out.println("\nExercise 3: ");
        // Your code here
        System.out.println(behavior(TrafficLight.RED));

    }

    // method that gets as a parameter an enum value and based on that value
    // returns another enum based on the logic of traffic light
    private static TrafficLight behavior(TrafficLight currentState) {
        switch (currentState) {
            case RED -> {
                return TrafficLight.GREEN;
            }
            case YELLOW -> {
                return TrafficLight.RED;
            }
            case GREEN -> {
                return TrafficLight.YELLOW;
            }

        }
        return null;


    }

    private enum TrafficLight {
        RED, YELLOW, GREEN
    }

    /**
     * 4:
     * <p>
     * Given the Days enum from exercise 1, add a local field called isWeekend and set it to true for the weekend days and false for the weekdays.
     * <p>
     * Write an if statement that prints weekend or weekday based on the enum
     */
    private static void exercise4() {
        System.out.println("\nExercise 4: ");
        // Your code here
        // variable that is set to a day
        Days currentDay = Days.SATURDAY;
        // if statement that checks if the field.isWeekend of that day is set to true or false and generate results
        // based on that
        if (currentDay.isWeekend) {
            System.out.println("It's weekend");
        } else {
            System.out.println("It's a weekday");
        }
    }

    /**
     * 5:
     * <p>
     * <p>
     * Create an enum called "Operator" with the values "ADD", "SUBTRACT", "MULTIPLY", "DIVIDE".
     * <p>
     * Write a method that takes two integers and an Operator value as input, performs the corresponding operation on the integers, and returns the result.
     */
    private static void exercise5() {
        System.out.println("\nExercise 5: ");
        // Your code here

        double num1 = 5;
        double num2 = 2;
        // calling the calculator method
        calculator((int) num1, (int) num2, Operator.ADD);
    }

    private static int calculator(int num1, int num2, Operator operator) {
        // switch statement that performs various operations based on the enum operator
        switch (operator) {
            case ADD -> {
                return num1 + num2;
            }
            case SUBTRACT -> {
                return num1 - num2;
            }
            case MULTIPLY -> {
                return num1 * num2;
            }
            case DIVIDE -> {
                return num1 / num2;
            }
        }
        return 0;
    }

    private enum Operator {
        ADD, SUBTRACT, MULTIPLY, DIVIDE;
    }

}
