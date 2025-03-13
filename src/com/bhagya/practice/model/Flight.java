package com.bhagya.practice.model;

public class Flight {

    private String FlightName;
    private int FlightNo;
    private int FlightTime;
    private String Destination;
    private int totalSeats;
    private int availableSeats;
    private String Status;

    public Flight(String flightName, int flightNo, int flightTime, String destination, String status,int titalSeats,int availableSeats) {
        this.FlightName = flightName;
        this.FlightNo = flightNo;
        this.FlightTime = flightTime;
        this.Destination = destination;
        this.Status = status;
        this.totalSeats = totalSeats;
        this.availableSeats = availableSeats;
    }

    public Flight(String s) {

    }
}
