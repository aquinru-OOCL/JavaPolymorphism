package model;

public class Printer {

    public void print() {
        System.out.println("I can print");
    }

    public void print(String color) {
        System.out.println("Printing using " + color);
    }

    public void print(String firstColor, String secondColor, String thirdColor) {
        System.out.println("Printing using " + firstColor + ", " + secondColor + ", and " + thirdColor);
    }

}