package com.nolan.buildmypc;

public class PC {

    private PCCase pCCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public PC(PCCase pCCase, Monitor monitor, Motherboard motherboard){
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

    @Override
    public String toString(){
        return "~~~~~~~~PC Info~~~~~~~~\n"
            + "PC Case: " + pCCase.toString()
            + "Monitor: " + pCCase.toString()
            + "Motherboard: " + pCCase.toString()
            + "PC Status: " + getStatus();
    }

    private String getStatus(){
        String status;

        if(this.getMotherboard().isBooting()){
            status = "Booting...";
        }else if(this.getMotherboard().hasErrors()){
            status = "Failed to boot";
        }else{
            status = "Operational";
        }

        return status;
    }
}
