import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean menu = true;
//        головне меню
        while(menu){
            System.out.println("1. Створити новий запис в журналі");
            System.out.println("2. Переглянути всі наявні записи");
            System.out.println("3. Завершити роботу");

            String option = scanner.nextLine();
            switch (option) {
                case "1":
                    Enter();
                    break;
                case "2":
                    CuratorsJournal.printAllStudents();
                    break;
                case "3":
                    menu = false;
                    break;
                default:
                    System.out.println("Введіть номер наявного пункту для його вибору.");
                    System.out.println();
            }
        }
    }

    static void Enter(){
        boolean[] correctness = {false, false, false, false, false};

        InfoEnter infoEnter = new InfoEnter();

        System.out.println("Введіть дані студента");

        boolean invalid = true;
        while(invalid){
            if (!correctness[0]) {
                correctness[0] = infoEnter.surnameEnter();
            }
            if (!correctness[1]) {
                correctness[1] = infoEnter.nameEnter();
            }
            if (!correctness[2]) {
                correctness[2] = infoEnter.BirthEnter();
            }
            if (!correctness[3]) {
                correctness[3] = infoEnter.TelephoneEnter();
            }
            if (!correctness[4]) {
                correctness[4] = infoEnter.AddressEnter();
            }
            System.out.println();

            boolean help = false;
            if (!correctness[0]) {
                System.out.print("Прізвище");
                help = true;
            }
            if (!correctness[1]) {
                if (help) {
                    System.out.print(", імʼя");
                } else {
                    System.out.print("Імʼя");
                    help = true;
                }
            }
            if (!correctness[2]) {
                if (help) {
                    System.out.print(", дата народження");
                } else {
                    System.out.print("Дата народження");
                    help = true;
                }
            }
            if (!correctness[3]) {
                if (help) {
                    System.out.print(", телефон");
                } else {
                    System.out.print("Телефон");
                    help = true;
                }
            }
            if (!correctness[4]) {
                if (help) {
                    System.out.print(", домашня адреса");
                } else {
                    System.out.print("Домашня адреса");
                    help = true;
                }
            }
            if (help) {
                boolean menu2;
                System.out.println(" були введені невірно.");
                do {
                    System.out.println("1. Ввести ці елементи знову\n2. Ввести всі елементи знову");
                    String option = scanner.nextLine();
                    switch (option) {
                        case "1":
//                        нічого, перевводим невірно введені
                            menu2 = false;
                            break;
                        case "2":
                            menu2 = false;
//                        Перевводим всі елементи
                            for (int i = 0; i < 5; i++) {
                                correctness[i] = false;
                            }
                            break;
                        default:
                            System.out.println("Введіть номер наявного пункту для його вибору.");
                            System.out.println();
                            menu2 = true;
                    }
                }while (menu2);

            } else {
//              все вірно
                System.out.println("Дані введено і збережено");
                new Student(infoEnter.getCurrentSurname(), infoEnter.getCurrentName(), infoEnter.getCurrentBirthDate(), infoEnter.getCurrentTelephone(), infoEnter.getCurrentAddress());
                invalid = false;
                System.out.println();
            }
        }
    }
}