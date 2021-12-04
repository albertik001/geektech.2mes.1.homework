package com.company;

import java.util.Random;

public final class G55KOMPRESSOR extends Car {
    private int tire;
    private String tires;

    public int getTire() {
        return tire;
    }

    public String getTires() {
        return tires;
    }
    public void popkorn (String srabotal,String vyhlop) {
        Random random = new Random();
        int srt = random.nextInt(5000);
        if (srt >= 4000) {
            System.out.print(srabotal);
            System.out.println(vyhlop);
        }
    }
    public G55KOMPRESSOR(String model, String address, String testdrive, String shassi, String dvijok, int rashodna100, int tire, String tires, ColorConsole colorConsole) {
        super(model, address, testdrive, shassi, dvijok, rashodna100, colorConsole);
        this.tire = tire;
        this.tires = tires;
    }
    public String getInfo() {
        return "Name: " + getModel() +
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
