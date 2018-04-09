package com.tobidaada.medmanager.data.model;

import java.util.Date;

public class Medication {

    private String drugName;
    private String drugDescription;
    private int numberOfPills;
    private int numberOfTimesDaily;
    private Date startDate;
    private Date endDate;

    public Medication(String drugName, String drugDescription, int numberOfPills,
                      int numberOfTimesDaily, Date startDate, Date endDate) {

        this.drugName = drugName;
        this.drugDescription = drugDescription;
        this.numberOfPills = numberOfPills;
        this.numberOfTimesDaily = numberOfTimesDaily;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String getDrugName() {
        return drugName;
    }

    public String getDrugDescription() {
        return drugDescription;
    }

    public int getNumberOfPills() {
        return numberOfPills;
    }

    public int getNumberOfTimesDaily() {
        return numberOfTimesDaily;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }
}
