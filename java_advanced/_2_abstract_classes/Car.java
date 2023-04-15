package _2_abstract_classes;

public class Car implements Movable {
    @Override
    public void moveForward() {
        System.out.println("The car is moving forward");
    }

    @Override
    public void moveBackward() {
        System.out.println("The car is moving backward");

    }
}
