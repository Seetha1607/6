package com.jap.ticketing.service;

import com.jap.ticketing.model.ticket.Model;

import java.util.List;

public interface TotalTicket {
    int totalCollectedTicketAmount(List<Model> modelList);
}
