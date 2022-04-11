package com.sofka;

public class CrewedSpacecraft extends Spacecraft{
    private int crewCapacity;

    public CrewedSpacecraft(String name, int power, int crewCapacity) {
        this.name = name;
        this.power = power;
        this.crewCapacity = crewCapacity;
    }

    public int getCrewCapacity() {
        return crewCapacity;
    }

    public void setCrewCapacity(int crewCapacity) {
        this.crewCapacity = crewCapacity;
    }
}
