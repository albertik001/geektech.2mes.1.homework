package com.company;

public class Сar_showroom {
    public String getModel() {
        return model;
    }

    public String getAddress() {
        return address;
    }

    public String getTestdrive() {
        return testdrive;
    }

    private String model;
    private String address;
    private ColorConsole colorConsole;

    public Сar_showroom(String model, String address, String testdrive, ColorConsole colorConsole) {
        this.model = model;
        this.address = address;
        this.testdrive = testdrive;
        this.colorConsole = colorConsole;
    }

    public ColorConsole getColorConsole() {
        return colorConsole;
    }

    private String testdrive;

    public String getInfo() {
        return "Test drive: " + "\nColor: " + colorConsole +
                "\nCar showroom name: " + model +
                "\nCar showroom address: " + address;

    }
}