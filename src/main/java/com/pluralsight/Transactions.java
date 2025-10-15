package com.pluralsight;

import java.time.LocalDate;
import java.time.LocalTime;

//what we need  to keep track  of:
public class Transactions {
    private LocalDate date;
    private LocalTime time;
    private String description;
    private String vendor;
    private Double amount;

//constructors:
    public Transactions(LocalDate date, LocalTime time, String description, String vendor, Double amount) {
        this.date = date;
        this.time = time;
        this.description = description;
        this.vendor = vendor;
        this.amount = amount;
    }


//getters and setters:
    public LocalDate getDate() {
        return date;
    }

    public LocalTime getTime() {
        return time;
    }

    public String getDescription() {
        return description;
    }

    public String getVendor() {
        return vendor;
    }

    public Double getAmount() {
        return amount;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }
}

