import Passengers.Firefighter;
import Passengers.Human;
import Passengers.Policeman;
import Transport.Bus;
import Transport.FireTruck;
import Transport.PoilceCar;
import Transport.Taxi;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RoadTest {

    private Road road;
    private Policeman policeman;
    private Firefighter firefighter;
    private Human human1;
    private Human human2;

    private PoilceCar policeCar;
    private FireTruck fireTruck;
    private Bus bus;
    private Taxi taxi;


    @BeforeEach
    void setUp() {
        road = new Road();

        policeman = new Policeman("Іван", "Петренко", Human.Sex.MALE, 30, Policeman.PoliceRank.LIEUTENANT);
        firefighter = new Firefighter("Марія", "Шевченко", Human.Sex.FEMALE, 25, Firefighter.FirefighterRank.CAPTAIN);
        human1 = new Human("Сергій", "Коваль", Human.Sex.MALE, 40);
        human2 = new Human("Олена", "Бондар", Human.Sex.FEMALE, 22);

        policeCar = new PoilceCar("Ford", "Focus", 180, 2);
        fireTruck = new FireTruck("MAN", "TGE", 140, 6);
        bus = new Bus("Isuzu", "Ataman", "A092", 100, 30);
        taxi = new Taxi("Ford", "Focus", 100, 4);

    }


//  Перевіряєм, що різні типи машин можна додати на дорогу.
    @Test
    void testAddDifferentCarsToRoad() {
        road.addCarToRoad(policeCar);
        road.addCarToRoad(fireTruck);
        road.addCarToRoad(bus);
        road.addCarToRoad(taxi);

        assertEquals(4, road.carsInRoad.size());
    }


//  Перевіряєм правильність підрахунку загальної кількості людей.
    @Test
    void testGetCountOfHumans() {
        policeCar.addPassenger(policeman);
        taxi.addPassenger(human1);
        taxi.addPassenger(human2);

        road.addCarToRoad(policeCar);
        road.addCarToRoad(taxi);
        road.addCarToRoad(fireTruck);

        fireTruck.addPassenger(firefighter);

        assertEquals(4, road.getCountOfHumans());
    }
}