package com.example.bart.stoplichtapp.models;

public class CourseModel {

    private String vakCode;
    private String aantalECTS;
    private String cijfer;
    private String periode;

    public CourseModel(String vc, String ae, String c, String p) {
        this.vakCode = vc;
        this.aantalECTS = ae;
        this.cijfer = c;
        this.periode = p;
    }

    public String getName(){
        return vakCode;
    }

    public String getEcts(){
        return String.valueOf(aantalECTS);
    }

    // ADD GETTERS AND SETTERS - ONLY IF NEEDED !!}
}
