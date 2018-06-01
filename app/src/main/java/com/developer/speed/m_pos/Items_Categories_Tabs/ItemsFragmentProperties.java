package com.developer.speed.m_pos.Items_Categories_Tabs;

public class ItemsFragmentProperties {
    String itemAvailableCode, itemAvailableName;
    int itemAvailableQuantity;
    double itemAvailablePrice;
    String itemAvailableCategory;

    public ItemsFragmentProperties(String itemAvailableCode, String itemAvailableName, int itemAvailableQuantity, double itemAvailablePrice, String itemAvailableCategory) {
        this.itemAvailableCode = itemAvailableCode;
        this.itemAvailableName = itemAvailableName;
        this.itemAvailableQuantity = itemAvailableQuantity;
        this.itemAvailablePrice = itemAvailablePrice;
        this.itemAvailableCategory = itemAvailableCategory;
    }

    public String getItemAvailableCode() {
        return itemAvailableCode;
    }

    public void setItemAvailableCode(String itemAvailableCode) {
        this.itemAvailableCode = itemAvailableCode;
    }

    public String getItemAvailableName() {
        return itemAvailableName;
    }

    public void setItemAvailableName(String itemAvailableName) {
        this.itemAvailableName = itemAvailableName;
    }

    public int getItemAvailableQuantity() {
        return itemAvailableQuantity;
    }

    public void setItemAvailableQuantity(int itemAvailableQuantity) {
        this.itemAvailableQuantity = itemAvailableQuantity;
    }

    public double getItemAvailablePrice() {
        return itemAvailablePrice;
    }

    public void setItemAvailablePrice(double itemAvailablePrice) {
        this.itemAvailablePrice = itemAvailablePrice;
    }

    public String getItemAvailableCategory() {
        return itemAvailableCategory;
    }

    public void setItemAvailableCategory(String itemAvailableCategory) {
        this.itemAvailableCategory = itemAvailableCategory;
    }
}
