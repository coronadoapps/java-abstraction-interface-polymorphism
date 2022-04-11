package com.sofka;

public abstract class Spacecraft {
    protected String name;
    protected int power;
    private int velocity;
    private boolean start;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isStart(){
        return this.start;
    }

    public void setStart(boolean start){
        this.start = start;
    }

    public abstract void landing();

    public int getPower(){
        return this.power;
    }

    public void speedUp(){
        this.velocity = this.velocity + 1;
    }
}
