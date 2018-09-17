package com.example.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String q1, q2, q3, q4, q5;

            Scanner in = new Scanner(System.in);

            do {
                System.out.println("Who was the mascot for Playstation in the 90s/00s?\n");
                System.out.println("a. Croc");
                System.out.println("b. Gex");
                System.out.println("c. Crash Bandicoot");
                System.out.println("d. Spyro");
                q1 = in.next();

                switch (q1) {
                    case "c":
                        System.out.println("Correct!\n");
                        break;
                    case "a":
                    case "b":
                    case "d":
                        System.out.println("Incorrect\n");
                        break;
                    default:
                        System.out.println("Invalid answer, try again\n");
                        break;
                }
            } while (!q1.equalsIgnoreCase("c"));

            do {
                System.out.println("Who is the mascot for Xbox?\n");
                System.out.println("a. Blinx");
                System.out.println("b. Master Chief");
                System.out.println("c. Battletoads");
                System.out.println("d. Banjo Kazooie");
                q2 = in.next();

                switch (q2) {
                    case "b":
                        System.out.println("Correct!\n");
                        break;
                    case "a":
                    case "c":
                    case "d":
                        System.out.println("Incorrect\n");
                        break;
                    default:
                        System.out.println("Invalid answer, try again\n");
                        break;
                }
            } while (!q2.equalsIgnoreCase("b"));

            do {
                System.out.println("Who is the mascot for Nintendo?\n");
                System.out.println("a. Mario");
                System.out.println("b. Link");
                System.out.println("c. Kirby");
                System.out.println("d. Donkey Kong");
                q3 = in.next();

                switch (q3) {
                    case "a":
                        System.out.println("Correct!\n");
                        break;
                    case "b":
                    case "c":
                    case "d":
                        System.out.println("Incorrect\n");
                        break;
                    default:
                        System.out.println("Invalid answer, try again\n");
                        break;
                }
            } while (!q3.equalsIgnoreCase("a"));

            do {
                System.out.println("Who is the mascot for Sega?\n");
                System.out.println("a. Vectorman");
                System.out.println("b. Ristar");
                System.out.println("c. Alex Kidd");
                System.out.println("d. Sonic");
                q4 = in.next();

                switch (q4) {
                    case "d":
                        System.out.println("Correct!\n");
                        break;
                    case "a":
                    case "b":
                    case "c":
                        System.out.println("Incorrect\n");
                        break;
                    default:
                        System.out.println("Invalid answer, try again\n");
                        break;
                }
            } while (!q4.equalsIgnoreCase("d"));

            do {
                System.out.println("Who is the mascot for Capcom?\n");
                System.out.println("a. Ryu");
                System.out.println("b. Mega Man");
                System.out.println("c. Dante");
                System.out.println("d. Chris Redfield");
                q5 = in.next();

                switch (q5) {
                    case "b":
                        System.out.println("Correct!\n");
                        break;
                    case "a":
                    case "c":
                    case "d":
                        System.out.println("Incorrect\n");
                        break;
                    default:
                        System.out.println("Invalid answer, try again\n");
                        break;
                }
            } while (!q5.equalsIgnoreCase("b"));
        }
    }
