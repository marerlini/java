import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter number: ");

        int num = myObj.nextInt();
        ArrayList<Integer> perf;

        System.out.println("Perfect numbers from 1 to " + num);
        perf = perfectNumber(num);

        for (Integer i : perf) {
            System.out.println(i);
        }
    }

    static ArrayList<Integer> perfectNumber(int num) {
        int sum;
        ArrayList<Integer> perfect = new ArrayList<>();

        for (int i = 1; i <= num; i++) {
            sum = 0;
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    sum += j;
                }
            }

            if (sum == i) {
                perfect.add(i);
            }
        }
        return perfect;
    }
}