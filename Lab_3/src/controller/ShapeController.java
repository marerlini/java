package controller;
import model.ShapeModel;
import viev.ShapeView;

public class ShapeController {
    private final ShapeModel model;
    private final ShapeView view;

    public ShapeController(ShapeModel model, ShapeView view) {
        this.model = model;
        this.view = view;
    }

    public void run() {
        model.initializeRandomShapes(10);

        boolean running = true;
        while (running) {
            int choice = view.getMenuChoice();

            switch (choice) {
                case 1:
                    view.printMessage("--- Поточний список фігур ---");
                    view.printShapes(model.getShapes());
                    break;
                case 2:
                    model.sortByArea();
                    view.printMessage("--- Фігури відсортовано за площею ---");
                    break;
                case 3:
                    model.sortByColor();
                    view.printMessage("--- Фігури відсортовано за кольором ---");
                    break;
                case 4:
                    view.printResult("Загальна площа всіх фігур: ", model.calculateTotalArea());
                    break;
                case 5:
                    String shapeType = view.getShapeTypeInput();
                    double specificArea = model.calculateTotalAreaByType(shapeType);
                    view.printResult("Загальна площа для '" + shapeType + "': ", specificArea);
                    break;
                case 0:
                    running = false;
                    view.printMessage("--- Програму завершено ---");
                    break;
                default:
                    view.printMessage("--- Невірний вибір, спробуйте ще раз ---");
                    break;
            }
        }
    }

}

