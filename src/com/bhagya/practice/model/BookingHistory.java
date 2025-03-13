package com.bhagya.practice.model;

public class BookingHistory {
    private int bookingid;
    private int upiid;
    private String flightName;

    public BookingHistory(int bookingid, String flightName, int upiid) {
        this.bookingid = bookingid;
        this.flightName = flightName;
        this.upiid = upiid;
    }

    public BookingHistory() {

    }

    public void put(int i, BookingHistory bookingHistory) {

    }
}
