package com.course.class1.service;

import com.course.class1.dto.InstallmentDTO;

import java.util.List;

public interface AmortizationSystem {
    InstallmentDTO calculateInstallment(Integer installmentNumber, Long amount);
    List<InstallmentDTO> calculateInstallments(Integer installmentsNumber, Long totalAmount);
    String getName();
}
