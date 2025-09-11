import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        perfectNumber(30);

        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter number: ");

        int num = myObj.nextInt();
        System.out.println("Perfect numbers from 1 to " + num);
        perfectNumber(num);
    }

    static void perfectNumber(int num) {
        int sum;

        for (int i = 1; i <= num; i++) {
            sum = 0;
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    sum += j;
                }
            }

            if (sum == i) {
                System.out.println(i);
            }
        }
    }
}