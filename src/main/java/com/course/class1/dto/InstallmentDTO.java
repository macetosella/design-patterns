package com.course.class1.dto;

public class InstallmentDTO {
    private Long interest;
    private Integer installmentNumber;
    private Long amount;



    public InstallmentDTO(Long interest, Integer installmentNumber, Long amount) {
        this.interest = interest;
        this.installmentNumber = installmentNumber;
        this.amount = amount;
    }

    public Long getInterest() {
        return interest;
    }

    public void setInterest(Long interest) {
        this.interest = interest;
    }

    public Integer getInstallmentNumber() {
        return installmentNumber;
    }

    public void setInstallmentNumber(Integer installmentNumber) {
        this.installmentNumber = installmentNumber;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }
}
