package com.jap.ticketing;

import com.jap.ticketing.model.ticket.Model;
import com.jap.ticketing.service.DataService;
import com.jap.ticketing.service.FileReaderService;

import java.util.List;

public class Hello {
    public static void main(String[] args) {
        // Creating an instance of the FileReaderService class.
        FileReaderService fileReaderService = new FileReaderService();
        // Reading the file line by line and storing it in a list.
        List<Model> modelList = fileReaderService.readFileLineByLine("src/main/resources/resources/sample.csv");
        // Printing the list of models.
        System.out.println(modelList);

        // Creating an instance of the DataService class.
        DataService dataService = new DataService();
        // Calling the getSortedDistanceTravelled method in the DataService class and passing the modelList as a parameter.
        List<Model> sortedDistanceTravelled = dataService.getSortedDistanceTravelled(modelList);
        // Printing the sortedDistanceTravelled list.
        System.out.println(sortedDistanceTravelled);

        // Calling the getTotalAmountCollected method in the DataService class and passing the modelList as a parameter.
        int totalAmountCollected = dataService.getTotalAmountCollected(modelList);
        // Printing the total amount collected.
        System.out.println("totalAmountCollected = " + totalAmountCollected);
    }

}
