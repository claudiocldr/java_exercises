package _1_inheritance;

import java.util.ArrayList;

public class Exercises {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }

    /**
     * 1:
     *
     *
     * Create a class called "Dog" that extends the Animal class.
     *
     * Add a new field called "breed" to the Dog class.
     *
     * Write a constructor for the Dog class that takes in a breed, height, and weight as parameters, and passes the height and weight to the superclass constructor.
     *
     * Write getters and setters for the breed field.
     */
    private static void exercise1() {
        System.out.println("\nExercise 1: ");
        // Your code here
        Dog dalmata = new Dog(90.0, 50, "Dalmata");
    }

    /**
     * 2:
     *
     *
     * Create new classes called "Fish" and "Bird" that extends the Animal class.
     *
     * Add a new field called "species" to the Fish class and "wingSpan" to the Bird class.
     *
     * Also create constructors, getters and setters
     *
     */
    private static void exercise2() {
        System.out.println("\nExercise 2: ");
        // Your code here
        // created classes and added fields to the constructors

    }


    /**
     * 3:
     *
     * In the dog class create a method called runSpeedMetersPerSecond() that returns the Dog's Height * 2
     * In the fish class create a method called swimSpeedMetersPerSecond() that returns the Fish's Weight * 2
     * In the bird class create a method called flySpeedMetersPerSecond() that returns the Bird's Wingspan * 4
     *
     * Create instances of each Animal: Dog, Fish and Bird. Fill the constructors with values of your choice
     * and print out which of the animals has the fastest movement speed in MetersPerSecond
     */
    private static void exercise3() {
        System.out.println("\nExercise 3: ");
        // Your code here
        // creating 3 new animals
        Dog doberman = new Dog(90.0, 60, "Doberman");
        Fish tonno = new Fish(140, 200, "Tonno pinna gialla");
        Bird aquilaReale = new Bird(100, 5, 200.0);
        // setting a starting maxspeed
        double maxSpeed = doberman.runSpeedMetersPerSecond();
        // creating an arraylist to store speeds
        ArrayList<Double> speeds = new ArrayList<>();
        // adding speed of each animal to the array
        speeds.add(doberman.runSpeedMetersPerSecond());
        speeds.add(tonno.swimSpeedMetersPerSecond());
        speeds.add(aquilaReale.flySpeedMetersPerSecond());
        // looping through each speed to see which is the highest
        for (double speed : speeds) {
            if(speed>maxSpeed) {maxSpeed = speed;}
        }
        // if statement checking if the max speed corresponds to one of the animal speed
        // and printing the one it corresponds to
        if(maxSpeed == doberman.runSpeedMetersPerSecond()) {
            System.out.println("The dog is the fastest animal");
        } else if (maxSpeed == tonno.swimSpeedMetersPerSecond()) {
            System.out.println("The fish is the fastest animal");
        } else {
            System.out.println("The bird is the fastest animal");}







    }
}
