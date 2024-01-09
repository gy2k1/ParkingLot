package controllers;

import dto.ResponseType;
import dto.TicketRequestDTO;
import dto.TicketResponseDTO;
import models.Ticket;
import services.TicketService;

public class TicketController {

    TicketService ticketService;

    public TicketController(TicketService ticketService){
        this.ticketService = ticketService;
    }
    public TicketResponseDTO issueTicket(TicketRequestDTO ticketRequestDTO){
        TicketResponseDTO ticketResponseDTO = new TicketResponseDTO();
        try {
            Ticket ticket = ticketService.issueTicket(ticketRequestDTO.getGateId(), ticketRequestDTO.getOwnerName(),ticketRequestDTO.getVehicleNum(), ticketRequestDTO.getVehicleType());
            ticketResponseDTO.setTicket(ticket);
            ticketResponseDTO.setResponseStatus(ResponseType.SUCCESS);
        }
        catch (Exception e){
            ticketResponseDTO.setFailureMessage(e.getMessage());
            ticketResponseDTO.setResponseStatus(ResponseType.FAILURE);
        }
        return ticketResponseDTO;
    }
}
