package _3;

import java.util.*;

public class Exercises {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }


    /**
     * 1: Complete the function that removes any duplicates by using a set
     * then recreates a new list of unique items
     * <p>
     * You can reset a list by using list = new ArrayList<>();
     */
    private static void exercise1() {
        List<String> list = new ArrayList<>(Arrays.asList("a", "b", "c", "a", "b", "c", "a", "b", "c"));

        // Your code here
        // creating a new hashset to store letters from list and remove duplicates
        Set<String> removeDupli = new HashSet<>();
        // looping through list to add items to removeDupli
        for (String letter : list) {
            removeDupli.add(letter);
        }
        // resetting list
        list = new ArrayList<>();
        // looping through hashset removeDupli to add the items of removeDupli to list
        for (String letter : removeDupli) {
            list.add(letter);
        }

        if (list.size() == 3) {
            System.out.println("Exercise 1: Success");
        } else {
            System.out.println("Exercise 1: Failed");
        }
    }

    /**
     * 2: Write a method that takes a List of Strings or a Set of Strings and returns a Set of Strings.
     * the method should take a collection as a parameter
     */
    private static void exercise2() {
        // Your code here
        System.out.println("Exercise 2: ");
        List<String> list = Arrays.asList("apple", "banana", "apple", "orange", "kiwi", "banana");
        Set<String> set = Set.of("apple", "banana");
        System.out.println(toSet(list));
        System.out.println(toSet(set));
    }

    // Write your method for exercise 2 here
    // method that takes a collection of string as a parameter and returns a set of Strings
    private static Set toSet(Collection<String> arg) {
        // declaring the set that will be returned after the method
        Set<String> transformedSet = new HashSet<>();
        // looping through the collection given as a parameter and adding each item to transformedSet
        for (String strings : arg) {
            transformedSet.add(strings);
        }
        // returning transformedSet
        return transformedSet;
    }


    /**
     * 3: Follow the instructions in the comments
     */
    private static void exercise3() {
        System.out.println("Exercise 3:");
        String str = "the fox and the lazy dog saw another fox with another not lazy dog";
        List<String> words = Arrays.stream(str.split(" ")).toList();
        Map<String, Integer> wordCount = new HashMap<>();

        // Write code to count the number of occurrences of each word in the String `words`
        // and store the counts in the Map `wordCount`, note you will need to first get the previous value
        // from the Map and then increment it by 1, if no previous value exists, use 0 as the previous value.

        // Your code here

        //for each loop that takes the elements of the array words and
        // checks if those elements are already keys of the map wordCount
        // if the current element is already in the map
        // it creates a variable which stores as an int how many times
        // the element we are currently iterating is occurred in the array words
        // and then this variable will be assigned as the value of the key we are iterating
        // else it will set the value of the element as 1

        for (String word : words) {
            if (wordCount.containsKey(word)) {
                int value = wordCount.get(word) + 1;
                wordCount.put(word, value);

            } else {
                wordCount.put(word, 1);
            }
        }
        System.out.println(wordCount);


    }

}


 /** 4: Answer the following questions
 * <p>
 * What is the best data structure to use in the following scenarios, chose either a List, Set or Map
 * and explain why you chose that data structure.
 * <p>
 * 1 - You want to store the students in order of their arrival
 * Answer: I would use a treeset because the treeset would order the arrivals by numeric order
 * <p>
 * 2 - You want to store the students in a class and their grades
 * Answer: I would choose a map because I would put the name of the map as the class, the key of the map as student
 * and the value of the map as grade
 * <p>
 * 3 - You want to store the countries in the world in order of age
 * Answer: I would choose a treeset because it would order ages by numeric order
 * <p>
 * 4 - You want to store the products available for purchase in an online store, along with their corresponding prices.
 * Answer: I would choose a hashmap because I would put the name of the product as a key and the price as a value
 * <p>
 * 5 - You want to store the employees at a company in the order you added them
 * Answer: I would choose a linked hashset because it would respect the order in which I added them
 * <p>
 * 6 - You want to store the cities in a particular state, along with their populations.
 * Answer: I would use a hashmap in which
 * I would use the state as name of the map , then the keys of the map as the cities and as value of the map the populations
 * <p>
 * 7 - You want to store the books in a library, along with their authors and publication dates.
 * Answer: I would use a map that has as a key the name of the book and as value an object containing 2 fields author and publicationDate
 * <p>
 * 8 - You want to store the courses offered at a university, along with the professors teaching each course.
 * Answer: I would use a map, as name of the map I would put courses, as keys the courses and as values the professor teaching these courses
 * <p>
 * 9 - You want to store the movies in a movie rental store, along with their ratings and release dates.
 * Answer: I would use a map, the name of the map would be movies, the keys in the map would be the titles of the movies and the values would
 * be an object containing 2 fields: rating and releaseDate
 * <p>
 * 10 - You want to store the flights available for booking on an airline, along with their destinations and departure times.
 * Answer: I would use a hashmap which name is flightsAvailableForBooking, as keys we would have their destination and as values the departure time
 * <p>
 * 11 - You want to store the articles on a news website, along with their titles and publication dates.
 * Answer:I would use a hashmap which its name is articles, the keys are the titles and the values are publication dates
 * <p>
 * 12 - You want to store the songs in a music streaming service, along with their artists and album names.
 * Answer: I would use a hashmap which its name is songs, the keys are the titles of the song and the values
 * are objects containing 2 fields: artist and album name*/
