package num3_Encryptor;

import java.io.IOException;
import java.util.Scanner;

public class Encryptor{

    static IOController handler = new IOController('a');

    public static void inputEncryptParams(Scanner sc){

        System.out.print("\nСимвол-ключ шифрування: ");
        String symbolsString = sc.nextLine();

        System.out.print("\nШлях до файлу(Lab_5/TestFiles/Text.txt): ");
        String pathToFile = sc.nextLine();
        
        try{
            handler.encryptSymbols(symbolsString, pathToFile);
        }
        catch (IOException e) {
            e.printStackTrace();
            return;
        }

        System.out.println("Символи успішно зашифровано в файл '" + pathToFile + "' !");
    }

    public static void inputDecryptParams(Scanner sc){        

        String decryptedCharacters;

        System.out.print("\nШлях до файлу: ");
        String pathToFile = sc.nextLine();
        
        try{
            decryptedCharacters = handler.decryptSymbols(pathToFile);
        }
        catch (IOException e) {
            e.printStackTrace();
            return;
        }
        System.out.println("Символи успішно дешифорвані!\nРезультат: " + decryptedCharacters);
    }
}
