package repositories;

import models.Vehicle;

import java.util.Map;
import java.util.Optional;

public class VehicleRepository {
    public Optional<Vehicle> getVehicleByNumber(String vehicleNum){
        return Optional.empty();
    }

    public Vehicle saveVehicle(Vehicle vehicle){
        return vehicle;
    }
}
