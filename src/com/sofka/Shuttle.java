package com.sofka;

public class Shuttle extends Spacecraft{
    private int weight;
    private int maxCapacity;

    public Shuttle(String name, int power,int weight, int maxCapacity) {
        this.name = name;
        this.power = power;
        this.weight = weight;
        this.maxCapacity = maxCapacity;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

}
