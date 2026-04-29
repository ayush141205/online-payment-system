package com.example.payment.service;

public interface OnlinePayment {
    String processPayment(double amount);
    String generateReceipt();
}