package _7;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorTest {
    /**
     * 1:
     * <p>
     * <p>
     * Create JUnit test for the add() and subtract() methods in the Calculator class.
     * <p>
     * Test the methods with multiple test cases, including positive and negative numbers, and zero.
     * <p>
     * Verify that the methods return the correct result for each test case.
     * <p>
     * If there is an error you may have to change the code in Calculator to fix it!
     */
    @Test
    void exercise1() {
        System.out.println("\nExercise 1: ");
        // Your code here
        // non se so l'ho pensata correttamente ma visto che so che l'operatore + dà un risultato corretto
        // ho fatto un loop in cui si compara il risultato dell'operatore + con il methodo add della classe Calculator
        // ho preferito scrivere così piuttosto che testare manualmente i casi
        Calculator calculator = new Calculator();
        for (int i = -1; i <=1; i++) {
            Assertions.assertEquals(0+i,calculator.add(0,i));
            Assertions.assertEquals(0-i, calculator.subtract(0, i));
        }

    }

    /**
     * 2:
     * <p>
     * <p>
     * Create JUnit test for the multiply() and divide() methods in the Calculator class.
     * <p>
     * Test the same kind of inputs as before as exercise 1
     * <p>
     * If there is an error you may have to change the code in Calculator to fix it!
     */
    @Test
    void exercise2() {
        System.out.println("\nExercise 2: ");
        // Your code here
        // qui ho fatto come preferiva l'esercizio, ovvero scrivendolo manualmente anche se avrei potuto fare un loop

        Calculator calculator = new Calculator();
        Assertions.assertThrows(ArithmeticException.class, () -> calculator.divide(10, 0));
        Assertions.assertEquals(1, calculator.divide(1, 1));
        Assertions.assertEquals(-1, calculator.divide(1, -1));
    }
    /**
     * 3:
     *
     * Create a JUnit test for the power() method in the Calculator class that raises a number to a power.
     * Test the method with test cases where the base is zero, positive, and negative - the exponent is zero, one and negative
     * Test with decimals too!
     * Verify that the method returns the correct result for each test case.
     *
     * If there is an error you may have to change the code in Calculator to fix it!
     *
     * Don't just write tests that use the result of the program as the expected!!
     *
     */
    @Test
    void exercise3() {
        System.out.println("\nExercise 3: ");
        // Your code here
        // in questo caso ho fatto un loop che compara il risultato del metodo Math.pow che so che funziona correttamente,
        // con il metodo che ho creato
        Calculator calculator = new Calculator();
        for(int i = -1; i <=1; i++) {
            Assertions.assertEquals(Math.pow(0,i), calculator.power(0,i));
            Assertions.assertEquals(Math.pow(-1,i),calculator.power(-1,i));
            Assertions.assertEquals(Math.pow(1,i),calculator.power(1,i));
            Assertions.assertEquals(Math.pow(0.5,i),calculator.power(0.5,i));
        }
    }
}