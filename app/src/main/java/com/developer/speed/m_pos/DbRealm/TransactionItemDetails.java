package com.developer.speed.m_pos.DbRealm;


import io.realm.RealmModel;
import io.realm.RealmResults;
import io.realm.annotations.LinkingObjects;
import io.realm.annotations.RealmClass;

@RealmClass
public class TransactionItemDetails implements RealmModel {
    @LinkingObjects("transactionItemInfo")
    public final RealmResults<TransactionDetails> transactionInfo = null;
    public String transItemCode;
    public String transItemName;
    public int transItemQuantity;
    public double transItemPrice;

}
