package com.example.payment.service;

public class UPIPayment implements OnlinePayment {
    private double amount;

    public String processPayment(double amount) {
        this.amount = amount;
        return "UPI Payment of ₹" + amount + " successful";
    }

    public String generateReceipt() {
        return "Receipt: Paid ₹" + amount + " via UPI";
    }
}