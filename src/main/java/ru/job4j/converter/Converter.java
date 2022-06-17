package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(int value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(int value) {
        float rsl = value / 60;
        return rsl;

    }

    public static void main(String[] args) {
        int euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");
        int dollar = Converter.rubleToDollar(140);
        System.out.println("140 rubles are " + dollar + " dollars.");
    }
}

