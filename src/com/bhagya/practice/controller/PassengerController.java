package com.bhagya.practice.controller;

import com.bhagya.practice.service.PassengerService;

import java.util.Scanner;

public class PassengerController {

    private final PassengerService passengerService = new PassengerService();
    private Scanner sc = new Scanner(System.in);

    public void handlePassengerOperation() {
        int option;
        do {
            System.out.println("......Passenger Management......");
            System.out.println("1...Add Passenger");
            System.out.println("2...View Passenger");
            System.out.println("0...Back To Main Menu");

            option = Integer.parseInt(sc.nextLine());
            switch (option) {
                case 1:
                    passengerService.registerPassenger();
                    break;
                case 2:
                    passengerService.displayPassenger();
                    break;
                default:
                    System.out.println("invalid option");
            }

        } while (option != 0);
    }

}