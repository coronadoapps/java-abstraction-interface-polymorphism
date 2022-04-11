package com.sofka;

public class Spacecraft {
    private String name;
    private final int power;
    private int velocity;
    private boolean start;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Spacecraft(String name, int power){
        this.name = name;
        this.power = power;
        this.start = true;
    }

    public boolean isStart(){
        return this.start;
    }

    public void setStart(boolean start){
        this.start = start;
    }

    public void landing(){
        this.velocity = 0;
        this.start = false;
    }

    public int getPower(){
        return this.power;
    }

    public void speedUp(){
        this.velocity = this.velocity + 1;
    }
}
