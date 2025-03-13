package com.bhagya.practice.controller;

import com.bhagya.practice.service.FlightService;
import com.bhagya.practice.service.TicketService;

import java.util.Scanner;

public class TicketController {

    private final TicketService ticketService = new TicketService();
    private final FlightService flightService = new FlightService();
    private Scanner sc = new Scanner(System.in);

    public void handleTicketOperations(){
        int option;

        do{
            System.out.println("Pls Select Your Option");
            System.out.println("......Ticket Managemant...........");
            System.out.println("1. Book ticket...");
            System.out.println("2. View Ticket");
            System.out.println("3. View Flight");
            System.out.println("0. Back to main menu");

            option = Integer.parseInt(sc.nextLine());

            switch (option) {
                case 1:
                    ticketService.TicketBooking();
                    break;
                case 2:
                    ticketService.displayTicket();
                    break;
                case 3:
                    flightService.displayFlight();
                    break;
                default:
                    System.out.println("Invalid option ");

            }

        } while (option != 0);



    }
}
