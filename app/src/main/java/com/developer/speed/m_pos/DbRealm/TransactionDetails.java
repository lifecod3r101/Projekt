package com.developer.speed.m_pos.DbRealm;

import java.util.Date;

import io.realm.RealmList;
import io.realm.RealmModel;
import io.realm.annotations.PrimaryKey;
import io.realm.annotations.RealmClass;


@RealmClass
public class TransactionDetails implements RealmModel {
    @PrimaryKey
    public String transactionCode;

    public Date transactionDate;

    public Double transactionCost;

    public RealmList<UserDetails> userInfo;


    public RealmList<TransactionItemDetails> transactionItemInfo;


}
