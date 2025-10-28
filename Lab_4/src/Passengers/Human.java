package Passengers;

import java.util.Objects;

public class Human {
    protected String name;
    protected String surname;
    protected int age;
    public enum Sex{MALE, FEMALE}
    protected Sex sex;

    public Human(String name, String surname, Sex sex, int age) {
        this.name = name;
        this.surname = surname;
        this.sex = sex;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Human human = (Human) o;

        return age == human.age &&
                Objects.equals(name, human.name) &&
                Objects.equals(surname, human.surname) &&
                Objects.equals(sex, human.sex);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age);
    }
}
