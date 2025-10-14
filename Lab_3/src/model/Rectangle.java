package model;

public class Rectangle extends Shape{
    private final double width;
    private final double height;


    public Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    public String getIcon() {
        return "▭";
    }

    public double calcArea() {
        return width * height;
    }

    @Override
    public String toString() {
        return super.toString() + "width=" + width + ", height=" + height;
    }
}
