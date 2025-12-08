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

        List<Integer> perf = perfectNumber(num);

        perf.forEach(System.out::println);
    }

    static List<Integer> perfectNumber(int num) {
        return IntStream.rangeClosed(1, num)
                .filter(n -> n > 0 && IntStream.range(1, n)
                        .filter(divisor -> n % divisor == 0)
                        .sum() == n)
                .boxed()
                .collect(Collectors.toList());
    }
}