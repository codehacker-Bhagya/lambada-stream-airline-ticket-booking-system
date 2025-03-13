package com.bhagya.practice.service;

import com.bhagya.practice.model.BookingHistory;

import java.util.HashMap;
import java.util.Scanner;

public class BookingHistoryService {

    private HashMap<Integer , BookingHistory> bookinghistoryservices = new HashMap<>();
    private Scanner sc = new Scanner(System.in);

    public void acceptBookingHistoryInfo(){
        BookingHistory bookingHistory = new BookingHistory();

        System.out.println("Enter Booking ID");
        int bookingId = Integer.parseInt(sc.nextLine());

        System.out.println("Enter upi ID");
        int upiId = Integer.parseInt(sc.nextLine());

        System.out.println("Enter Flight Name");
        String flightName = sc.nextLine();

        bookingHistory.put(1 , bookingHistory);
    }
    public void cancleYourBooking(){

        System.out.println("Enter Your Booking Ticket");
        int bookingId = Integer.parseInt(sc.nextLine());
        System.out.println("Cancle your Ticket");
    }

    private boolean checkCancellationPolicy(int bookingid) {
        return bookingid % 2 == 0;
    }

}
