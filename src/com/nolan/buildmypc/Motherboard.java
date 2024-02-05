package com.nolan.buildmypc;

import java.util.Random;

public class Motherboard {
    private boolean isBooting;
    private boolean hasErrors;
    private boolean poweredOn;
    private String model, formFactor, processorSocket, operatingSystem;
    private int pCIESlot, memorySlots, maxMemory;

    public Motherboard(String model, String formFactor, String processorSocket, String operatingSystem, int pCIESlot, int memorySlots, int maxMemory){
        this.model = model;
        this.formFactor = formFactor;
        this.processorSocket = processorSocket;
        this.operatingSystem = operatingSystem;
        this.pCIESlot = pCIESlot;
        this.memorySlots = memorySlots;
        this.maxMemory = maxMemory;
    }

    public void simulateStartup(){
        Random rand = new Random();

        poweredOn = true;

        if(rand.nextInt(5) == 1){ // 1 in 5 chance to have an error
            hasErrors = true;
        }

        //load
        try {
            isBooting = true;
            fakeLoadingMessage(); // gives a loading screen with thread.sleep delay
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        // completion/fail
        isBooting = false;

    }

    private void fakeLoadingMessage() throws InterruptedException {
        int delayCycles = new Random().nextInt(5);

        System.out.print("Booting");
        for(int i = 0; i < delayCycles; i++){
            System.out.print(".");
            Thread.sleep(500);
        }

    }

    public int getMaxMemory() {
        return maxMemory;
    }

    public int getMemorySlots() {
        return memorySlots;
    }

    public int getpCIESlot() {
        return pCIESlot;
    }

    public String getFormFactor() {
        return formFactor;
    }

    public String getModel() {
        return model;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public String getProcessorSocket() {
        return processorSocket;
    }

    public boolean isBooting() {
        return isBooting;
    }

    public boolean hasErrors() {
        return hasErrors;
    }

    public boolean isPoweredOn(){
        return poweredOn;
    }
}
