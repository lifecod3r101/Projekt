package com.developer.speed.m_pos.Item_Adder;

import android.content.DialogInterface;
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
        setContentView(layout.item_adder_layout);
    }

    @Override
    protected void onStart() {
        super.onStart();
        newCode = findViewById(id.item_code_adder);
        newName = findViewById(id.item_name_adder);
        newQuantity = findViewById(id.item_quantity_adder);
        newUnitPrice = findViewById(id.item_price_adder);
        newCategory = findViewById(id.item_category_adder);
        addItem = findViewById(id.add_item);
    }

    @Override
    protected void onResume() {
        super.onResume();
        addItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (newCode.getText().toString().isEmpty() && newName.getText().toString().isEmpty() && newQuantity.getText().toString().isEmpty() && newUnitPrice.getText().toString().isEmpty() || newCode.getText().toString().isEmpty() && newName.getText().toString().isEmpty() && newQuantity.getText().toString().isEmpty() || newCode.getText().toString().isEmpty() && newName.getText().toString().isEmpty() || newCode.getText().toString().isEmpty() || newName.getText().toString().isEmpty() || newQuantity.getText().toString().isEmpty() || newUnitPrice.getText().toString().isEmpty()) {
                    new Builder(ItemAdder.this.getBaseContext()).setTitle("Required").setMessage("Sorry. Blank Fields not Allowed").setNeutralButton("Ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();
                        }
                    });
                } else if (!newCategory.getText().toString().isEmpty()) {
                    new Builder(ItemAdder.this.getBaseContext()).setTitle("Confirm").setMessage("Do you want to add this item to this category? If the category does not exist, it will be created").setPositiveButton("Yes", new DialogInterface.OnClickListener() {
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
                } else {
                    new Builder(ItemAdder.this.getBaseContext()).setTitle("Confirm").setMessage("Do you want to add this item?").setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                            dialog.dismiss();
                            ItemAdder.this.startActivity(new Intent(ItemAdder.this, ItemCategoryDisplayer.class));
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
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(this, ItemCategoryDisplayer.class));
    }
}
