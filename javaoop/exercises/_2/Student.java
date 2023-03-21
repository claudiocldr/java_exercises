package javabasics.javaoop.exercises._2;

public class Student {String name;
    int age;


    public Student(String name, int age) {
        // print statement indicating the start of the constructor
        System.out.println("constructing");
        this.name = name;
        this.age = age;
        // print statement indicating the success of the constructor
        System.out.println("constructed");
    }

    public Student(int age) {
        this.age = age;
    }

    public Student(String name) {
        this.name = name;
    }

    public Student () {

    }


}
