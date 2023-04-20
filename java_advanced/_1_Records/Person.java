package _1_Records;

public record Person(String name, int age, String address ) {
    @Override
    public String toString() {
        return "Questa persona si chiama "+ name +
                ", ha " + age + " anni" +
                ", vive in " + address ;
    }
}
