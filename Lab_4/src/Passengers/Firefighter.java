package Passengers;

public class Firefighter extends Human {
    public enum FirefighterRank {
        FIREFIGHTER,
        LIEUTENANT,
        CAPTAIN,
        BATTALION_CHIEF,
        ASSISTANT_CHIEF,
        FIRE_CHIEF
    }

    private FirefighterRank rank;

    public Firefighter (String name, String surname, Human.Sex sex, int age, FirefighterRank rank){
        super(name, surname, sex, age);
        this.rank = rank;
    }
}
