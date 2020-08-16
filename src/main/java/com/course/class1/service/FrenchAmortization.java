package com.course.class1.service;

import com.course.class1.dto.InstallmentDTO;

import java.util.ArrayList;
import java.util.List;

public class FrenchAmortization implements AmortizationSystem{

    private Long interest;
    private static final String FRENCH_NAME = "Sistema Frances";

    public FrenchAmortization(Long interest) {
        this.interest = interest;
    }

    @Override
    public InstallmentDTO calculateInstallment(Integer installmentNumber, Long amount) {
        return new InstallmentDTO(amount * this.interest, installmentNumber,installmentNumber * amount);

    }

    @Override
    public List<InstallmentDTO> calculateInstallments(Integer installmentsNumber, Long totalAmount) {
        List<InstallmentDTO> installments = new ArrayList<>();
        for(int i = 1 ; installmentsNumber >= i ; i++){
            installments.add(calculateInstallment(i, totalAmount));
        }
        return installments;
    }

    @Override
    public String getName() {
        return FRENCH_NAME;
    }
}
