package com.course.class1.Model;

import com.course.class1.dto.InstallmentDTO;
import com.course.class1.service.AmortizationSystem;

import java.util.List;

public class Credit {
    private List<InstallmentDTO> installments;
    private AmortizationSystem amortizationSystem;

    public Credit(Long totalAmount, Integer installmentsNumber, AmortizationSystem amortizationSystem) {
        this.amortizationSystem = amortizationSystem;
        this.installments = amortizationSystem.calculateInstallments(installmentsNumber, totalAmount);
    }

    @Override
    public String toString() {
        StringBuilder credit = new StringBuilder();
        credit.append("[SYSTEM NAME: ");
        credit.append(amortizationSystem.getName());
        credit.append("]\n");

        for (int i = 0; installments.size() > i; i++) {
            credit.append("[installment Number: ");
            credit.append(installments.get(i).getInstallmentNumber());
            credit.append(" - Amount: ");
            credit.append(installments.get(i).getAmount());
            credit.append(" - Interest: ");
            credit.append(installments.get(i).getInterest());
            credit.append("]\n");
        }
        return credit.toString();
    }
}
