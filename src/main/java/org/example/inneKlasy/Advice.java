package org.example;
public class Advice {

    public static int numberOfGivenAdvises = 0;

    Advice(String advice) {
        super();
        numberOfGivenAdvises++;
    }

    public int getCountAdvises() {
        return numberOfGivenAdvises;
    }

}