package ru.job4j.calkulator;

public class ArgMethod {
        public static void hello(String name, int age) {
            System.out.println("rer, " +  name + ", age = " + age);
        }

        public static void main(String[] args) {
            String name = "Job4j";
            int age = 6;
            ArgMethod.hello(name, age);
        }
}
