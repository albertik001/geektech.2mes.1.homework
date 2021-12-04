package com.company;

public class Main {

    public static void main(String[] args) {

        Car car = new Car("G63", "DORDOI", "Мягкая", "4WD", "M156", 40, ColorConsole.MATT_BLACK);
        System.out.println(car.getInfo());
        car.avtosignal("BEEP!!", 3);
        System.out.println("-----------------------------------");
        G55KOMPRESSOR g55KOMPRESSOR = new G55KOMPRESSOR("G55KOMRESSOR", "БЦ VICTORY", "Жесткая", "4WD",
                "M113K", 35, 19, "APPOLON", ColorConsole.MATT_BLACK);
        System.out.println(g55KOMPRESSOR.getInfo());
        g55KOMPRESSOR.avtosignal("BEEEEEEP!");
        System.out.println("-----------------------------------");
        G55KOMPRESSOR g55KOMPRESSOR1 = new G55KOMPRESSOR("G65", "TSUM", "Резвая", "4WD", "AMG6.5", 40, 20, "MONOBLOKI", ColorConsole.MATT_GRAY);
        System.out.println(g55KOMPRESSOR1.getInfo());
        g55KOMPRESSOR1.avtosignal("ТАХ! ТАХ! ТАХ!", 2);

    }
}
