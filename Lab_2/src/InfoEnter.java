import java.util.Scanner;

public class InfoEnter {
    private static final Scanner scanner = new Scanner(System.in);
    private String currentSurname;
    private String currentName;
    private String currentBirthDate;
    private String currentTelephone;
    private String currentAddress;

    public boolean surnameEnter() {
        System.out.print("Прізвище студента: ");
        String surname = scanner.nextLine();
        currentSurname = surname;
        return NamesCheck(surname);
    }
    public boolean nameEnter() {
        System.out.print("Імʼя студента: ");
        String name = scanner.nextLine();
        currentName = name;
        return NamesCheck(name);
    }
    public boolean BirthEnter() {
        System.out.print("Дата народження студента: ");
        String birthDate = scanner.nextLine();
        currentBirthDate = birthDate;
        return BirthCheck(birthDate);
    }
    public boolean TelephoneEnter() {
        System.out.print("Телефон студента: ");
        String telephoneNumber = scanner.nextLine();
        currentTelephone = telephoneNumber;
        return TelephoneCheck(telephoneNumber);
    }
    public boolean AddressEnter() {
        System.out.print("Домашня адреса студента: ");
        String homeAddress = scanner.nextLine();
        currentAddress = homeAddress;
        return AddressCheck(homeAddress);
    }


    static boolean NamesCheck(String str) {
        return str.matches("[а-яА-ЯіІїЇєЄґҐ]+");
    }
    static boolean BirthCheck(String str) {
        return str != null && str.matches("^(0[1-9]|[12][0-9]|3[01])\\.(0[1-9]|1[0-2])\\.\\d{4}$");
    }
    static boolean TelephoneCheck(String str) {
        return str != null && str.matches("^\\+380\\d{9}$");
    }
    static boolean AddressCheck(String str) {
        return str != null && str.matches("^[а-яА-ЯіІїЇєЄґҐa-zA-Z0-9\\s\\-'.]+,\\s*\\d+[а-яА-Яa-zA-Z]?,\\s*\\d+$");
    }


    public String getCurrentSurname() {
        return currentSurname;
    }

    public String getCurrentName() {
        return currentName;
    }

    public String getCurrentBirthDate() {
        return currentBirthDate;
    }

    public String getCurrentTelephone() {
        return currentTelephone;
    }

    public String getCurrentAddress() {
        return currentAddress;
    }

}
