package num3_Encryptor;

import java.util.Scanner;

public class EncryptMenu {
    public static void initializeEncryptor(Scanner sc) {

        int choice;
        while(true){
            System.out.println("\n------------------------------------------------");
            System.out.println("\nМеню шифрування:");
            System.out.println("1. Зашифрувати символи в файл");
            System.out.println("2. Дешифрувати символи з файлу");
            System.out.println("0. Вихід");
            System.out.print(" - ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice){
                case 1:
                Encryptor.inputEncryptParams(sc);
                    break;
                case 2: 
                Encryptor.inputDecryptParams(sc);
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
