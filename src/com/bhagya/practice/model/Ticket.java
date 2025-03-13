package com.bhagya.practice.model;

public class Ticket {

    private String seatPreference;
    private String bookingDate;
    private String destination;
    private String AddMeal;
    private int ticketID;
    private double TicketAmount;

    public Ticket() {
        super();
        this.seatPreference = seatPreference;
        this.destination = destination;
        this.AddMeal = AddMeal;
        this.TicketAmount = TicketAmount;
        this.ticketID = ticketID;
        this.bookingDate = bookingDate;
    }

    public void TicketInfo(){

        System.out.println("Seat Prefarence" + seatPreference + "Destnation" + destination + "Do You Want Add Meai" + AddMeal + "your ticket id id" + ticketID + "your Ticket Ammount" + TicketAmount);
    }

}
