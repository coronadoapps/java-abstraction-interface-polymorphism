package com.sofka;

public class CrewedSpacecraft extends Spacecraft{
    private int crewCapacity;

    public CrewedSpacecraft(String name, int power, int crewCapacity) {
        super(name, power);
        this.crewCapacity = crewCapacity;
    }

    public int getCrewCapacity() {
        return crewCapacity;
    }

    public void setCrewCapacity(int crewCapacity) {
        this.crewCapacity = crewCapacity;
    }
}
