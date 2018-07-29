package com.example.android.quakereport;

public class Earthquake {

    private double magnitude;
    private String location;
    private Long time;
    private String url;

    /**
     * Constructs a new {@link Earthquake} object.
     *
     * @param magnitude the size of the earthquake
     * @param location the city location of the earthquake
     * @param time time in milliseconds (from the Epoch) when the earthquake happened
     * @param url url address for the website with more information about the earthquake
     */
    public Earthquake(double magnitude, String location, Long time, String url){
        this.magnitude = magnitude;
        this.location = location;
        this.time = time;
        this.url = url;
    }

    //getter methods
    public double getMagnitude(){
        return magnitude;
    }

    public String getLocation() {
        return location;
    }

    /**
     *
     * @return time in milliseconds
     */
    public Long getTime() {
        return time;
    }

    public String getUrl() {
        return url;
    }
}
