import Passengers.Human;
import Transport.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class Road {

    public List<Vehicle<? extends Human>> carsInRoad;

    public Road(){
        this.carsInRoad = new ArrayList<>();
    }

    public int getCountOfHumans(){
        int CountOfHumans = 0;
        for (Vehicle<? extends Human> car : this.carsInRoad){
            CountOfHumans += car.getCurrentPassengersNumber();
        }
        return CountOfHumans;
    }
    public void addCarToRoad(Vehicle<? extends Human> vehicle){
        this.carsInRoad.add(vehicle);
    }
}
