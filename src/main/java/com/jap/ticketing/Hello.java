package com.jap.ticketing;

import com.jap.ticketing.model.ticket.Model;
import com.jap.ticketing.service.FileReaderService;

import java.util.List;

public class Hello {
    public static void main(String[] args) {
        FileReaderService fileReaderService = new FileReaderService();
        List<Model> modelList = fileReaderService.readFileLineByLine("src/main/resources/resources/sample.csv");
        System.out.println(modelList);
    }
}
