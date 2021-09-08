package com.company;

public class Main {


    public static void main(String[] args) {
        // Think Java - Exercise 4.1

        String day = "Friday";
        String month = "September";
        int date = 03;
        int year = 2021;
        printAmerican(day, month, date, year);
        printEuropean(day, date, month, year);

    }
    public static void printAmerican(String day, String month, int date, int year) {
        System.out.print("American format: " + day + "," + " " + month + " " + date + "," + " " + year + "\n");

    }
    public static void printEuropean(String day, int date, String month, int year) {
            System.out.print("European format: " + day + "," + " " + date + " " + month + "," + " " + year);

    }
}
