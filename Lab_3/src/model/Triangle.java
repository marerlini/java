package model;
import static java.lang.Math.sqrt;

public class Triangle extends Shape {
    private final double a;
    private final double b;
    private final double c;


    public Triangle( String color, double a, double b, double c) {
        super(color);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public String getIcon() {
        return "△";
    }

    public double calcArea() {
        double p = (a + b + c) / 2;
        return sqrt(p * (p - a) * (p - b) * (p - c));
    }

    @Override
    public String toString() {

        return super.toString() + "sides: a=" + a + ", b=" + b + ", c=" + c;
    }
}
