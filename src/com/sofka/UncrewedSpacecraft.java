package com.sofka;

public class UncrewedSpacecraft extends Spacecraft{
    private String autonomy; //remote controlled, remote guided or autonomous

    public UncrewedSpacecraft(String name, int power, String autonomy) {
        super(name, power);
        this.autonomy = autonomy;
    }

    public String getAutonomy() {
        return autonomy;
    }

    public void setAutonomy(String autonomy) {
        this.autonomy = autonomy;
    }
}
