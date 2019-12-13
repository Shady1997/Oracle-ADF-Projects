package com.tourism.app.view.beans;

import Utils.ADFUtils;

import oracle.adf.model.binding.DCIteratorBinding;

public class addPassengerClass {
    public addPassengerClass() {
    }

    public String backAction() {
        // Add event code here...
        DCIteratorBinding itr = ADFUtils.findIterator("Passengers3Iterator");
        itr.getCurrentRow().remove();
        return "backToReservation";
    }
}
