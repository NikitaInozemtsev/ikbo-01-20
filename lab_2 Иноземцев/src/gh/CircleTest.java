package gh;

import java.lang.Math;

public class CircleTest {
    public static void main(String[] args) {
        Circle a = new Circle(10, "blue");

        System.out.println(a);
    }
}

class Circle {
    private double radius;
    private String color;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return (Math.PI * radius * radius);
    }

    public double getPerimeter() {
        return (2 * Math.PI * radius);
    }

    @Override
    public String toString() {
        return "Radius = " + radius + " Color = " + color + " Area = " + getArea() + " Perimeter = " + getPerimeter();
    }

}
