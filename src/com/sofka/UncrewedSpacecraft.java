package com.sofka;

public class UncrewedSpacecraft extends Spacecraft{
    private String autonomy; //remote controlled, remote guided or autonomous

    public UncrewedSpacecraft(String name, int power, String autonomy) {
        this.name = name;
        this.power = power;
        this.autonomy = autonomy;
    }

    public String getAutonomy() {
        return autonomy;
    }

    public void setAutonomy(String autonomy) {
        this.autonomy = autonomy;
    }
}
