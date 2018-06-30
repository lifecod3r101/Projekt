package com.developer.speed.m_pos.Main_Menu;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.View.OnClickListener;

import com.developer.speed.m_pos.Debt_Records.DebtRecord;
import com.developer.speed.m_pos.R.id;
import com.developer.speed.m_pos.R.layout;
import com.developer.speed.m_pos.Transactions.TransactionSection;
import com.developer.speed.m_pos.data_package_one.accessible.Items_Categories_Tabs.ItemCategoryDisplayer;
import com.developer.speed.m_pos.data_package_one.accessible.Sell_Items.SellSection;

import java.util.ArrayList;
import java.util.List;


public class MainMenu extends AppCompatActivity
{
    RecyclerView menuRecycler;
    MenuLayoutAdapter menuAdapter;
    List<MenuLayoutCardProperty> menuList;
    CardView menuCard;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        this.setContentView(layout.menu_layout_recycler);
        this.menuList = new ArrayList<>();
        this.menuRecycler = this.findViewById(id.menu_recycler);
        this.menuRecycler.setHasFixedSize(true);
        this.menuRecycler.setLayoutManager(new LinearLayoutManager(this));
    }

    @Override
    protected void onStart() {
        super.onStart();
        this.menuCard = this.findViewById(id.menu_card);
        this.menuList.add(new MenuLayoutCardProperty("Sell"));
        this.menuList.add(new MenuLayoutCardProperty("Debts"));
        this.menuList.add(new MenuLayoutCardProperty("Items"));
        this.menuList.add(new MenuLayoutCardProperty("Transactions"));
        this.menuList.add(new MenuLayoutCardProperty("Premium"));
        this.menuAdapter = new MenuLayoutAdapter(this, this.menuList);
        this.menuRecycler.setAdapter(this.menuAdapter);
    }

    @Override
    protected void onResume() {
        super.onResume();
        this.menuCard.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (MenuLayoutCardProperty.menuItem) {
                    case "Sell":
                        MainMenu.this.startActivity(new Intent(MainMenu.this, SellSection.class));
                        break;
                    case "Debts":
                        MainMenu.this.startActivity(new Intent(MainMenu.this, DebtRecord.class));
                        break;
                    case "Items":
                        MainMenu.this.startActivity(new Intent(MainMenu.this, ItemCategoryDisplayer.class));
                        break;
                    case "Transactions":
                        MainMenu.this.startActivity(new Intent(MainMenu.this, TransactionSection.class));
                        break;
                    case "Premium":
                        break;
                    default:
                }
            }
        });
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
