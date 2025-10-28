package Transport;

import Exeption.NoPassengerException;
import Exeption.VehicleFullException;
import Passengers.Human;

import java.util.ArrayList;
import java.util.List;

public abstract class Vehicle<T extends Human>{
    public String brand;
    public String model;
    public int maxSpeed;
    public int maxPassengers;
    private List<T> passengers;

    public Vehicle(String brand, String model, int maxSpeed, int maxPassengers){
        this.brand = brand;
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.maxPassengers = maxPassengers;
        this.passengers = new ArrayList<>();
    }

    public int getMaxPassengers() {
        return maxPassengers;
    }

    public int getCurrentPassengersNumber(){
        return passengers.size();
    }

    public void dropPassenger(T passenger) {
        if (!passengers.remove(passenger)) {
            throw new NoPassengerException("Passenger is not in vehicle.");
        }
    }

    public void addPassenger(T passenger) {
        if (passengers.size() < maxPassengers) {
            passengers.add(passenger);
        } else {
            throw new VehicleFullException("Vehicle is full.");
        }
    }


}
