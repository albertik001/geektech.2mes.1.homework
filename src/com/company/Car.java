package com.company;

public class Car extends Сar_showroom {
    private String shassi;
    private String dvijok;
    private int rashod;


    public String getShassi() {
        return shassi;
    }

    public String getDvijok() {
        return dvijok;
    }

    public int getRashod() {
        return rashod;
    }


    public Car(String name, String address, String testdrive, String shassi, String dvijok, int rashod, ColorConsole colorConsole) {
        super(name, address, testdrive, colorConsole );
        this.shassi = shassi;
        this.dvijok = dvijok;
        this.rashod = rashod;
    }

    public Car(String name, String address, String testdrive, ColorConsole colorConsole) {
        super(name, address, testdrive,colorConsole );
    }
    public void avtosignal(String signal){
        System.out.println(signal);
    }
    public final void avtosignal(String signal, int count){
        for (int i = 0; i < count; i++) {
            System.out.println(signal);
        }
    }
    public String getInfo() {
        return "Name: " + getName() +
                "\nShassi: " + shassi +
                "\nDvijok: " + dvijok +
                "\nRashod: " + rashod +
                "\nName: " + getName() +
                "\nAddress: " + getAddress() +
                "\nTestDrive: " + getTestdrive() +
                "\nColor: " + getColorConsole();

    }
}
