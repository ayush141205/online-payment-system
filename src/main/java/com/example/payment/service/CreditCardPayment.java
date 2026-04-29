package com.example.payment.service;

public class CreditCardPayment implements OnlinePayment {
    private double amount;

    public String processPayment(double amount) {
        this.amount = amount;
        return "Credit Card Payment of ₹" + amount + " successful";
    }

    public String generateReceipt() {
        return "Receipt: Paid ₹" + amount + " via Credit Card";
    }
}