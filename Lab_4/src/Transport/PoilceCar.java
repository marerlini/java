package Transport;

import Passengers.Policeman;

public class PoilceCar extends Car<Policeman>{

    public PoilceCar(String brand, String model, int maxSpeed, int maxPassengers) {
        super(brand, model, maxSpeed, maxPassengers);
    }
}
