import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)){

            WordDictionary dict = new WordDictionary();

            String pathToFile = "Lab_6/words.txt";
            String content = Files.readString(Paths.get(pathToFile));
            dict.addWordList(content);

            int choice;
            while(true){

                System.out.println("\n\t--- МЕНЮ ---");
                System.out.println("1. Перекласти введене слово(англіська - українська)");
                System.out.println("2. Додати слово та переклад(англіська - українська)");
                System.out.println("3. Перекласти фразу(англіська - українська)(слова для яких немає перекладу заміняється '-')");
                System.out.println("0. Вихід");
                choice = sc.nextInt();
                sc.nextLine();

                switch (choice){
                    case 1:
                        translateWord(dict, sc);
                        break;
                    case 2:
                        addToDict(dict, sc);
                        break;
                    case 3:
                        translatePhrase(dict, sc);
                        break;
                    case 0:
                        return;
                    default:
                        System.out.println("Виберіть пункт з списку");
                        break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void translateWord(WordDictionary dict, Scanner sc){
        System.out.print("\nВведіть слово для перекладу: ");
        String word = sc.nextLine();
        dict.translate(word);
    }

    private static void addToDict(WordDictionary dict, Scanner sc){
        System.out.print("\nВведіть пару слово - переклад: \n");
        String entry = sc.nextLine();
        dict.addWord(entry);
        System.out.print("\nПару успішно додано!\n");
    }

    private static void translatePhrase(WordDictionary dict, Scanner sc){
        System.out.println("\nВведіть фразу для перекладу: ");
        String phrase = sc.nextLine();
        dict.translateWords(phrase);
    }
}
