package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        intro();
        budget();
    }

    public static void intro() {
        System.out.print("What is your name?");
        Scanner input = new Scanner(System.in);
        String name = input.next();
        System.out.print("Nice to meet you " + name + ". Where would you like to travel?");
        input = new Scanner(System.in);
        String destination = input.nextLine();
        System.out.print("Great. " + destination + " is a good place to go.");
    }

    public static void budget() {
        System.out.print(" How many days would you like to spend there?");
        Scanner input = new Scanner(System.in);
        int duration = input.nextInt();
        System.out.print("Fine. Let's see how to spend there " + duration + " days optimally. ");
        System.out.print("What is your budget currency?");
        input = new Scanner(System.in);
        String currency = input.nextLine();
        System.out.print("What is your planned budget value?");
        input = new Scanner(System.in);
        int budgetValue = input.nextInt();
        double dailyBudget = calculateBudgetValue(budgetValue,duration);
        System.out.print("I see, so that gives us " + dailyBudget + " " + currency + " per day. Let'see what offer I can find for you.");
    }

    public static double calculateBudgetValue(int budgetValue, int duration) {
        double dailyBudget = budgetValue/duration;
       return dailyBudget;
    }




}
