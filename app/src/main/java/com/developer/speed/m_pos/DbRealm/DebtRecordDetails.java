package com.developer.speed.m_pos.DbRealm;

import java.util.Date;

import io.realm.RealmList;
import io.realm.RealmModel;
import io.realm.annotations.PrimaryKey;
import io.realm.annotations.RealmClass;
import io.realm.annotations.Required;

@RealmClass
public class DebtRecordDetails implements RealmModel {
    @PrimaryKey
    public String debtIdentity;

    @Required
    public String debtCustName;


    public int debtCustPhone;

    @Required
    public Date debtCustDatePay;

    public double amtToPay;

    public RealmList<DebtRecordItemDetails> debtRecordItemInfo;

}
