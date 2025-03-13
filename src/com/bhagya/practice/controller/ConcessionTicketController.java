package com.bhagya.practice.controller;

import com.bhagya.practice.service.ConcessionTicketService;

import java.util.Scanner;

public class ConcessionTicketController {

    private final ConcessionTicketService concessionTicketService = new ConcessionTicketService();
    private final Scanner scanner = new Scanner(System.in);

    public void concessionTicketBooking(){

        int option;

        do{
            System.out.println("Enter your option");
            System.out.println("1. Book Ticket");
            System.out.println("2. view ticket");
            System.out.println("0 Back to Main Menu");

            option = Integer.parseInt(scanner.nextLine());

            switch (option) {

                case 1:
                    concessionTicketService.concessionTicket();
                    break;
                case 2:
                    concessionTicketService.displayTicket();
                    break;
                default:
                    System.out.println("Invalid option");
            }
        }while (option != 0);


    }
}
