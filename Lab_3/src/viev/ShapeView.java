package viev;
import model.Shape;

import java.util.Scanner;

public class ShapeView {
    public void printShapes(Shape[] shapes){
        System.out.println("Фігури:");
        for (Shape shape : shapes) {
            System.out.println(shape.draw());
        }
    }

    public void printMessage(String message){
        System.out.println(message);
    }

    public  void  printResult(String msg, double num){
        System.out.println(msg + num);
    }

    public String getShapeTypeInput() {
        System.out.print("Введіть тип фігури (наприклад, Circle, Rectangle, Triangle): ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public int getMenuChoice() {
        System.out.println("\n===== МЕНЮ =====");
        System.out.println("1. Вивести всі фігури");
        System.out.println("2. Сортувати за площею");
        System.out.println("3. Сортувати за кольором");
        System.out.println("4. Показати загальну площу");
        System.out.println("5. Показати загальну площу для певного виду фігур");
        System.out.println("0. Вихід");
        System.out.print("Ваш вибір: ");

        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
