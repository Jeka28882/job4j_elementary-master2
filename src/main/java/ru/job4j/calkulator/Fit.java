package ru.job4j.calkulator;

public class Fit {
    public static double manWeight(short height) {
        double rsl = (height - 100) * 1.15;
        return rsl;
    }

    public static double womanWeight(short height) {
        double rsl = (height - 110) * 1.15;
        return rsl;
    }

    public static void main(String[] args) {
        short height = 170;
        double man = Fit.manWeight(height);
        short height1 = 161;
        double women = Fit.womanWeight(height1);
        System.out.println("Women 161 is " + women);
        System.out.println("Man 170 is " + man);
    }
}
