package com.nolan.buildmypc;

public class PCCase {

    private String model;
    private String brand;
    private String material;
    private Dimension dimension;

    public PCCase(String model, String brand, String material, Dimension dimension){

    }

    public void pressPowerButton(){
        System.out.println("Case class: press the power button - Pressed");
    }

}
