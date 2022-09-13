/*
 *Author Name : Seetha Lakshmi.G.M
 *Date : 13-09-2022
 *Created With : IntelliJ IDEA Community Edition
 */


package com.jap.ticketing.model.ticket;

public class Model {

    private String scheduleNumber;
    private String routeNumber;
    private int ticketStopFromId;
    private int ticketFromStopSequenceNumber;
    private int ticketTillStopId;
    private int ticketTillStopSeqNo;
    private String ticketDate;
    private String ticketTime;
    private int totalTicketAmount;
    private double travelledKm;

    public Model() {
    }

    public Model(String scheduleNumber,
                 String routeNumber,
                 int ticketStopFromId,
                 int ticketFromStopSequenceNumber,
                 int ticketTillStopId,
                 int ticketTillStopSeqNo,
                 String ticketDate,
                 String ticketTime,
                 int totalTicketAmount,
                 double travelledKm) {
        this.scheduleNumber = scheduleNumber;
        this.routeNumber = routeNumber;
        this.ticketStopFromId = ticketStopFromId;
        this.ticketFromStopSequenceNumber = ticketFromStopSequenceNumber;
        this.ticketTillStopId = ticketTillStopId;
        this.ticketTillStopSeqNo = ticketTillStopSeqNo;
        this.ticketDate = ticketDate;
        this.ticketTime = ticketTime;
        this.totalTicketAmount = totalTicketAmount;
        this.travelledKm = travelledKm;
    }
}
