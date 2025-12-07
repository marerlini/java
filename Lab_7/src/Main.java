import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter number: ");

        int num = myObj.nextInt();

        System.out.println("Perfect numbers from 1 to " + num);

        // Викликаємо метод
        List<Integer> perf = perfectNumber(num);

        // Вивід теж можна зробити через лямбда-вираз (Method Reference)
        perf.forEach(System.out::println);
    }

    static List<Integer> perfectNumber(int num) {
        return IntStream.rangeClosed(1, num)  // Генеруємо числа від 1 до num
                .filter(n -> n > 0 && IntStream.range(1, n) // Лямбда: фільтруємо тільки "досконалі" числа
                        .filter(divisor -> n % divisor == 0) // Знаходимо дільники
                        .sum() == n)                         // Перевіряємо, чи сума дільників дорівнює числу
                .boxed()                                     // Перетворюємо int на Integer для списку
                .collect(Collectors.toList());               // Збираємо в List
    }
}