package com.example.antifraud.service;

import com.example.antifraud.dto.DadosPessoaisDataDTO;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class ValidationService {

    public int validateAndScore(DadosPessoaisDataDTO data) {
        if (isDataInvalid(data)) {
            return 0;
        }
        return generateRandomScore();
    }

    private boolean isDataInvalid(DadosPessoaisDataDTO data) {
        if (data.getTransactionId() == null || data.getTransactionId().isEmpty()) {
            return true;
        }
        if (data.getUserId() == null || data.getUserId().isEmpty()) {
            return true;
        }
        // o valor está dentro de um intervalo aceitável sim ou não
        if (data.getValor() <= 0) {
            return true;
        }
        return false;
    }

    private int generateRandomScore() {
        Random random = new Random();
        return random.nextInt(11); // Gera um número aleatório entre 0 e 10
    }
}