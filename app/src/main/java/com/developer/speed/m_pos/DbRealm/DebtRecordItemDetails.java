package com.developer.speed.m_pos.DbRealm;

import io.realm.RealmModel;
import io.realm.RealmResults;
import io.realm.annotations.LinkingObjects;
import io.realm.annotations.RealmClass;

@RealmClass
public class DebtRecordItemDetails implements RealmModel {

    @LinkingObjects("debtRecordItemInfo")
    public final RealmResults<DebtRecordDetails> debtRecordInfo = null;
    public String debtItemCode;
    public String debtItemName;
    public int debtItemQuantity;
    public double debtItemTotalCost;


}
