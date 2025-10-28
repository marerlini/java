package Passengers;

public class Policeman extends Human {
    public enum PoliceRank {
        OFFICER,
        SERGEANT,
        LIEUTENANT,
        CAPTAIN,
        MAJOR,
        COLONEL,
        GENERAL
    }
    private PoliceRank rank;

    public Policeman (String name, String surname, Sex sex, int age, PoliceRank rank){
        super(name, surname, sex, age);
        this.rank = rank;
    }
}
