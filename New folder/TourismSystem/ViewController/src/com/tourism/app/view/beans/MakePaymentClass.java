package com.tourism.app.view.beans;

import Utils.ADFUtils;

import oracle.adf.view.rich.event.DialogEvent;

public class MakePaymentClass {
    public MakePaymentClass() {
    }

    public void confirmPayment(DialogEvent dialogEvent) {
        if(dialogEvent.getOutcome().equals(DialogEvent.Outcome.ok)){
                ADFUtils.findOperation("CreateInsert1").execute(); 
                ADFUtils.findOperation("Commit").execute(); 
                
            
            }
        
        // Add event code here...
    }
}
