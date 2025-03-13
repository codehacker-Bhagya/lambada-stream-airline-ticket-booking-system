package com.bhagya.practice.model;

public class BillingAndCancellation {
    private String PaymentMethod;
    private int Upiid;

    public BillingAndCancellation(String paymentMethod, int upiid) {
        this.PaymentMethod = paymentMethod;
        this.Upiid = upiid;
    }

    public BillingAndCancellation() {

    }

    public void billimgMethod(){
        System.out.println("Payment Method " + PaymentMethod + "Upi id " + Upiid);
    }
}
