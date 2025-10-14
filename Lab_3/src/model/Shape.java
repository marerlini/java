package model;

public abstract class Shape implements Drawable {
    protected String shapeColor;

    public Shape(String shapeColor){
        this.shapeColor = shapeColor;
    }

    public abstract String getIcon();

    public abstract double calcArea();

    @Override
    public String toString() {
        return getIcon() + " " + shapeColor + ": " + "area=" + this.calcArea() + " ";
    }

    @Override
    public void draw() {
        System.out.println(this.toString());
    }
}
