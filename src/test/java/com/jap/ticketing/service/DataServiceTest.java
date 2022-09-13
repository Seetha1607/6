package com.jap.ticketing.service;

import com.jap.ticketing.model.ticket.Model;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DataServiceTest {
    DataService dataService = null;
    FileReaderService fileReaderService = null;
    String fileName = "src/test/resources/sample.csv";

    @BeforeEach
    void setUp() {
        dataService = new DataService();
        fileReaderService = new FileReaderService();
    }

    @AfterEach
    void tearDown() {
        dataService = null;
        fileReaderService = null;
    }

    @Test
    public void getSortedDistanceTravelledSuccess() {
        List<Model> expectedOutput = fileReaderService.readFileLineByLine(fileName);
        assertEquals(49.5, dataService.getSortedDistanceTravelled(expectedOutput).get(0).getTravelledKm(), 0);
    }

    @Test
    public void getTotalAmountCollectedSuccess() {
        List<Model> expectedOutput = fileReaderService.readFileLineByLine(fileName);
        assertEquals(10348, dataService.getTotalAmountCollected(expectedOutput));
    }

}