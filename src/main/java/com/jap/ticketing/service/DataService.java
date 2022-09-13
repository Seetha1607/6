/*
 *Author Name : Seetha Lakshmi.G.M
 *Date : 13-09-2022
 *Created With : IntelliJ IDEA Community Edition
 */


package com.jap.ticketing.service;

import com.jap.ticketing.model.ticket.Model;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class DataService {
    public List<Model> getSortedDistanceTravelled(List<Model> serviceData) {
        Comparator<Model> distanceComparator = (((o1, o2) -> Double.compare(o2.getTravelledKm(), o1.getTravelledKm())));
        serviceData.sort(distanceComparator);
        for (Model distance : serviceData)
            System.out.println(distance.getTravelledKm());
        return serviceData;
    }

    /**
     * > The function takes a list of models and returns the total amount collected from all the models
     *
     * @param modelList List of Model objects
     * @return The return type is an int.
     */
    public int getTotalAmountCollected(List<Model> modelList) {
        TotalTicket ticket = modelList1 -> {
            int sum = 0;
            Iterator<Model> iterator = modelList1.iterator();
            while (iterator.hasNext()) {
                Model next = iterator.next();
                sum = sum + next.getTotalTicketAmount();
            }
            return sum;
        };
        return ticket.totalCollectedTicketAmount(modelList);
    }
}