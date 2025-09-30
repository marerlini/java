import java.util.ArrayList;
import java.util.List;

public class CuratorsJournal {
    private static List<Student> allStudents = new ArrayList<>();

    public static void addStudent(Student student) {
        allStudents.add(student);
    }

    public static void printAllStudents() {
        if (allStudents.isEmpty()) {
            System.out.println("Записів немає.");
            System.out.println();
            return;
        }
        for (int i = 0; i < allStudents.size(); i++) {
            System.out.println("Запис " + (i + 1) + ":");
            allStudents.get(i).PrintAllInfo();
            System.out.println();
        }
    }
}
