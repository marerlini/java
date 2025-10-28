package Transport;

import Passengers.Human;

public class Car<T extends Human> extends Vehicle<T>{

    public Car(String brand, String model, int maxSpeed, int maxPassengers) {
        super(brand, model, maxSpeed, maxPassengers);
    }

}
