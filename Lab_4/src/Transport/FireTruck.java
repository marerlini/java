package Transport;

import Passengers.Firefighter;

public class FireTruck extends Car<Firefighter>{

    public FireTruck(String brand, String model, int maxSpeed, int maxPassengers) {
        super(brand, model, maxSpeed, maxPassengers);
    }
}
