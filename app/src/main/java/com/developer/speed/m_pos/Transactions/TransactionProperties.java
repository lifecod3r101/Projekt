package com.developer.speed.m_pos.Transactions;

import java.util.Date;

public class TransactionProperties {
    private String transactionCode;
    private Date transactionDate;
    private Double transactionCost;

    public String getTransactionCode() {
        return this.transactionCode;
    }

    public void setTransactionCode(String transactionCode) {
        this.transactionCode = transactionCode;
    }

    public Date getTransactionDate() {
        return this.transactionDate;
    }

    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }

    public Double getTransactionCost() {
        return this.transactionCost;
    }

    public void setTransactionCost(Double transactionCost) {
        this.transactionCost = transactionCost;
    }

    public TransactionProperties(String transactionCode, Date transactionDate, Double transactionCost)
    {
        this.transactionCode=transactionCode;
        this.transactionDate=transactionDate;
        this.transactionCost=transactionCost;
    }

}

