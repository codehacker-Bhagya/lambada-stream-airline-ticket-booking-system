package com.bhagya.practice.controller;

import com.bhagya.practice.service.BookingHistoryService;

import java.util.Scanner;

public class BookingHistoryController {

    private BookingHistoryService bookingHistoryService = new BookingHistoryService();
    private Scanner scanner = new Scanner(System.in);

    public void handleBookingHistory(){
        int option;

        do{
            System.out.println("Enter Your option");
            System.out.println("1. View Booking");
            System.out.println("2. Cancle Booking");
            System.out.println("0. Back to main Menu");

            option = Integer.parseInt(scanner.nextLine());

            switch (option){
                case 1:
                    bookingHistoryService.acceptBookingHistoryInfo();
                case 2:
                    bookingHistoryService.cancleYourBooking();
                case 0:
                    System.out.println("Back to Main Menu");
                default:
                    System.out.println("invalid option");
            }
        }while (option != 0);
    }
}
