package com.example.bart.stoplichtapp.models;

import java.util.Date;

public class CourseModel {

    private String bijeenkomstNaam;
    private Date datum;

    public CourseModel(String bn, Date d) {
        this.bijeenkomstNaam = bn;
        this.datum = d;
    }

    public String getName(){
        return bijeenkomstNaam;
    }

    public String getEcts(){
        return String.valueOf(datum);
    }

    // ADD GETTERS AND SETTERS - ONLY IF NEEDED !!}
}
