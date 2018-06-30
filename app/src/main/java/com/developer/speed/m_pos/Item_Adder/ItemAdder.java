package com.developer.speed.m_pos.Item_Adder;

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

import com.developer.speed.m_pos.R.id;
import com.developer.speed.m_pos.R.layout;
import com.developer.speed.m_pos.data_package_one.accessible.Items_Categories_Tabs.ItemCategoryDisplayer;

public class ItemAdder extends AppCompatActivity {
    TextInputEditText newCode, newName, newQuantity, newUnitPrice, newCategory;
    FloatingActionButton addItem;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(layout.item_adder_layout);
    }

    @Override
    protected void onStart() {
        super.onStart();
        this.newCode = this.findViewById(id.item_code_adder);
        this.newName = this.findViewById(id.item_name_adder);
        this.newQuantity = this.findViewById(id.item_quantity_adder);
        this.newUnitPrice = this.findViewById(id.item_price_adder);
        this.newCategory = this.findViewById(id.item_category_adder);
        this.addItem = this.findViewById(id.add_item);
    }

    @Override
    protected void onResume() {
        super.onResume();
        this.addItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ItemAdder.this.newCode.getText().toString().isEmpty() && ItemAdder.this.newName.getText().toString().isEmpty() && ItemAdder.this.newQuantity.getText().toString().isEmpty() && ItemAdder.this.newUnitPrice.getText().toString().isEmpty() || ItemAdder.this.newCode.getText().toString().isEmpty() && ItemAdder.this.newName.getText().toString().isEmpty() && ItemAdder.this.newQuantity.getText().toString().isEmpty() || ItemAdder.this.newCode.getText().toString().isEmpty() && ItemAdder.this.newName.getText().toString().isEmpty() || ItemAdder.this.newCode.getText().toString().isEmpty() || ItemAdder.this.newName.getText().toString().isEmpty() || ItemAdder.this.newQuantity.getText().toString().isEmpty() || ItemAdder.this.newUnitPrice.getText().toString().isEmpty()) {
                    new Builder(ItemAdder.this.getBaseContext()).setTitle("Required").setMessage("Sorry. Blank Fields not Allowed").setNeutralButton("Ok", new OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();
                        }
                    });
                } else if (!ItemAdder.this.newCategory.getText().toString().isEmpty()) {
                    new Builder(ItemAdder.this.getBaseContext()).setTitle("Confirm").setMessage("Do you want to add this item to this category? If the category does not exist, it will be created").setPositiveButton("Yes", new OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();
                        }
                    }).setNegativeButton("No", new OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();
                        }
                    });
                } else {
                    new Builder(ItemAdder.this.getBaseContext()).setTitle("Confirm").setMessage("Do you want to add this item?").setPositiveButton("Yes", new OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                            dialog.dismiss();
                            ItemAdder.this.startActivity(new Intent(ItemAdder.this, ItemCategoryDisplayer.class));
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
    public void onBackPressed() {
        super.onBackPressed();
        this.startActivity(new Intent(this, ItemCategoryDisplayer.class));
    }
}
