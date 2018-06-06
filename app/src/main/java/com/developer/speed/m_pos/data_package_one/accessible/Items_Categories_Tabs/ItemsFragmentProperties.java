package com.developer.speed.m_pos.data_package_one.accessible.Items_Categories_Tabs;

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
        return this.itemAvailableCode;
    }

    public void setItemAvailableCode(String itemAvailableCode) {
        this.itemAvailableCode = itemAvailableCode;
    }

    public String getItemAvailableName() {
        return this.itemAvailableName;
    }

    public void setItemAvailableName(String itemAvailableName) {
        this.itemAvailableName = itemAvailableName;
    }

    public int getItemAvailableQuantity() {
        return this.itemAvailableQuantity;
    }

    public void setItemAvailableQuantity(int itemAvailableQuantity) {
        this.itemAvailableQuantity = itemAvailableQuantity;
    }

    public double getItemAvailablePrice() {
        return this.itemAvailablePrice;
    }

    public void setItemAvailablePrice(double itemAvailablePrice) {
        this.itemAvailablePrice = itemAvailablePrice;
    }

    public String getItemAvailableCategory() {
        return this.itemAvailableCategory;
    }

    public void setItemAvailableCategory(String itemAvailableCategory) {
        this.itemAvailableCategory = itemAvailableCategory;
    }
}
