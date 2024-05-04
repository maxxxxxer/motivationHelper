package org.example.inneKlasy;
public class Advice {
public String advice;

   public static int numberOfGivenAdvises = 0;

    public Advice(String advice) {
        this.advice = advice;
        numberOfGivenAdvises++;
    }

    public static int getCountAdvises() {
       return numberOfGivenAdvises;
    }

// HOMEWORK below:





}
