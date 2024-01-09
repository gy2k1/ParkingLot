package dto;

import models.Ticket;

public class TicketResponseDTO {
    private Ticket ticket;
    private ResponseType responseStatus;
    private String failureMessage;

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public ResponseType getResponseStatus() {
        return responseStatus;
    }

    public void setResponseStatus(ResponseType responseStatus) {
        this.responseStatus = responseStatus;
    }

    public String getFailureMessage() {
        return failureMessage;
    }

    public void setFailureMessage(String failureMessage) {
        this.failureMessage = failureMessage;
    }
}
