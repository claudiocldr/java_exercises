package javabasics._8;

public class Main {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
        exercise4();
    }

    /**
     * 1: Using the 'Integer' and the String class, convert ourNumber below to an int
     * <p>
     * Once this is converted to an int, increase its value by 2
     * <p>
     * Then convert this back to a string and print it, it should be 90 and not 882
     */
    private static void exercise1() {
        System.out.println("\nExercise 1:");
        String ourNumberStr = "88";
        //Write your code here
        // using the integer class and valueOf method I got the int value of the string OurNumberStr
       int ourNumberInt = Integer.valueOf(ourNumberStr);
       // then I added to the int value of the string saved as a variable +2
        ourNumberInt += 2;
        // then I assigned the string value of the variable OurNumberInt to OurNumberStr
        ourNumberStr = String.valueOf(ourNumberInt);
        // ultimately I printed the variable ourNumberStr after being reassigned with the new string value
        System.out.println(ourNumberStr);

    }

    /**
     * 2a: Convert ourChar to a String, make it uppercase
     * <p>
     * 2b: Play around line 37, experiment the integer of 0 to a number where it prints 'w', instead of 'H'
     * think about what the charAt method is doing?
     */
    private static void exercise2() {
        System.out.println("\nExercise 2a:");
        char ourChar = 'a';
        // I've used the method valueOf to get the string value of ourChar variable
        // and then transformed the string value in upper case using the method toUpperCase
        String ourCharString = String.valueOf(ourChar).toUpperCase(); // <--- Change this line
        // Notice below what happens, the `charAt()` method
        System.out.println(ourCharString.charAt(0));

        System.out.println("\nExercise 2b:");
        String anotherString = "Hello world";
        // I've put 6 because the index of the w in the string is 6
        int charAtIndex = 6; // <--- Change this line
        System.out.println("Make this print 'w' -> current result: '" + anotherString.charAt(charAtIndex) + "'");
    }


    /**
     * 3: This exercise currently throws 'exceptions' (big red error messages in our console)
     * <p>
     * Change the 3 lines indicated below so it no longer crashes, think about the type
     * conversions. "hello" can't be a number
     */
    private static void exercise3() {
        System.out.println("\nExercise 3:");
        // I changed the string value of 5.5 into 5 so it can be read as an integer
        String intStrToConvert = "5"; // Change this line
        System.out.println(Integer.valueOf(intStrToConvert));
        // I didn't modify this line because a full string can be converted into a Boolean
        String booleanStrToConvert = "maybe"; // And this line
        System.out.println(Boolean.valueOf(booleanStrToConvert));
        // I changed the string value to a double number so it could be read as a double
        String doubleStrToConvert = "5.5"; // Also this line
        System.out.println(Double.valueOf(doubleStrToConvert));
    }


    /**
     * 4: Given our string 'startStr'
     *    4.1: use a string method to make sure it can convert to an int and convert it to an int
     *    4.2: Times our number by 2
     *    4.3: Convert back to a string, and concatenate our number with itself,
     *         (i.e. 4 concatenated with itself is 44, not 8)
     *    4.4: Convert to a double and divide our number by 3.5
     *    4.5: Use Math.floor to remove decimal places on our number
     *
     *    Your result should be 288.0!
     */
    private static void exercise4() {
        System.out.println("\nExercise 4:");
        String startStr = "5 ";
        // Write your code here
        // trim method to remove spaces from startStr
        String trimmedStartStr = startStr.trim();
        // assigned the integer value of trimmedStartStr into a new variable
        int intValueTrimmedStartStr = Integer.valueOf(trimmedStartStr);
        // Multiplied the new variable IntValueStartStr by 2
        intValueTrimmedStartStr = intValueTrimmedStartStr * 2;
        // assigned the string value of intValueTrimmedStartStr into a new variable
        String stringValueTrimmedStartStrAfterOperations = String.valueOf(intValueTrimmedStartStr);
        // assigned endValue the concatenation value between these two variables
      String endValue = stringValueTrimmedStartStrAfterOperations + stringValueTrimmedStartStrAfterOperations;
      // assigned to a new variable the double value of the string endValue
      Double endValueDouble = Double.valueOf(endValue);
      // used some mathematical operations required by the exercise on endValueDouble
        endValueDouble = endValueDouble / 3.5;
        endValueDouble = Math.floor(endValueDouble);
        // printed the final value
        System.out.println(endValueDouble);
        // Non capisco perchè la consegna afferma che il valore dovrebbe essere 288,
        // quando avendo come valore di partenza 5 non è possibile ottenere 288
    }
}