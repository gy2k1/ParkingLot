package models;

import strategies.FeeCalculatorStrategyType;
import strategies.SlotAllocationStrategyType;

import java.util.List;

public class ParkingLot extends BaseModel{

    private String address;
    private List<Floor>parkingFloors;
    private List<VehicleType>vehicleTypes;
    private List<Gate> gates;
    private SlotAllocationStrategyType slotAllocationStrategyType;
    private FeeCalculatorStrategyType feeCalculatorStrategyType;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Floor> getParkingFloors() {
        return parkingFloors;
    }

    public void setParkingFloors(List<Floor> parkingFloors) {
        this.parkingFloors = parkingFloors;
    }

    public List<VehicleType> getVehicleTypes() {
        return vehicleTypes;
    }

    public void setVehicleTypes(List<VehicleType> vehicleTypes) {
        this.vehicleTypes = vehicleTypes;
    }

    public List<Gate> getGates() {
        return gates;
    }

    public void setGates(List<Gate> gates) {
        this.gates = gates;
    }

    public SlotAllocationStrategyType getSlotAllocationStrategyType() {
        return slotAllocationStrategyType;
    }

    public void setSlotAllocationStrategyType(SlotAllocationStrategyType slotAllocationStrategyType) {
        this.slotAllocationStrategyType = slotAllocationStrategyType;
    }

    public FeeCalculatorStrategyType getFeeCalculatorStrategyType() {
        return feeCalculatorStrategyType;
    }

    public void setFeeCalculatorStrategyType(FeeCalculatorStrategyType feeCalculatorStrategyType) {
        this.feeCalculatorStrategyType = feeCalculatorStrategyType;
    }
}
