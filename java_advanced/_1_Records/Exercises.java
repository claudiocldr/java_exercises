package _1_Records;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;

public class Exercises {
    /**
     * 1:
     *
     *
     * In the main method, create a variable x as a random number between 0-100 using Math.random() * 100;
     *
     * Use a ternary operator to check if x is greater than or equal to 50. If it is, print "x is greater than or equal to 50". If it's not, print "x is less than 50".
     *
     * Experiment with different values of x and observe the output
     */
    // Non capisco perchè chiede di inserire la variabile nel metodo main,
    // oltretutto il metodo main non esisteva, ho dovuto crearlo io
    public static void main (String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }


    private static void exercise1() {
        System.out.println("\nExercise 1: ");
        // Your code here
       String x = (Math.random() * 100) > 50 ? "x is greater than or equal to 50" : "x is less than 50" ;
        System.out.println(x);
        System.out.println(x);
        System.out.println(x);


    }

    /**
     * 2:
     *
     *
     * Create a record called "Person" with fields for name, age and address.
     *
     * Add a toString method to Person to print out the data in a different format
     *
     * Print the record to the console
     */
    private static void exercise2() {
        System.out.println("\nExercise 2: ");
        // Your code here
        Person person1 = new Person("Marco", 23, "Via Roma");
        System.out.println(person1);
    }

    /**
     * 3:
     *
     *
     * In the main method, create a BigInteger variable with a large value.
     *
     * Create a BigDecimal variable with a large value
     *
     * Divide the BigInteger by 3 using the divide method and assign the result to a new BigInteger variable
     *
     * Divide the BigDecimal by Math.PI using the divide method and assign the result to a new BigDecimal variable
     *
     * Print the results
     */
    private static void exercise3() {
        System.out.println("\nExercise 3: ");
        // Your code here
        BigInteger biginteger = new BigInteger("100000000000000000000000000000");
        BigDecimal bigDecimal = new BigDecimal("52.000000000000032314142");
        BigInteger divider = new BigInteger("3");
        BigInteger bigIntegerDivided = biginteger.divide(divider);
        BigDecimal pi = new BigDecimal(String.valueOf(Math.PI));
        // ho provato ad usare il metodo round sulla divisione sottostante
        // ma tira questa eccezione Non-terminating decimal expansion; no exact representable decimal result.
        BigDecimal bigDecimaldivided = bigDecimal.divide(pi).round(MathContext.UNLIMITED);
        System.out.println(bigIntegerDivided);
        System.out.println(bigDecimaldivided);

    }

}
