package controller;
import model.ShapeModel;
import model.Shape;
import viev.ShapeView;
import model.IOProcessor;

public class ShapeController {
    private final ShapeModel model;
    private final ShapeView view;

    public ShapeController(ShapeModel model, ShapeView view) {
        this.model = model;
        this.view = view;
    }

    public void run() {

        boolean running = true;
        while (running) {
            String choice = view.getMenuChoice();

            switch (choice) {
                case "1":
                    view.printMessage("--- Поточний список фігур ---");
                    view.printShapes(model.getShapes());
                    break;
                case "2":
                    model.sortByArea();
                    view.printMessage("--- Фігури відсортовано за площею ---");
                    break;
                case "3":
                    model.sortByColor();
                    view.printMessage("--- Фігури відсортовано за кольором ---");
                    break;
                case "4":
                    view.printResult("Загальна площа всіх фігур: ", model.calculateTotalArea());
                    break;
                case "5":
                    view.printMessage("Введіть тип фігури (наприклад, Circle, Rectangle, Triangle): ");
                    String shapeType = view.getShapeTypeInput();
                    double specificArea = model.calculateTotalAreaByType(shapeType);
                    view.printResult("Загальна площа для '" + shapeType + "': ", specificArea);
                    break;
                case "6":
                    view.printMessage("Введіть шлях до файлу(Lab_3/testShapes): ");
                    String pathToExFile = view.getShapeTypeInput();
                    IOProcessor.exportShapes(pathToExFile, model.getShapes());
                    view.printMessage("--- Дані експортовано успішно в файл ---");
                    break;
                case "7":
                    view.printMessage("Введіть шлях до файлу(Lab_3/testShapes): ");
                    String pathToImFile = view.getShapeTypeInput();
                    Shape[] importedShapes = IOProcessor.importShapes(pathToImFile);
                    model.setShapes(importedShapes);
                    view.printMessage("--- Дані імпортовано успішно в файл ---");
                    break;
                case "8":
                    model.initializeRandomShapes(10);
                    view.printMessage("--- Згенеровано 10 фігур ---");
                    break;
                case "0":
                    running = false;
                    view.printMessage("--- Дані імпортовано успішно ---");
                    break;
                default:
                    view.printMessage("--- Невірний вибір, спробуйте ще раз ---");
                    break;
            }
        }
    }
}

