package com.developer.speed.m_pos.Debt_Records;

import java.util.Date;

public class DebtRecordProperty
{
    String debtName;
    int debtPhone;
    Date debtDate;
    public DebtRecordProperty(String debtName,int debtPhone,Date debtDate)
    {
        this.debtName=debtName;
        this.debtPhone=debtPhone;
        this.debtDate=debtDate;
    }

    public String getDebtName()
    {
        return this.debtName;
    }

    public void setDebtName(String debtName)
    {
        this.debtName = debtName;
    }

    public int getDebtPhone()
    {
        return this.debtPhone;
    }

    public void setDebtPhone(int debtPhone)
    {
        this.debtPhone = debtPhone;
    }

    public Date getDebtDate()
    {
        return this.debtDate;
    }

    public void setDebtDate(Date debtDate)
    {
        this.debtDate = debtDate;
    }
}

