public class Student {
    
    private String Surname;
    private String Name;
    private String BirthDate;
    private String Telephone;
    private String Address;

    public Student(String surname, String name, String birthDate, String telephone, String address) {
        this.Surname = surname;
        this.Name = name;
        this.BirthDate = birthDate;
        this.Telephone = telephone;
        this.Address = address;

        CuratorsJournal.addStudent(this);
    }

    public void PrintAllInfo() {
        System.out.println("Прізвище: " + Surname);
        System.out.println("Імʼя: " + Name);
        System.out.println("Дата народження: " + BirthDate);
        System.out.println("Телефон студента: " + Telephone);
        System.out.println("Домашня адреса: " + Address);
        System.out.println();
    }

}
