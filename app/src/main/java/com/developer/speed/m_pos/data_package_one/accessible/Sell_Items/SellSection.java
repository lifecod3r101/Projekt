package com.developer.speed.m_pos.data_package_one.accessible.Sell_Items;


import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AlertDialog.Builder;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.developer.speed.m_pos.Main_Menu.MainMenu;
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
        Double itemPrice = Double.valueOf(this.itemPriceIndicator.getText().toString());
        String quantity = this.itemQuantity.getText().toString();
        int itQty = Integer.parseInt(quantity);
        Double totalPrice = itemPrice * itQty;
        this.itemPriceIndicator.setText("Ksh " + totalPrice);
        this.completeTransaction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (SellSection.this.itemCode.getText().toString().isEmpty() && SellSection.this.itemName.getText().toString().isEmpty() && SellSection.this.itemQuantity.getText().toString().isEmpty() || SellSection.this.itemName.getText().toString().isEmpty() && SellSection.this.itemQuantity.getText().toString().isEmpty() || SellSection.this.itemQuantity.getText().toString().isEmpty()) {
                    new Builder(SellSection.this.getApplicationContext()).setTitle("Required").setMessage("Sorry. Blank Fields prohibited").setNeutralButton("Ok", new OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();
                        }
                    });
                } else {
                    new Builder(SellSection.this.getApplicationContext()).setTitle("Confirm").setMessage("Are you sure you want to pay?").setPositiveButton("Yes", new OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    }).setNegativeButton("No", new OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();
                        }
                    });
                }
            }
        });
    }
    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Builder backDialog = new Builder(this.getApplicationContext());
        backDialog.setTitle("Cancel Transaction").setMessage("Do you want to cancel this transaction and go back to the main menu?").setPositiveButton("Yes", new OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Intent backIntent = new Intent(SellSection.this, MainMenu.class);
                SellSection.this.startActivity(backIntent);
                dialog.dismiss();
            }
        }).setNegativeButton("No", new OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
    }
}

