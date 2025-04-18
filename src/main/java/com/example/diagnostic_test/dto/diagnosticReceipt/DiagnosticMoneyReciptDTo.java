package com.example.diagnostic_test.dto.diagnosticReceipt;

import com.example.diagnostic_test.dto.DiagonesticTestDTO;
import com.example.diagnostic_test.dto.DoctorsDTO;

import java.time.LocalDateTime;
import java.util.List;

public class DiagnosticMoneyReciptDTo {


    private String patientName;
    private Integer age;
    private String sex;
    private String mobile;

    private String createdBy;
    private double totalAmount;
    private double discount;
    private double payableAmount;
    private double paidAmount;
    private double dueAmount;

    private Long refBy;
    private List<DiagonesticTestDTO> diagonesticTests;

    private LocalDateTime createdAt;


    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getPayableAmount() {
        return payableAmount;
    }

    public void setPayableAmount(double payableAmount) {
        this.payableAmount = payableAmount;
    }

    public double getPaidAmount() {
        return paidAmount;
    }

    public void setPaidAmount(double paidAmount) {
        this.paidAmount = paidAmount;
    }

    public double getDueAmount() {
        return dueAmount;
    }

    public void setDueAmount(double dueAmount) {
        this.dueAmount = dueAmount;
    }

    public Long getRefBy() {
        return refBy;
    }

    public void setRefBy(Long refBy) {
        this.refBy = refBy;
    }

    public List<DiagonesticTestDTO> getDiagonesticTests() {
        return diagonesticTests;
    }

    public void setDiagonesticTests(List<DiagonesticTestDTO> diagonesticTests) {
        this.diagonesticTests = diagonesticTests;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }
}
