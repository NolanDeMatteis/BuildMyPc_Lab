package com.nolan.buildmypc;

public class Monitor {

    private String manufacturer, model;
    private Resolution resolution;
    private double screenSize;
    private int refreshRate;

    public Monitor(String manufacturer, String model, Resolution resolution, double screenSize, int refreshRate){
        this.manufacturer = manufacturer;
        this.model = model;
        this.resolution = resolution;
        this.screenSize = screenSize;
        this.refreshRate = refreshRate;
    }

}
