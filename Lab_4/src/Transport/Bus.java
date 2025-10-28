package Transport;

import Passengers.Human;

public class Bus extends Vehicle<Human>{
    public String rout;

    public Bus(String brand, String model, String rout, int maxSpeed, int maxPassengers) {
        super(brand, model, maxSpeed, maxPassengers);
        this.rout = rout;
    }
}
