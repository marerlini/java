package model;
import java.util.Random;
import java.util.Arrays;

public class ShapeModel {
    private Shape[] shapes;

    public void initializeRandomShapes(int size) {
        this.shapes = new Shape[size];

        Random random = new Random();

        String[] colors = {"Red", "Green", "Blue", "Yellow", "Purple", "Black"};

        for (int i = 0; i < size; i++) {
            int shapeType = random.nextInt(3);
            String randomColor = colors[random.nextInt(colors.length)];

            switch (shapeType) {
                case 0:
                    double radius = 1 + random.nextDouble() * 19;
                    shapes[i] = new Circle(randomColor, radius);
                    break;

                case 1:
                    double width = 1 + random.nextDouble() * 19;
                    double height = 1 + random.nextDouble() * 19;
                    shapes[i] = new Rectangle(randomColor, width, height);
                    break;

                case 2:
                    double a = 5 + random.nextDouble() * 15;
                    double b = 5 + random.nextDouble() * 15;
                    double c = Math.abs(a - b) + 1 + random.nextDouble() * (a + b - Math.abs(a - b) - 2);
                    shapes[i] = new Triangle(randomColor, a, b, c);
                    break;
            }
        }
    }

    public Shape[] getShapes() {
        return shapes;
    }

    public void setShapes(Shape[] shapes) {
        this.shapes = shapes;
    }

    public double calculateTotalArea(){
        double TotalArea = 0;

        for (Shape shape : shapes) {
            TotalArea += shape.calcArea();
        }

        return TotalArea;
    }

    public double calculateTotalAreaByType(String type){
        double TotalArea = 0;

        for (Shape shape : shapes) {
            if(shape.getClass().getSimpleName().equals(type)){
                TotalArea += shape.calcArea();
            }
        }
        return TotalArea;
    }
    public void sortByArea() {
        Arrays.sort(shapes, new AreaComparator());
    }
    
    public void sortByColor() {
        Arrays.sort(shapes, new ColorComparator());
    }
}
