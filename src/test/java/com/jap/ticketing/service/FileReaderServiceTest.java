package com.jap.ticketing.service;

import com.jap.ticketing.model.ticket.Model;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.util.List;

class FileReaderServiceTest {
    FileReaderService fileReaderService = null;
    String fileName = "src/test/resources/sample.csv";

    @BeforeEach
    void setUp() {
        fileReaderService = new FileReaderService();
    }

    @AfterEach
    void tearDown() {
        fileReaderService = null;
    }

    @Test
    public void readFileLineByLineSuccess() throws ParseException {
        List<Model> expectedOutput = fileReaderService.readFileLineByLine(fileName);
        Assertions.assertEquals(49, expectedOutput.size());
    }

    @Test
    public void readFileLineByLineFailure() throws NumberFormatException {
        List<Model> expectedOutput = fileReaderService.readFileLineByLine(fileName);
        Assertions.assertNotEquals(50, expectedOutput.size());
    }
}