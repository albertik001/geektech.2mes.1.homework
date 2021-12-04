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


    public Car(String model, String address, String testdrive, String shassi, String dvijok, int rashodna100, ColorConsole colorConsole) {
        super(model, address, testdrive, colorConsole );
        this.shassi = shassi;
        this.dvijok = dvijok;
        this.rashod = rashodna100;
    }

    public Car(String model, String address, String testdrive, ColorConsole colorConsole) {
        super(model, address, testdrive,colorConsole );
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
        return "Name: " + getModel() +
                "\nShassi: " + shassi +
                "\nDvijok: " + dvijok +
                "\nRashod: " + rashod +
                "\nName: " + getModel() +
                "\nAddress: " + getAddress() +
                "\nTestDrive: " + getTestdrive() +
                "\nColor: " + getColorConsole();

    }
}
