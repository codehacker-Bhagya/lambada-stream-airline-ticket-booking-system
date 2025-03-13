package com.bhagya.practice.model;

public class Passenger {

    private String fullName;
    private long MoNo;
    private long UIDno;

    public Passenger(String fullName, long moNo, long UIDno) {
        this.fullName = fullName;
        this.MoNo = moNo;
        this.UIDno = UIDno;
    }

    public Passenger() {

    }

    public void displayPassenger(){
        System.out.println("Full Name" + fullName + "Contact No" + MoNo + "UID No" + UIDno);
    }

    public void put(int i, Passenger passenger) {

    }

}
