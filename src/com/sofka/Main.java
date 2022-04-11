package com.sofka;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean flag;
        int option;

        do {
            menu();
            option = getOption();
            flag = evalOption(option);
        } while (flag);
    }

    private static void menu() {
        System.out.println("""
                   __
                   \\ \\_____
                ###[==_____>
                   /_/      __
                            \\ \\_____
                         ###[==_____>
                            /_/""");
        System.out.println("--------------------");
        System.out.println("-- My Spacecrafts --");
        System.out.println("--------------------");
        System.out.println("1. Simple Spacecraft");
        System.out.println("2. Space Shuttle");
        System.out.println("3. Uncrewed Spacecraft");
        System.out.println("4. Crewed Spacecraft");
        System.out.println("0. Exit");
    }

    private static int getOption() {
        System.out.print("Choose an option: ");
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }

    private static boolean evalOption(int option){
        String aux,autonomy;
        int powerA,weight,maxCap;
        Scanner input = new Scanner(System.in);

        switch (option){
            case 1:
                System.out.println("-- Simple Spacecraft --");
                System.out.println("Enter spacecraft name: ");
                aux = input.nextLine();
                System.out.println("Enter spacecraft power(HP): ");
                powerA = input.nextInt();
                Spacecraft spacecraft = new Shuttle(aux, powerA, 0, 0);
                System.out.println("New spacecraft name: " + spacecraft.getName() + " power: " + spacecraft.getPower() + " HP");
                return true;

            case 2:
                System.out.println("-- Space Shuttle --");
                System.out.println("Enter Space Shuttle name: ");
                aux = input.nextLine();
                System.out.println("Enter Space Shuttle power(HP): ");
                powerA = input.nextInt();
                System.out.println("Enter Space Shuttle weight(Ton): ");
                weight = input.nextInt();
                System.out.println("Enter Space Shuttle maximum capacity(Ton): ");
                maxCap = input.nextInt();
                Spacecraft shuttle = new Shuttle(aux, powerA, weight, maxCap);
                System.out.println("New Space Shuttle name: " + shuttle.getName() + " power: " + shuttle.getPower() + " HP");
                return true;

            case 3:
                System.out.println("-- Uncrewed Spacecraft --");
                System.out.println("Enter Uncrewed Spacecraft name: ");
                aux = input.nextLine();
                System.out.println("Enter Uncrewed Spacecraft power(HP): ");
                powerA = input.nextInt();
                System.out.println("Enter Space Shuttle autonomy: ");
                autonomy = input.nextLine();
                Spacecraft uncrewed = new UncrewedSpacecraft(aux, powerA, autonomy);
                System.out.println("New Space Shuttle name: " + uncrewed.getName() + " power: " + uncrewed.getPower() + " HP");
                return true;

            case 4:
                System.out.println("-- Crewed Spacecraft --");
                System.out.println("Enter Crewed Spacecraft name: ");
                aux = input.nextLine();
                System.out.println("Enter Crewed Spacecraft power(HP): ");
                powerA = input.nextInt();
                System.out.println("Enter Crewed Spacecraft capacity: ");
                maxCap = input.nextInt();
                Spacecraft crewed = new CrewedSpacecraft(aux, powerA, maxCap);
                System.out.println("New Space Shuttle name: " + crewed.getName() + " power: " + crewed.getPower() + " HP");
                return true;

            case 0:
                return false;

            default:
                System.out.println("Something went wrong!, try again.");
                return true;
        }
    }
}
