package com.nolan.buildmypc;

public class PC {

    private PCCase pCCase; // I dont like having the abbreviation com.nolan.buildmypc.PC camel case like this, but I was told this is the proper way
    private Monitor monitor;
    private Motherboard motherboard;

    public PC(Case pCCase, Monitor monitor, Motherboard motherboard){
        this.pCCase = pCCase;
        this.monitor = monitor;
        this.motherboard = motherboard;

    }

    public PCCase getCase(){
        return pCCase;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }
}
