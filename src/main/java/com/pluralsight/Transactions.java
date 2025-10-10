package com.pluralsight;

import java.time.LocalDate;
import java.time.LocalTime;

public class Transactions {
    private LocalDate date;
    private LocalTime time;                                                                                 ///////'calTime time;
    private String description;
    private String vendor;
    private Float amount;

    public Transactions(LocalDate date, LocalTime time, String description, String vendor, Float amount) {
        this.date = date;
        this.time = time;
        this.description = description;
        this.vendor = vendor;
        this.amount = amount;
    }


}
