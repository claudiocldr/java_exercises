package _2_abstract_classes;

//class inherited from Shape class that contains the method to calculate the area of a rectangle
public class Rectangle extends Shape {


    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double calculateArea() {
        return this.height * this.width;
    }
}
