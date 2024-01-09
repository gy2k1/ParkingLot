package services;

import exception.GateNotFoundException;
import models.*;
import repositories.GateRepository;
import repositories.ParkingLotRepository;
import repositories.TicketRepository;
import repositories.VehicleRepository;
import strategies.SlotAllocationStrategyType;

import java.util.Date;
import java.util.Optional;

public class TicketService {

    private VehicleRepository vehicleRepository;
    private GateRepository gateRepository;
    private ParkingLotRepository parkingLotRepository;

    private TicketRepository ticketRepository;

    public TicketService(VehicleRepository vehicleRepository,GateRepository gateRepository,ParkingLotRepository parkingLotRepository, TicketRepository ticketRepository ){
        this.ticketRepository = ticketRepository;
        this.parkingLotRepository = parkingLotRepository;
        this.vehicleRepository = vehicleRepository;
        this.gateRepository = gateRepository;
    }
    public Ticket issueTicket(Long gateId,String ownerName, String vehicleNum, VehicleType vehicleType){
        Ticket ticket = new Ticket();
        ticket.setEntryTime(new Date());
        Optional<Vehicle> optionalVehicle = vehicleRepository.getVehicleByNumber(vehicleNum);
        Optional<Gate> optionalGate = gateRepository.findGateById(gateId);
        Vehicle savedVehicle;
        if(optionalVehicle.isEmpty()){
            Vehicle vehicle = new Vehicle();
            vehicle.setVehicleType(vehicleType);
            vehicle.setOwnerName(ownerName);
            vehicle.setVehiclenum(vehicleNum);
            savedVehicle=vehicle;
        } else {
            savedVehicle=optionalVehicle.get();
        }

        if(optionalGate.isEmpty()){
            throw new GateNotFoundException();
        }

        SlotAllocationStrategyType slotAllocationStrategy = parkingLotRepository.getParkingLotByGate(optionalGate.get()).getSlotAllocationStrategyType();
        ticket.setVehicle(savedVehicle);
        Slot assignedSlot = slotAllocationStrategy.getSlotAllocationStrategy();

        ticket.setAssignedSlot(assignedSlot);
        ticket=ticketRepository.saveTicket(ticket);
        return ticket;
    }
}
