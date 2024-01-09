package models;

import java.util.Date;

public class Ticket extends BaseModel {
    private Long ticketNumber;
    private Date entryTime;
    private Slot assignedSlot;
    private Floor assignedFloor;
    private Vehicle vehicle;

    public Long getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(Long ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public Date getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(Date entryTime) {
        this.entryTime = entryTime;
    }

    public Slot getAssignedSlot() {
        return assignedSlot;
    }

    public void setAssignedSlot(Slot assignedSlot) {
        this.assignedSlot = assignedSlot;
    }

    public Floor getAssignedFloor() {
        return assignedFloor;
    }

    public void setAssignedFloor(Floor assignedFloor) {
        this.assignedFloor = assignedFloor;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Gate getEntryGate() {
        return entryGate;
    }

    public void setEntryGate(Gate entryGate) {
        this.entryGate = entryGate;
    }

    private Gate entryGate;
}
