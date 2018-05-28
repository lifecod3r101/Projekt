package com.developer.speed.m_pos;

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
        return debtName;
    }

    public void setDebtName(String debtName)
    {
        this.debtName = debtName;
    }

    public int getDebtPhone()
    {
        return debtPhone;
    }

    public void setDebtPhone(int debtPhone)
    {
        this.debtPhone = debtPhone;
    }

    public Date getDebtDate()
    {
        return debtDate;
    }

    public void setDebtDate(Date debtDate)
    {
        this.debtDate = debtDate;
    }
}

