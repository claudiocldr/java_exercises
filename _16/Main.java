package javabasics._16;


import java.util.Arrays;
import java.util.List;

import static java.lang.Character.isDigit;

public class Main {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }

    /**
     * 1: Take the code below and put it into a function, read the code and see what it is.
     * <p>
     * What do you think the function does? Name the function appropriately and make sure
     * <p>
     * return the appropriate result type
     */
//    private static void exercise1() {
//        System.out.println("Exercise 1:");
//        // Put this into a function
//        double Celsius = 30;
//        double Fahrenheit = ((celsius * 9) / 5) + 32;
//        String conversionDescription = celsius + " Celsius is " + fahrenheit + " fahrenheit";
//        // End
//        System.out.println(conversionDescription);
//
//    }

    // Rewriting exercise1 as the exercise request
    // and calling the function CelsiusConverterFahrenheit inside of it - Claudio
    private static void exercise1() {
        System.out.println("Exercise 1:");
        System.out.println(CelsiusConverterFahrenheit(30));
    }

    // creating function to convert Celsius into Fahrenheit - Claudio
    private static String CelsiusConverterFahrenheit(double cel) {
        double fahrenheit = ((cel * 9) / 5) + 32;
        // returning converted value - Claudio
        return cel + " Celsius is " + fahrenheit + " fahrenheit";
    }


    /**
     * 2: Create a function that processes and prints out all the names in the ArrayList
     * <p>
     * Make sure to put all the formatting code in the function, formatting:
     * 1) to Upper case
     * 2) Remove spaces at the start and the end
     * 3) If the name contains any numbers, instead of returning the name, return "Invalid"
     */
    private static void exercise2() {
        System.out.println("\nExercise 2:");
        List<String> names = Arrays.asList("Alan   ", "Alice   ", "Ant0ni0   ", "  Aziz");


        for (String name : names) {
            // Call your function
            System.out.println(checkNumber(name));

        }
    }

    // creating function requested by the 2nd exercise - Claudio
    private static String checkNumber(String arg1) {
        // Saving the formatted argument of the function into formattedString variable - Claudio
        String formattedString = arg1.toUpperCase().trim();
        // Declaring a starting boolean variable to false to evaluate whether the string has digit or not - Claudio
        boolean isAnyNumberIn = false;
        // for loop to check every character and if there's a digit setting the boolean isAnyNumberIn to true - Claudio
        for (int i = 0; i < formattedString.length(); i++) {
            if (isDigit(formattedString.charAt(i))) {
                isAnyNumberIn = true;
            }
        }
        // if statement that returns results based on the value of isAnyNumberIn - Claudio
        if (isAnyNumberIn) {
            return arg1;
        } else {
            return "invalid";
        }

    }


    /**
     * 3: Write a function that prints out every variable seen in the code. It should not return anything
     */
    private static void exercise3() {
        System.out.println("\nExercise 3:");

        double myLunchPrice = 5.99;
        String lunchType = "sandwich";
        String description = "Nice big sandwich";
        int weightInGrams = 500;
        printAllVariables(myLunchPrice, lunchType, description, weightInGrams);


    }

    // non sono riuscito a trovare un modo senza entrare in argomenti avanzati per stampare tutte le variabili,
    // posso farlo solo manualmente
    // ho utilizzato lo string builder perchè è più ottimizzato nelle prestazioni, come ci hai fatto vedere l'altra volta - Claudio

    private static void printAllVariables(double arg1, String arg2, String arg3, int arg4) {
        // adding all the variables together in a string - Claudio
        StringBuilder allVariables = new StringBuilder();
        allVariables.append(arg1);
        allVariables.append(" ");
        allVariables.append(arg2);
        allVariables.append(" ");
        allVariables.append(arg3);
        allVariables.append(" ");
        allVariables.append(arg4);
        System.out.println(allVariables);
    }

}

