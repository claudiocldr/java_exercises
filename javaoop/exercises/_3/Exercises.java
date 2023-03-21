package javabasics.javaoop.exercises._3;

import java.time.Month;
import java.util.ArrayList;

import static java.time.format.DateTimeFormatter.ofPattern;

public class Exercises {
    public static void main(String[] args) {
        exercise1();
        exercise2();
    }

    /**
     * 1: Copy over the student class
     * <p>
     * Make sure there are 5 fields inside, if they are not simply create some more.
     * make every field private first.
     * <p>
     * Then create getters and setters for each of these 5 fields.
     * <p>
     * Once ready use all 5 below
     */
    private static void exercise1() {
        System.out.println("Exercise 1:");
        // Write and use your 5 getters and setters!
        ArrayList<Student> students = new ArrayList<>();
        //using all 5 setters
        students.add(new Student("c", 12, "2B", "latin", (ofPattern("03-05-1990"))));
        // using all 5 getters
        System.out.println(
                students.get(0).getName() + " " +
                        students.get(0).getAge() + " " +
                        students.get(0).getClassroom() + " " +
                        students.get(0).getSubject() + " " +
                        students.get(0).getBirthDate()
        );
    }

    /**
     * 2: Create 3 setter constraints for the student class
     * <p>
     * Think about what reasonably constraints are?
     * <p>
     * Should a student be able to be a negative age?
     * <p>
     * Create a counter for one of the getters, try to think about
     * what other code could be inside a getter? Why not write it?
     */
    private static void exercise2() {
        System.out.println("\nExercise 2:");

        //Write your code here
        // creating again array list
        ArrayList<Student> students = new ArrayList<>();
        // using constructor
        students.add(new Student("ca", 14, "2B", "math", (ofPattern("03-05-1990"))));
        // using getter to check if the counter works
        students.get(0).getName();
        //  printing the value of the counter
        System.out.println(students.get(0).getNameRequestCounter());
    }

}
