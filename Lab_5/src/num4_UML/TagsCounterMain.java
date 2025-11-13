package num4_UML;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Map;
import java.util.Scanner;

public class TagsCounterMain {

    public static void initializeTagsCounter(Scanner sc){
        System.out.println("\n------------------------------------------------");
        System.out.println("Підрахунок тегів на сторінці за URL");
        System.out.print("Введіть URL(https://classroom.google.com/u/2/w/Nzc1MTQwNjU4MjM5/t/all): ");
        String url = sc.next();

        String html = null;
        try {
            html = HTMLFetcher.fetchHTMLFromURL(url);
        } catch (MalformedURLException e) {
            System.out.println("Не вдалося знайти сторінку");
            return;
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }

        try(BufferedWriter writer = new BufferedWriter(new FileWriter("Lab_5/html.txt"))){
            writer.write(html);
        } catch (IOException e) {
            e.printStackTrace();
        }

        Map<String, Integer> tags = TagsCounter.countTags(html);
        System.out.println("\nТеги успішно пораховано");

        int choice;
        while(true){
            
            System.out.println("Вивід та сортування: ");
            System.out.println("1. Алфавітний порядок(за зростанням)");
            System.out.println("2. Частота(за зростанням)");
            System.out.println("0. Вихід");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice){
                case 1:
                    TagsCounter.printTagsAlphabetical(tags);
                    break;
                case 2: 
                    TagsCounter.printTagsByCount(tags);
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
