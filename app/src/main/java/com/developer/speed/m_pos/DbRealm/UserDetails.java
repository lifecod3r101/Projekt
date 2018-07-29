package com.developer.speed.m_pos.DbRealm;

import io.realm.RealmList;
import io.realm.RealmModel;
import io.realm.annotations.PrimaryKey;
import io.realm.annotations.RealmClass;
import io.realm.annotations.Required;

@RealmClass
public class UserDetails implements RealmModel {
    @PrimaryKey
    public String identity;

    @Required
    public String nameEnt;

    @Required
    public String firstName, lastName;


    public int phoneNumber;

    public String emailAddress;

    @Required
    public String password;

    public RealmList<AvailableItemDetails> itemInfo;

    public RealmList<DebtRecordDetails> recordInfo;

    public RealmList<TransactionDetails> transactionInfo;


}
