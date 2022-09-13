/*
 *Author Name : Seetha Lakshmi.G.M
 *Date : 13-09-2022
 *Created With : IntelliJ IDEA Community Edition
 */


package com.jap.ticketing.model.ticket;

import java.util.Objects;
import java.util.StringJoiner;

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

    public Model(String scheduleNumber, String routeNumber, int ticketStopFromId, int ticketFromStopSequenceNumber, int ticketTillStopId, int ticketTillStopSeqNo, String ticketDate, String ticketTime, int totalTicketAmount, double travelledKm) {
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

    public String getScheduleNumber() {
        return scheduleNumber;
    }

    public void setScheduleNumber(String scheduleNumber) {
        this.scheduleNumber = scheduleNumber;
    }

    public String getRouteNumber() {
        return routeNumber;
    }

    public void setRouteNumber(String routeNumber) {
        this.routeNumber = routeNumber;
    }

    public int getTicketStopFromId() {
        return ticketStopFromId;
    }

    public void setTicketStopFromId(int ticketStopFromId) {
        this.ticketStopFromId = ticketStopFromId;
    }

    public int getTicketFromStopSequenceNumber() {
        return ticketFromStopSequenceNumber;
    }

    public void setTicketFromStopSequenceNumber(int ticketFromStopSequenceNumber) {
        this.ticketFromStopSequenceNumber = ticketFromStopSequenceNumber;
    }

    public int getTicketTillStopId() {
        return ticketTillStopId;
    }

    public void setTicketTillStopId(int ticketTillStopId) {
        this.ticketTillStopId = ticketTillStopId;
    }

    public int getTicketTillStopSeqNo() {
        return ticketTillStopSeqNo;
    }

    public void setTicketTillStopSeqNo(int ticketTillStopSeqNo) {
        this.ticketTillStopSeqNo = ticketTillStopSeqNo;
    }

    public String getTicketDate() {
        return ticketDate;
    }

    public void setTicketDate(String ticketDate) {
        this.ticketDate = ticketDate;
    }

    public String getTicketTime() {
        return ticketTime;
    }

    public void setTicketTime(String ticketTime) {
        this.ticketTime = ticketTime;
    }

    public int getTotalTicketAmount() {
        return totalTicketAmount;
    }

    public void setTotalTicketAmount(int totalTicketAmount) {
        this.totalTicketAmount = totalTicketAmount;
    }

    public double getTravelledKm() {
        return travelledKm;
    }

    public void setTravelledKm(double travelledKm) {
        this.travelledKm = travelledKm;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Model model = (Model) o;
        return ticketStopFromId == model.ticketStopFromId && ticketFromStopSequenceNumber == model.ticketFromStopSequenceNumber && ticketTillStopId == model.ticketTillStopId && ticketTillStopSeqNo == model.ticketTillStopSeqNo && totalTicketAmount == model.totalTicketAmount && Double.compare(model.travelledKm, travelledKm) == 0 && Objects.equals(scheduleNumber, model.scheduleNumber) && Objects.equals(routeNumber, model.routeNumber) && Objects.equals(ticketDate, model.ticketDate) && Objects.equals(ticketTime, model.ticketTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(scheduleNumber, routeNumber, ticketStopFromId, ticketFromStopSequenceNumber, ticketTillStopId, ticketTillStopSeqNo, ticketDate, ticketTime, totalTicketAmount, travelledKm);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Model.class.getSimpleName() + "[", "]").add("scheduleNumber='" + scheduleNumber + "'").add("routeNumber='" + routeNumber + "'").add("ticketStopFromId=" + ticketStopFromId).add("ticketFromStopSequenceNumber=" + ticketFromStopSequenceNumber).add("ticketTillStopId=" + ticketTillStopId).add("ticketTillStopSeqNo=" + ticketTillStopSeqNo).add("ticketDate='" + ticketDate + "'").add("ticketTime='" + ticketTime + "'").add("totalTicketAmount=" + totalTicketAmount).add("travelledKm=" + travelledKm).toString();
    }
}
