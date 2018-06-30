package com.developer.speed.m_pos.Category_Items;

public class CategoryItemProperties {
    String itemCatCode, itemCatName;
    int itemCatQuantity;
    double itemCatPrice;


    public CategoryItemProperties(String itemCatCode, String itemCatName, int itemCatQuantity, double itemCatPrice) {
        this.itemCatCode = itemCatCode;
        this.itemCatName = itemCatName;
        this.itemCatQuantity = itemCatQuantity;
        this.itemCatPrice = itemCatPrice;
    }

    public String getItemCatCode() {
        return this.itemCatCode;
    }

    public void setItemCatCode(String itemCatCode) {
        this.itemCatCode = itemCatCode;
    }

    public String getItemCatName() {
        return this.itemCatName;
    }

    public void setItemCatName(String itemCatName) {
        this.itemCatName = itemCatName;
    }

    public int getItemCatQuantity() {
        return this.itemCatQuantity;
    }

    public void setItemCatQuantity(int itemCatQuantity) {
        this.itemCatQuantity = itemCatQuantity;
    }

    public double getItemCatPrice() {
        return itemCatPrice;
    }

    public void setItemCatPrice(double itemCatPrice) {
        this.itemCatPrice = itemCatPrice;
    }

}

