package model;

import static java.lang.Math.PI;

public class Circle extends Shape{
    private final double radius;


    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public String getIcon() {
        return "○";
    }

    public double calcArea() {
        return PI * radius * radius;
    }

    @Override
    public String toString() {
        return super.toString() + "radius=" + radius;
    }
}
