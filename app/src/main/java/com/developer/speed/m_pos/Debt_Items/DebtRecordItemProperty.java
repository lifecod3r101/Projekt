package com.developer.speed.m_pos.Debt_Items;

public class DebtRecordItemProperty
{
    String debtRecordItemCode, debtRecordItemName;
    int debtRecordItemQuantity;
    double debtRecordItemPrice;

    public DebtRecordItemProperty(String debtRecordItemCode, String debtRecordItemName, int debtRecordItemQuantity, double debtRecordItemPrice)
    {
        this.debtRecordItemCode=debtRecordItemCode;
        this.debtRecordItemName=debtRecordItemName;
        this.debtRecordItemQuantity=debtRecordItemQuantity;
        this.debtRecordItemPrice=debtRecordItemPrice;
    }

    public String getDebtRecordItemCode()
    {
        return debtRecordItemCode;
    }

    public void setDebtRecordItemCode(String debtRecordItemCode)
    {
        this.debtRecordItemCode = debtRecordItemCode;
    }

    public String getDebtRecordItemName()
    {
        return debtRecordItemName;
    }

    public void setDebtRecordItemName(String debtRecordItemName)
    {
        this.debtRecordItemName = debtRecordItemName;
    }

    public int getDebtRecordItemQuantity()
    {
        return debtRecordItemQuantity;
    }

    public void setDebtRecordItemQuantity(int debtRecordItemQuantity)
    {
        this.debtRecordItemQuantity = debtRecordItemQuantity;
    }

    public double getDebtRecordItemPrice()
    {
        return this.debtRecordItemPrice;
    }

    public void setDebtRecordItemPrice(double debtRecordItemPrice)
    {
        this.debtRecordItemPrice = debtRecordItemPrice;
    }
}

