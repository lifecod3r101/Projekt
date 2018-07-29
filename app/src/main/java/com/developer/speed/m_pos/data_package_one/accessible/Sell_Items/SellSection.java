package com.developer.speed.m_pos.data_package_one.accessible.Sell_Items;


import android.content.DialogInterface;
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

import com.developer.speed.m_pos.Debt_Creator.DebtCreator;
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
        setContentView(layout.sell_layout);
    }

    @Override
    protected void onStart() {
        super.onStart();
        itemCode = findViewById(id.item_code);
        itemName = findViewById(id.item_name);
        itemQuantity = findViewById(id.item_quantity);
        itemPriceIndicator = findViewById(id.total_price_indicator);
        nextItem = findViewById(id.next_item);
        completeTransaction = findViewById(id.complete_transaction);
    }

    @Override
    protected void onResume() {
        super.onResume();
        Double itemPrice = Double.valueOf(itemPriceIndicator.getText().toString());
        String quantity = itemQuantity.getText().toString();
        int itQty = Integer.parseInt(quantity);
        Double totalPrice = itemPrice * itQty;
        itemPriceIndicator.setText("Ksh " + totalPrice);
        completeTransaction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (itemCode.getText().toString().isEmpty() && itemName.getText().toString().isEmpty() && itemQuantity.getText().toString().isEmpty() || itemCode.getText().toString().isEmpty() && itemName.getText().toString().isEmpty() || itemCode.getText().toString().isEmpty() || itemName.getText().toString().isEmpty() || itemQuantity.getText().toString().isEmpty()) {
                    new Builder(SellSection.this.getApplicationContext()).setTitle("Required").setMessage("Sorry. Blank Fields prohibited").setNeutralButton("Ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();
                        }
                    });
                } else {
                    new Builder(SellSection.this.getApplicationContext()).setTitle("Confirm").setMessage("Are you sure you want to pay?").setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();
                        }
                    }).setNegativeButton("No", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();
                        }
                    });
                }
            }
        });
        completeTransaction.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                if (itemCode.getText().toString().isEmpty() && itemName.getText().toString().isEmpty() && itemQuantity.getText().toString().isEmpty() || itemCode.getText().toString().isEmpty() && itemName.getText().toString().isEmpty() || itemCode.getText().toString().isEmpty() || itemName.getText().toString().isEmpty() || itemQuantity.getText().toString().isEmpty()) {
                    new Builder(SellSection.this.getApplicationContext()).setTitle("Required").setMessage("Sorry. Blank Fields prohibited").setNeutralButton("Ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();
                        }
                    });
                } else {
                    SellSection.this.startActivity(new Intent(SellSection.this, DebtCreator.class));
                }
                return true;
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
        Builder backDialog = new Builder(getApplicationContext());
        backDialog.setTitle("Cancel Transaction").setMessage("Do you want to cancel this transaction and go back to the main menu?").setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                SellSection.this.startActivity(new Intent(SellSection.this, MainMenu.class));
                dialog.dismiss();
            }
        }).setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
    }
}