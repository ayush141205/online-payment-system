package com.example.payment.service;

public class NetBankingPayment implements OnlinePayment {
    private double amount;

    public String processPayment(double amount) {
        this.amount = amount;
        return "Net Banking Payment of ₹" + amount + " successful";
    }

    public String generateReceipt() {
        return "Receipt: Paid ₹" + amount + " via Net Banking";
    }
}