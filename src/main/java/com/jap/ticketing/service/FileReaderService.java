/*
 *Author Name : Seetha Lakshmi.G.M
 *Date : 13-09-2022
 *Created With : IntelliJ IDEA Community Edition
 */


package com.jap.ticketing.service;

import com.jap.ticketing.model.ticket.Model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileReaderService {
    public List<Model> readFileLineByLine(String fileName) {
        List<Model> modelList = new ArrayList<>();
        fileName = "src/main/resources/resources/sample.csv";
        try (FileReader fileReader = new FileReader(fileName)) {
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            bufferedReader.readLine();
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] split = line.split(",");
                String scheduleNumber = split[0].trim();
                String routeNumber = split[1].trim();
                int ticketStopFromId = Integer.parseInt(split[2].trim());
                int ticketFromStopSequenceNumber = Integer.parseInt(split[3].trim());
                int ticketTillStopId = Integer.parseInt(split[4].trim());
                int ticketTillStopSeqNo = Integer.parseInt(split[5].trim());
                String ticketDate = split[6].trim();
                String ticketTime = split[7].trim();
                int totalTicketAmount = Integer.parseInt(split[8].trim());
                double travelledKm = Double.parseDouble(split[9].trim());
                modelList.add(new Model(scheduleNumber, routeNumber, ticketStopFromId, ticketFromStopSequenceNumber, ticketTillStopId, ticketTillStopSeqNo, ticketDate, ticketTime, totalTicketAmount, travelledKm));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return modelList;
    }
}
