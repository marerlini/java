package Transport;

import Passengers.Human;

public class Taxi extends Car<Human>{

    public Taxi(String brand, String model, int maxSpeed, int maxPassengers) {
        super(brand, model, maxSpeed, maxPassengers);
    }
}
