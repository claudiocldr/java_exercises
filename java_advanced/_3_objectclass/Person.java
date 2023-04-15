package _3_objectclass;

public class Person {
    String name;
    int age;
    String address;
    Person(String name, int age, String address){
        this.name = name;
        this.age = age;
        this.address = address;

    }

    @Override
    public String toString() {
        return "The name of this person is: " + name + "\n" +
                "The age of this person is: " + age + "\n" +
                "The address of this person is: " + address + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (age != person.age) return false;
        if (!name.equals(person.name)) return false;
        return address.equals(person.address);
    }

    @Override
    public int hashCode() {
        // generating the hashcode based on the sum of the hashcodes of the fields
        int result = name.hashCode();
        result+=age;
        result+=address.hashCode();
        return result;
    }
}
