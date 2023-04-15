package _2_abstract_classes;

//class inherited from Shape class that contains the method to calculate the area of a circle
public class Circle extends Shape{
    public Circle(double height) {
        this.height = height;
        this.width = height;
    }
    public double calculateArea() {
        return Math.PI * Math.pow((this.height / 2), 2);
    }
}
