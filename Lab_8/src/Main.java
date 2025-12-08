public class Main {
    public static void main(String[] args) {

        for(int i = 1; i <= 10; i++) {
            System.out.println("\nЗапуск з " + i + " потоками:");
            ParallelMonteCarloPi.calculate(i, 1000000000);
        }

        for(int i = 1000; i <= 1000000000; i *= 10) {
            System.out.println("\nЗапуск з " + i + " точками:");
            ParallelMonteCarloPi.calculate(2, i);
        }
    }
}