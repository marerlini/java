import java.util.Scanner;

import num1_WordCount.WordCounter;
import num3_Encryptor.EncryptMenu;
import num4_UML.TagsCounterMain;

public class Main {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        int choice;
        while(true){
            
            System.out.println("\n\tМеню: ");
            System.out.println("1. Рядок з максимальною кількістю слів");
            System.out.println("2. Шифрування/душифрування символів");
            System.out.println("3. Підрахування частоти тегів на сторінці");
            System.out.println("0. Вихід");
            System.out.print(" - ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice){
                case 1:
                    WordCounter.initializeWordsCounting(sc);
                    break;
                case 2:
                    EncryptMenu.initializeEncryptor(sc);
                    break;
                case 3:
                    TagsCounterMain.initializeTagsCounter(sc);
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Виберіть з списка номер пункту");
                    break;
            }
        }
    }
}