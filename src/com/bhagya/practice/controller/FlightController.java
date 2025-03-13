package com.bhagya.practice.controller;

import com.bhagya.practice.service.FlightService;

import java.util.Scanner;

public class FlightController {

    private final FlightService flightService = new FlightService();
    private Scanner scanner = new Scanner(System.in);

    public void handleFlightOperation(){
        int option;

        do{
            System.out.println("Enter Your Option");
            System.out.println("1. Flight Information");
            System.out.println("2. Display Flight");
            System.out.println("0. Back to main menu");

            option = Integer.parseInt(scanner.nextLine());

            switch(option){
                case 1:
                    flightService.FlightInformation();
                    break;
                case 2:
                    flightService.displayFlight();
                    break;
                default:
                    System.out.println("Invalid option");

            }

        }while (option != 0);


    }
}
