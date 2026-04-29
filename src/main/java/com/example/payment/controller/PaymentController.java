package com.example.payment.controller;

import com.example.payment.service.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payment")
public class PaymentController {

    @PostMapping("/{type}")
    public String pay(@PathVariable String type, @RequestParam double amount) {

        OnlinePayment payment;

        switch (type.toLowerCase()) {
            case "upi":
                payment = new UPIPayment();
                break;
            case "card":
                payment = new CreditCardPayment();
                break;
            case "netbanking":
                payment = new NetBankingPayment();
                break;
            default:
                return "Invalid payment type";
        }

        return payment.processPayment(amount) + "\n" + payment.generateReceipt();
    }
}