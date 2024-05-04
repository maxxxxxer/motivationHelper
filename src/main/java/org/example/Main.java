package org.example;
import org.example.inneKlasy.Advice;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        // First interaction

        System.out.println("Hello, what is your name?");
        Scanner usernameRaw = new Scanner(System.in);
        String username = usernameRaw.next();

        String firstQuestion = "Nice to meet you, " + username + ". Are you struggling with Java learning? Please type \"Yes\" or \"No\"";
        String firstAnswerNo = "Great, so nice to hear that! So what are you waiting for? Go ahead and become a master of Java!";

        // Available advices

        Advice advice1 = new Advice("If you feel stressed, " + username + ", try to move your attention to the something different for a while - it will reduce tension.");
        Advice advice2 = new Advice(username + ", are you a perfectionist? Please remember that only God is perfect. Until you have become a God, do not expect from yourself to ideally learn everything.");
        Advice advice3 = new Advice("Try to learn and code in small iterations, " + username + ". Do not try to \"eat\" a big amount of tasks at the moment");
        Advice advice4 = new Advice(username + ", speak to the close person who can support you in this not very easy process of Java learning");
        Advice advice5 = new Advice("Hug your partner, " + username + ". Or your pet. Or hug yourself - did you know that it also works?");
        Advice advice6 = new Advice(username + ", inhale deeply and exhale slowly - this trick is triggering Bony labyrinth in your body and leads to relaxation");
        Advice advice7 = new Advice("Stand up and move your body, " + username + ". Did you hear about poses of power? If you will pose like you are big bear with big arms pulling from top to bottom, it will give you feel of power! Just try it");

        // Putting advices into Array

        Object[] advices = new String[9];
        advices[0] = advice1.advice;
        advices[1] = advice2.advice;
        advices[2] = advice3.advice;
        advices[3] = advice4.advice;
        advices[4] = advice5.advice;
        advices[5] = advice6.advice;
        advices[6] = advice7.advice;


        // Program starts

        System.out.println(firstQuestion);

        Scanner answer = new Scanner(System.in);
        String answerScannerToString = answer.next();

        String Yes = "Yes";
        String yes = "yes";
        String YES = "YES";
        String No = "No";
        String no = "no";
        String NO = "NO";

        int i=0;


        while (answerScannerToString.equals(Yes) || answerScannerToString.equals(yes) || answerScannerToString.equals(YES)) {
            System.out.println(advices[i]);
            i++; if (i==7) {break;}
            System.out.println("Do you need more advices, my friend?");
            Scanner answerNext = new Scanner(System.in);
            answerScannerToString = answerNext.next();}

            if (answerScannerToString.equals(No) || answerScannerToString.equals(no) || answerScannerToString.equals(NO)) {
                System.out.println(firstAnswerNo);
            }
                if (i==7) {System.out.println("There is no more advices at the moment. Try to figure out something on yourself:)");}
                else {
                System.out.println("Incorrect text has been provided. Run the program again");
            }

        }









    }





















