package num1_WordCount;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class WordCounter {

    public static void initializeWordsCounting(Scanner sc){
        System.out.println("\n------------------------------------------------");
        System.out.println("Визначення рядка з найбільшою кількістю слів");
        System.out.print("Шлях до файлу(Lab_5/TestFiles/Words.txt): ");
        String filePath = sc.nextLine();

        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))){

            String mostWordsLine = "";
            int mostWordsLineNum = 0;
            int counter = 0;

            String line = reader.readLine();
            while(line != null){
                if(Arrays.asList(line.split(" ")).size() > Arrays.asList(mostWordsLine.split(" ")).size()){
                    mostWordsLine = line;
                    mostWordsLineNum = counter;
                }
                counter += 1;
                line = reader.readLine();
            }

            System.out.println("\nРядок " + mostWordsLineNum +": "+ mostWordsLine);

        } catch (FileNotFoundException e) {
            System.out.println("\nТакого файлу не знайдено\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}