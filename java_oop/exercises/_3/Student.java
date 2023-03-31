package javabasics.javaoop.exercises._3;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Student {
    // declaring variables of the class
    private String name;
    private int age;
    private String classroom;
    private String subject;
    private DateTimeFormatter birthDate;

    private int nameRequestCounter;
    // creating constructor
    public Student (String name, int age, String classroom, String subject, DateTimeFormatter birthDate) {
        this.name = name;
        this.age = age;
        this.classroom = classroom;
        this.subject = subject;
        this.birthDate = birthDate;
    }
// creating all setters methods
    public void setName (String name) {
        // creating constraint
        if(name != null && name.length() > 1)
        {this.name = name;}
        else {
            System.out.println("name is too short, cannot set name");
        }
    }

    public void setAge (int age) {
        // creating constraint
        if (age > 13) {
        this.age = age;}
        else {
            System.out.println("age is too low, cannot set age");
    }
    }

    public void setClassroom (String classroom){
        this.classroom = classroom;
    }

    public void setSubject (String subject) {
        // creating constraint
        if (subject.equals("latin")) {
            System.out.println("cannot set latin as subject, this subject is not teached in this school");

    } else { this.subject = subject;}}

    public void setBirthDate (DateTimeFormatter birthDate) {
        this.birthDate = birthDate;
    }

// creating all getters methods
    public String getName() {
        // creating a counter for how many times we get the name
        nameRequestCounter+=1;
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String getClassroom() {
        return this.classroom;
    }

    public String getSubject() {
        return this.subject;
    }

    public DateTimeFormatter getBirthDate() {
        return birthDate;
    }

    public int getNameRequestCounter() {
        return nameRequestCounter;
    }
}
