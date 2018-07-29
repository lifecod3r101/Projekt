package com.developer.speed.m_pos.Transactions;

public class TransactionItemProperties {
    String transactItemCode, transactItemName;
    int transactTotalQuantity;
    double transactTotalCost;

    public TransactionItemProperties(String transactItemCode, String transactItemName, int transactTotalQuantity, double transactTotalCost) {
        this.transactItemCode = transactItemCode;
        this.transactItemName = transactItemName;
        this.transactTotalQuantity = transactTotalQuantity;
        this.transactTotalCost = transactTotalCost;
    }

    public String getTransactItemCode() {
        return this.transactItemCode;
    }

    public void setTransactItemCode(String transactItemCode) {
        this.transactItemCode = transactItemCode;
    }

    public String getTransactItemName() {
        return this.transactItemName;
    }

    public void setTransactItemName(String transactItemName) {
        this.transactItemName = transactItemName;
    }

    public int getTransactTotalQuantity() {
        return this.transactTotalQuantity;
    }

    public void setTransactTotalQuantity(int transactTotalQuantity) {
        this.transactTotalQuantity = transactTotalQuantity;
    }

    public double getTransactTotalCost() {
        return this.transactTotalCost;
    }

    public void setTransactTotalCost(double transactTotalCost) {
        this.transactTotalCost = transactTotalCost;
    }
}
