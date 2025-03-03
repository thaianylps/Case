package com.example.antifraud.service;

import org.springframework.stereotype.Service;

@Service
public class AntifraudService {

    public boolean checkFraudRisk(String transactionId, double amount, String userId) {
        // Implement the logic to evaluate the risk of a transaction
        // For now, return false as a placeholder
        return false;
    }
}