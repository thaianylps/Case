package com.example.antifraud.service;

import com.example.antifraud.dto.DadosPessoaisDataDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AntifraudService {

    @Autowired
    private ValidationService validationService;

    public boolean checkFraudRisk(String transactionId, double valor, String userId) {
          // Verificar se os dados da transação são válidos
          if (transactionId == null || transactionId.isEmpty()) {
            return true; // Risco de fraude se o ID da transação for inválido
        }
        if (userId == null || userId.isEmpty()) {
            return true; // Risco de fraude se o ID do usuário for inválido
        }
        if (valor <= 0) {
            return true; // Risco de fraude se o valor da transação for inválido
        }
        return false; // Sem risco de fraude
        return false;
    }

    public int avaliacaoPersonalData(DadosPessoaisDataDTO data) {
        return validationService.validateAndScore(data);
    }
}