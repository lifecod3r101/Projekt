package com.developer.speed.m_pos.DbRealm;

import io.realm.RealmModel;
import io.realm.annotations.RealmClass;
import io.realm.annotations.Required;

@RealmClass
public class AvailableItemDetails implements RealmModel {
    @Required
    public String itemCode;

    @Required
    public String itemName;


    public int itemQuantity;


    public double itemUnitPrice;

    public String itemCategory;


}
