package com.bhagya.practice.model;

public class ConcessionTicket {

    int concessionTicketAmount = 0;
    int AgrProofId;

    public ConcessionTicket(int concessionTicketAmount, int agrProofId) {
        this.concessionTicketAmount = concessionTicketAmount;
        this.AgrProofId = agrProofId;
    }

    public ConcessionTicket() {

    }
}
