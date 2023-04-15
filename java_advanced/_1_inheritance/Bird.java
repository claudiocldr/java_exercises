package _1_inheritance;

public class Bird extends Animal{
    double wingspan;
    public Bird(double height, double weight, double wingspan) {
        super(height, weight);
        this.wingspan = wingspan;
    }

    public double getWingspan() {
        return wingspan;
    }

    public void setWingspan(double wingspan) {
        this.wingspan = wingspan;
    }

    public double flySpeedMetersPerSecond() {
        return wingspan * 4;
    }
}
