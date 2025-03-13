package com.bhagya.practice.service;

import com.bhagya.practice.model.ConcessionTicket;

import java.util.Scanner;

public class ConcessionTicketService extends TicketService{


    Scanner scanner = new Scanner(System.in);
    //int concessionTicketAmount = 0;
    // int AgrProofId;



    public ConcessionTicket concessionTicket(){

        System.out.println("this concession ticket  only for those passenger whos age is above 60");

        System.out.println("pls Enter Your Age Proof ID");
        int AgeProofId = Integer.parseInt(scanner.nextLine());

        System.out.println("Thank You");

        ConcessionTicket concessionTicket = new ConcessionTicket();

        return concessionTicket;

    }
}
