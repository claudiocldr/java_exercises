package _1_inheritance;

public class Dog extends Animal{
    String breed;
    public Dog(double height, double weight, String breed) {
        super(height, weight);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public double runSpeedMetersPerSecond() {
        return (getHeight() * 2);
    }
}
