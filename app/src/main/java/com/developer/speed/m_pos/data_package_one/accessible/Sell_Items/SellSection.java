package com.developer.speed.m_pos.data_package_one.accessible.Sell_Items;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;

import com.developer.speed.m_pos.R.id;
import com.developer.speed.m_pos.R.layout;

public class SellSection extends AppCompatActivity {
    TextInputEditText itemCode, itemName, itemQuantity;
    TextView itemPriceIndicator;
    Button nextItem;
    FloatingActionButton completeTransaction;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(layout.sell_layout);

    }

    @Override
    protected void onStart() {
        super.onStart();
        this.itemCode = this.findViewById(id.item_code);
        this.itemName = this.findViewById(id.item_name);
        this.itemQuantity = this.findViewById(id.item_quantity);
        this.itemPriceIndicator = this.findViewById(id.total_price_indicator);
        this.nextItem = this.findViewById(id.next_item);
        this.completeTransaction = this.findViewById(id.complete_transaction);
    }

    @Override
    protected void onResume() {
        super.onResume();

    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();

    }

    @Override
    protected void onStop() {
        super.onStop();
    }
}

