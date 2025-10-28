import Exeption.*;
import Passengers.*;
import Transport.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class VehicleTest {

    private Human human;
    private Policeman policeman1;
    private Policeman policeman2;
    private Firefighter firefighter;

    private PoilceCar policeCar;
    private FireTruck fireTruck;
    private Bus bus;
    private Car<Human> car;
    private Taxi taxi;

    @BeforeEach
    void setUp() {
        human = new Human("Maria", "sfnerujgn", Human.Sex.FEMALE, 18);
        policeman1 = new Policeman(
                "Іван", "Петренко",
                Human.Sex.MALE, 30,
                Policeman.PoliceRank.LIEUTENANT
        );
        policeman2 = new Policeman(
                "Марія", "Шевченко",
                Human.Sex.FEMALE, 25,
                Policeman.PoliceRank.SERGEANT
        );
        firefighter = new Firefighter(
                "Марія", "Шевченко",
                Human.Sex.FEMALE, 25,
                Firefighter.FirefighterRank.ASSISTANT_CHIEF
        );

        policeCar = new PoilceCar("Ford", "Focus", 180, 2);
        fireTruck = new FireTruck("Ford", "Focus", 180, 2);
        bus = new Bus("Ford", "Focus", "45A", 60, 18);
        car = new Car<>("Ford", "Focus", 100, 4);
        taxi = new Taxi("Ford", "Focus", 100, 4);

    }

//  Додаєм поліцейського в поліцейську машину
    @Test
    void testAddPolicemanSuccessfully() {
        policeCar.addPassenger(policeman1);
        assertEquals(1, policeCar.getCurrentPassengersNumber());
    }

    //  Додаєм пожежника в пожежну машину
    @Test
    void testAddFirefighterSuccessfully() {
        fireTruck.addPassenger(firefighter);
        assertEquals(1, fireTruck.getCurrentPassengersNumber());
    }

//    Додаєм всіх в автобус
    @Test
    void testAddEveryoneBus(){
        bus.addPassenger(human);
        bus.addPassenger(policeman1);
        bus.addPassenger(policeman2);
        bus.addPassenger(firefighter);

        assertEquals(4, bus.getCurrentPassengersNumber());
    }

//   Додаєм всіх в машину
    @Test
    void testAddEveryoneCar(){
        car.addPassenger(human);
        car.addPassenger(policeman1);
        car.addPassenger(policeman2);
        car.addPassenger(firefighter);

        assertEquals(4, car.getCurrentPassengersNumber());
    }

//   Додаєм всіх в таксі
    @Test
    void testAddEveryoneTaxi(){
        taxi.addPassenger(human);
        taxi.addPassenger(policeman1);
        taxi.addPassenger(policeman2);
        taxi.addPassenger(firefighter);

        assertEquals(4, taxi.getCurrentPassengersNumber());
    }

//  Отримуєм кількість місць, додаєм людей більше ніж місць
    @Test
    void testAddPassengerToFullCarThrowsException() {
        assertEquals(2,  policeCar.getMaxPassengers());

        policeCar.addPassenger(policeman1);
        policeCar.addPassenger(policeman2);

        assertEquals(2, policeCar.getCurrentPassengersNumber());

        Policeman policeman3 = new Policeman(
                "Сергій", "Коваль",
                Human.Sex.MALE, 40,
                Policeman.PoliceRank.MAJOR
        );

        assertThrows(VehicleFullException.class, () -> policeCar.addPassenger(policeman3));
    }

//    Висажуєм пасажира та пасажира якого вже нема
    @Test
    void testDropPassengerSuccessfully() {
        policeCar.addPassenger(policeman1);
        assertEquals(1, policeCar.getCurrentPassengersNumber());

        assertThrows(NoPassengerException.class, () -> policeCar.dropPassenger(policeman2));

        policeCar.dropPassenger(policeman1);

        assertEquals(0, policeCar.getCurrentPassengersNumber());
    }
}