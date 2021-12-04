package com.company;

public class Сar_showroom {
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getTestdrive() {
        return testdrive;
    }

    private String name;
    private String address;
    private ColorConsole colorConsole;

    public Сar_showroom(String name, String address, String testdrive, ColorConsole colorConsole) {
        this.name = name;
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
                "\nCar showroom name: " + name +
                "\nCar showroom address: " + address;

    }
}