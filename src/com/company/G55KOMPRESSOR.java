package com.company;

public final class G55KOMPRESSOR extends Car {
    private int tire;
    private String tires;

    public int getTire() {
        return tire;
    }

    public String getTires() {
        return tires;
    }

    public G55KOMPRESSOR(String name, String address, String testdrive, String shassi, String dvijok, int rashod, int tire, String tires, ColorConsole colorConsole) {
        super(name, address, testdrive, shassi, dvijok, rashod, colorConsole);
        this.tire = tire;
        this.tires = tires;
    }
    public String getInfo() {
        return "Name: " + getName() +
                "\nShassi: " + getShassi() +
                "\nDvijok: " + getDvijok() +
                "\nRashod: " + getRashod() +
                "\nTire: " + getTire() +
                "\nTires: " + getTires() +
                "\nAddress: " + getAddress() +
                "\nTestDrive: " + getTestdrive()+
                "\nColor: " + getColorConsole();

    }
}
