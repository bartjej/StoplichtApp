package com.example.bart.stoplichtapp.models;

/**
 * Created by mjboere on 28-11-2017.
 */
public class CourseModelJSON {

    private String name;
    private String ects;
    private String grade;
    private String period;

    public CourseModelJSON(String vc, String ae, String c, String p) {
        this.name = vc;
        this.ects = ae;
        this.grade = c;
        this.period = p;
    }

    public String getName(){
        return this.name;
    }

    public String getEcts(){
        return String.valueOf(ects);
    }

    // ADD GETTERS AND SETTERS - ONLY IF NEEDED !!}
}
